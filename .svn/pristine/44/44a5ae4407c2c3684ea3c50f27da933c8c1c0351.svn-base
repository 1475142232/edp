KISSY.add('common-module/src/common',function(S, Node, IO) {
    function CommonDom() {
    	var _this = this;
    	
    	this.ioFunction = function(url,param,async,dataType,callback_success){
    		var obj = {
    				url: url,
				    data: param,
				    type: "post",
				    dataType : dataType,
					async : async,
				    success: function(data){
				    	callback_success(data);
				    },
				    error:function(errorInfo){
				    	
				    }
    		};
    		
    		new IO(obj);
    	};
	    /**
	     * 后台校验结结果处理
	     */
	    this.checkDate = function (result,fun) {
	    	 if(result.validateResult === "true"){
	    		 if(result.object){ //update liuwh at 20150126,兼容返回BaseVo/JsonString处理
	    			 fun(result.object);	 
	    		 }else{
	    			 fun(result);
	    		 }
	    	 }else{
	    		 IO.get("views/common/validate.html",null,function(){
	    			 Node.all("#finaceright").html(arguments[0], true);
	    			 var message;
	    			 if(result.validateResult == "501"){
	    				 message = "输入不合法！";
	    				 _this.redirectToTop(5,'./');
	    			 }else if(result.validateResult == "304"){
	    				 message = "表单重复提交！";
	    				 _this.redirectToTop(5,'./');
	    			 }
	    			 Node.all("#msgInfo").html(message);
	    		 },"html");
	    	 }

	    };
	    
	    this.checkInput = function(url,param,async,dataType,callback_success){
	    	 new IO({
				    url: url,
				    data: param,
				    type: "post",
				    dataType : dataType,
					async : async,
				    success: function(data){
				    	callback_success(data);
				    },
				    error:function(data){
				    	_this.redirect(501);
				    }
 		     });
	    };
	    
	    this.redirect = function(result){
	    	IO.get("views/common/validate.html",null,function(){
   			 Node.all("#finaceright").html(arguments[0], true);
   			 var message;
   			 if(result ==501){
   				 message = "输入不合法！";
   				_this.redirectToTop(5,'./');
   			 }else if(result == 304){
   				 message = "表单重复提交！";
   				_this.redirectToTop(5,'./');
   			 }
   			 Node.all("#msgInfo").html(message);
   		 },"html");
	    };
	    
	    this.redirectToTop = function(secs,surl){
	    	var jumpTo = Node.all("#jumpTo");
	    	var si = setInterval(function(){
	    		jumpTo.html(secs--);
	    		if(secs == 0){
	    			clearInterval(si);
	    			location.href=surl;
	    		}
	    	},1000);
	    };
	    
	   	 /**
	   	  * 判断企业是否存在
	   	  */
	   	 this.enterpriseFlag=function(){
	   		 new IO({
					    url: "enterpriseInfoController/checkEpNameByOrgCode.action",
					    type: "post",
					    //dataType : "json",
						async : false,
						cache : false,
					    success: function(data){
					    	if(null===data || ""===data || '[]'===data || undefined===data){
					    		window.location.href="./userController/loginUser.action?Y2TuserName=2&Y2TepOrgCode=1";
					    	}else{
					    		_this.addEpUser();
					    	}
					    }
			      });
	   	 };
	   	 
	   	this.addEpUser=function(){
	   		 new IO({
					    url: "enterpriseInfoController/addEpUser.action",
					    type: "post",
					    dataType : "json",
						async : false,
						cache : false,
					    success: function(data){
					    	
					    }
			      });
	   	 };
	   	 
	   	 //获取resurce文件的值
	     this.getResourceValue=function(resourceName){
	     	var returnValue="";
	     	new IO({
	 		    url: "fincApplyController/getValue.action",
	 		    type: "post",
	 		    data:{name:resourceName},
	 		    //dataType : "json",
	 			async : false,
	 			cache : false,
	 		    success: function(data){
	 		    	if(null!==data && ""!==data && undefined!==data){
	 		    		returnValue=data;
	 		    	}
	 		    }
	       });
	     	return returnValue;
	     };
	     
	     /**
	      * 获取服务器时间
	      */
	     this.get_server_time = function(){  
	    	    var xmlHttp = false;  
	    	    //获取服务器时间  
	    	    try {  
	    	    xmlHttp = new ActiveXObject("Msxml2.XMLHTTP");  
	    	    } catch (e) {  
	    	        try {  
	    	            xmlHttp = new ActiveXObject("Microsoft.XMLHTTP");  
	    	        } catch (e2) {  
	    	            xmlHttp = false;  
	    	        }  
	    	    }  
	    	    if (!xmlHttp && typeof XMLHttpRequest != 'undefined') {
	    	        xmlHttp = new XMLHttpRequest();  
	    	    }  
	    	    xmlHttp.open("GET", window.location.href.toString(), false);
	    	    xmlHttp.setRequestHeader("If-None-Match", "bytes=-1");  
	    	    xmlHttp.setRequestHeader("Cache-Control","no-cache");  
	    	    xmlHttp.send(null);  
	    	    return new Date(xmlHttp.getResponseHeader("Date"));
	    	} 
    };
    
    return CommonDom;
}, {
	requires : [ 
	    'node',
	    'io'
	]
});
