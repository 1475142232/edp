KISSY.add('common-module/src/alertDialog', function(S, Overlay, Node,Event,Form) {
	function AlertDialog() {
	 var _this = this;
		//影像上传
		this.shadowMessage = function(callback_shadow,loadTitle) {
			var alertModelDialog = new Overlay.Dialog({
				title :'<span class="tsNewslabel" style="text-align: center;">'+loadTitle+'</span>',
				width : 450,
			    height : 220,
				mask : true,
				contentId:'shadowUpload',
				closeAction : 'destroy',
                buttons : [{
                    text : '确定',
                    elCls : 'dialog_buttonOk',
                    handler : function() {
                        if(null !== callback_shadow && callback_shadow !== ''){
                          callback_shadow();
                          document.getElementById("shadowForm").reset();
                        }
                        this.close();
                    }
                },{
                   text : '取消',
                   elCls : 'dialog_buttonNo',
                   handler : function(){
                      document.getElementById("shadowForm").reset();
                       this.close();
                   }
                }]
			});
			alertModelDialog.show();
			Node.all(".bui-ext-close").css("display","none");
		};
		
		this.showMessage = function(message,classStyle,href) {
			var alertModelDialog = new Overlay.Dialog({
				title : '&nbsp;',
				width : 350,
			    height : 220,
				mask : true, // 模态显示，默认选项
				headerContent : '<div style="text-align: center;font-size:16px;"><label class="tsNewslabel">提示信息</label></div>',
				closeAction : 'destroy',
				buttons : [ {
					text : '确定',
					elCls : 'dialog_buttonOk button button-danger button-large button-move',
					handler : function() {
						if(href!=="" && href!==undefined && href!==null){
							window.location.href=href;
						}
						this.close();
					}
				} ],
				bodyContent : '<div style="text-align: center;"><p class="bodyCdivp bodyCdivp'+classStyle+'">'+message+'</p></div>' 
			});
			
			alertModelDialog.show();
			
			Node.all(".bui-ext-close").css("display", "none");
		};
		
		this.showInMessage = function(callback_shadow,message,classStyle) {
			var alertModelDialog = new Overlay.Dialog({
				title : '&nbsp;',
				width : 420,
			    height : 220,
				mask : true,
				headerContent : '<div><label class="tsNewslabel">提示信息</label></div>',
				closeAction : 'destroy',
                buttons : [{
                    text : '确定',
                    elCls : 'dialog_buttonOk',
                    handler : function() {
                        if(null !== callback_shadow && callback_shadow !== ''){
                        	callback_shadow();
                        }
                        this.close();
                    }
                }],
                bodyContent : '<div><p class="bodyCdivp bodyCdivp'+classStyle+'">'+message+'</p></div>' 
			});
			alertModelDialog.show();
			Node.all(".bui-ext-close").css("display", "none");
		};
		
		this.showMessageCust = function(message,classStyle,width,height) {
			var alertModelDialog = new Overlay.Dialog({
				title : '&nbsp;',
				width : width,
			    height : height,
				mask : true, // 模态显示，默认选项
				headerContent : '<div><label class="tsNewslabel">提示信息</label></div>',
				closeAction : 'destroy',
				buttons : [ {
					text : '确定',
					elCls : 'dialog_buttonOk',
					handler : function() {
						this.close();
					}
				} ],
				bodyContent : '<div><p class="bodyCdivp bodyCdivp'+classStyle+'" style="height:18px"></p><p style="width:300px;height:150px;overflow:auto;">'+message+'</p></div>' 
			});
			
			alertModelDialog.show();
			
			Node.all(".bui-ext-close").css("display", "none");
		};
		
		//该dialog仅限一级银行管理员解除权限时使用
		this.showMessageByRole = function(message,classStyle) {
			var alertModelDialog = new Overlay.Dialog({
				title : '&nbsp;',
				width : 360,
			    height : 220,
				mask : true, // 模态显示，默认选项
				headerContent : '<div><label class="tsNewslabel">提示信息</label></div>',
				closeAction : 'destroy',
				buttons : [ {
					text : '确定',
					elCls : 'dialog_buttonOk',
					handler : function() {
						this.close();
					}
				} ],
				bodyContent : '<div><p class="bodyCdivp bodyCdivp1'+classStyle+'">'+message+'</p></div>' 
			});
			
			alertModelDialog.show();
			
			Node.all(".bui-ext-close").css("display", "none");
			
		};
		/**
		 * Confirm提示
		 * message  提示信息
		 * callback_success  回调函数
		 * classStyle 1：失败提示 2：成功提示 3：未明提示 4：疑问提示
		 */
		this.showConfirmMessage = function(message, callback_success,classStyle,callback_fail,btnOkName,btnCancelName) {
			var btn1Name = "确定";
			var btn2Name = "取消";
			if(btnOkName != null && typeof btnOkName != "undefined" && btnOkName !=""){
				btn1Name = btnOkName;
			}
			if(btnCancelName != null && typeof btnCancelName != "undefined" && btnCancelName !=""){
				btn2Name = btnCancelName;
			}
			var alertConfirmDialog = new Overlay.Dialog({
				title : '&nbsp;',
				width : 350,
			    height : 220,
				mask : true, // 模态显示，默认选项
				headerContent : '<div style="text-align: center;font-size:16px;"><label class="tsNewslabel">提示信息</label></div>',
				closeAction : 'destroy',
				buttons : [ {
					text : btn1Name,
					elCls : 'button button-danger button-large button-move',
					handler : function() {
						this.close();
						callback_success();
					}
				} ,{
				      text : btn2Name,
				      elCls : 'button button-large button-move',
				      handler : function() {
				    	  if(null!==callback_fail && ''!==callback_fail){
				    		  callback_fail();
				    	  }
		    			  this.close();
				      }
				}],
				bodyContent : '<div style="text-align: center"><p class="bodyCdivp bodyCdivp'+classStyle+'">'+message+'</p></div>' 
			});
			
			alertConfirmDialog.show();
			
			Node.all(".bui-ext-close").css("display", "none");
		};
		
		
		/**
		 * Confirm提示
		 * message  提示信息
		 * callback_success  回调函数
		 * classStyle 1：失败提示 2：成功提示 3：未明提示 4：疑问提示
		 */
		this.showConfirmMessageWithScroll = function(message, callback_success,classStyle,callback_fail) {
			var alertConfirmDialog = new Overlay.Dialog({
				title : '&nbsp;',
				width : 350,
			    height : 280,
				mask : true, // 模态显示，默认选项
				headerContent : '<div><label class="tsNewslabel">提示信息</label></div>',
				closeAction : 'destroy',
				buttons : [ {
					text : '确定',
					elCls : 'dialog_buttonOk',
					handler : function() {
						this.close();
						callback_success();
					}
				} ,{
				      text : '取消',
				      elCls : 'dialog_buttonNo',
				      handler : function() {
				    	  if(null!==callback_fail && ''!==callback_fail){
				    		  callback_fail();
				    	  }
		    			  this.close();
				      }
				}],
				bodyContent : '<div><p class="bodyCdivp bodyCdivp'+classStyle+'" style="height:18px"></p><p style="width:250px;height:140px;overflow:auto;">'+message+'</p></div>' 
			});
			
			alertConfirmDialog.show();
			
			Node.all(".bui-ext-close").css("display", "none");
		};
	}
	return AlertDialog;
}, {
	requires : ['bui/overlay', 'node','event','bui/form']
});