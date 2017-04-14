KISSY.add('common-module/src/ca',function(S,IO,AlertDialog,Json,CommonDom){
	function CA(){
		var _this = this;
		var source;
		var func;
		var fune;
		var actionUrl;
		var alertDialog = new AlertDialog();
		var common = new CommonDom();
		this.getSignature = function(){
			//CryptoAgent 插件加载不成功提示，退出签认流程
			if(typeof CryptoAgent.object === "undefined"){
				_this.callErrorFunction("需要安装网银插件或需要允许插件运行！刷新浏览器重新加载！");
				return;
			}
			new IO({
				type: "POST",
		  		url: 'caController/getCertInfo',
		  		dataType : "json",
		  		async : false,
		  		contentType : "application/json;charset=utf-8",
		  		success:function(data){
		  			if(data.flag){
		  				_this.verifySignature(data.result);
		  			}else{
		  				if(data.errorMessage ==="OFF"){
		  					_this.callSuccesFunction(null);
		  				}else{
		  					_this.callErrorFunction(data.errorMessage);
		  				}
		  			}
				},
				error:function(){
		  			_this.callErrorFunction("连接用户信息系统失败，请稍后重试！");
		  		}
			});
		};
		/**
		 * 证书选择  通过DN过滤  DN由tdg接口方法返回
		 * @param dn   证书主题  该参数通过调用sip或tdg接口取得
		 * mark usbkey驱动在usbkey拔除时从浏览器中删除证书。 正常情况下，无usbkey和插入和用户不匹配的key时无法过滤到证书 返回码5101 正常返回0 
		 */
		this.selectCertificate =function (dn) {
		    try {
		    	var subjectDNFilter = dn;
		        var snFilter = "";
		        var emailFilter = "";
		        var issuerDNFilter = "";
		        CryptoAgent.SetCertChooseType(1);//为了和老接口保持兼容性，而保留此函数。可以不调用。
		        var selectCertResult = CryptoAgent.SetCert("SC", subjectDNFilter, snFilter, emailFilter, issuerDNFilter, "");
		        if(selectCertResult===0){
		        	return true;
		        }else{
		        	return "用户证书匹配错误！请确认该USBKEY用户是否为登录用户或确认usbkey是否插入正常！";
		        }
		    }
		    catch (e) {
		    	return "错误信息：" + CryptoAgent.GetErrorMessage(CryptoAgent.GetErrorCode())+"\n错误信息："+e.message;
		    }
		};
		
		 this.checkExplorerAndPlugIn =function(){
				var nav = KISSY.UA.shell;
				if(nav !== 'ie'){
					alertDialog.showMessage("需要下载支持ie内核的插件来运行ACTIVEX！",1);
				}else{
					if(typeof CryptoAgent.object === "undefined"){
						alertDialog.showMessage("需要安装网银插件或需要允许插件运行！刷新浏览器重新加载提示窗口",1);
					}
				}
		};
		 
		
		 this.sign = function(source,algorithm) {
		     try {                    
		         var signature = "";
		         //设置摘要算法
		         CryptoAgent.SetAlgorithm(algorithm, "");
		         //生成加密摘要
		         signature = CryptoAgent.DetachSignStr("", source);
		         return signature;
		     } catch (e) {
		     	return "";
		     }
		 };
		 
		 this.verifySignature = function(data,func,fune){
				//加密算法
				var keyalg = data.keyalg;
				//证书主题
				var dn = data.dn;
				//证书id
				var uid = data.kid;
				//设置证书（根据拿到是证书信息去key里拿到唯一证书）
				var setCer = _this.selectCertificate(dn,fune);
				if(setCer === true){         //如果没有拿到正确的证书就不能产生签字
					//获取key签字
					var signature = _this.sign(_this.source,keyalg);
					//正常情况下 拿到签字  其他情况signature为空  异常情况为undefined还未遇到
					if(signature === "" || typeof signature === "undefined"){
						_this.callErrorFunction("业务中断，用户取消或确认usbkey是否插入正常！");
						return;
					}
					signature = signature.replace(/\+/g, "%2B");
					_this.callSuccesFunction(signature);
				}else{
					_this.callErrorFunction(setCer);
				}
			};
			
		 this.showTransMessage = function(funs,funf,func,jsondata,url){
			 _this.func = funs;
			 _this.fune = funf;
			 _this.actionUrl = url;
			 var jstr=Json.stringify(jsondata);
			 new IO({
					type: "POST",
			  		url: 'caController/getReportString',
			  		data:{"data":jstr},
			  		dataType : "json",
			  		async : false,
			  		success:function(result){
			  			if(result.source !== null && typeof result.source !== "undefined"){
			  				_this.source = result.source;
				  			alertDialog.showConfirmMessageWithScroll(result.message, _this.getSignature, 4, func);
			  			}else{
			  				common.redirect(304);
			  			}
			  			
					},
					error:function(result){
			  			_this.callErrorFunction("连接用户信息系统失败，请稍后重试！原因："+result);
			  		}
				});
		 };
		 
		 this.callSuccesFunction = function(sign){
			 var jsonData = {"signature":sign};
    		 new IO({
					type: "POST",
			  		url: _this.actionUrl,
			  		data:jsonData,
			  		dataType : "json",
			  		async : false,
			  		contentType : "application/json;charset=utf-8",
			  		success:function(result){
			  			if(typeof _this.func !== "undefined"){
							_this.func(result);
						}else{
							alertDialog.showMessage("业务流程中断！加载文件失败，请清除浏览器缓存后重试！",1);
						}
					},
					error:function(result){
						_this.callErrorFunction(result);
			  		}
				});
				
			};

			this.callErrorFunction = function(errorMsg){
				if(typeof _this.fune !== "undefined"){
					_this.fune(errorMsg);
				}else{
					alertDialog.showMessage(errorMsg,1);
				}
			};
	}
	return CA;
},{
	requires : ['io','common-module/src/alertDialog','json','common-module/src/common']
});