KISSY.add('common-module/src/ajax-filter',function(S, Node,IO,Json,Event,Overlay) {
     function AjaxFilter() {
    	 var _index = 0;
    	 IO.on("complete",function(result){
    		 if(undefined != result.io && result.io.status == 800){
    				var params = result.io.responseHeadersString.split('\r\n');
    				var location = '';
    				for(var index in params ){
    					var loca = params[index];
    					if(loca.indexOf('Location') >= 0 
    							|| loca.indexOf('location') >= 0 ){
    						location = loca.replace('Location','');
    						location = location.replace('location','');
    						location = location.replace(':','');
    						break;
    					}
    				}
    				_index++;
    				if(_index===1){
    					if(S.isEmptyObject(Node.all("#closeNewsDialog").html())){
    					var navNewsModel = new Overlay.Dialog({
						    title : '信息提示框',
						    width : 350,
						    height : 220,
						    mask : true, // 模态显示，默认选项o
						    headerContent : '<div id="tsNews" style="line-height:45px;height:45px;" ><label style="height:45px;line-height:45px;font-size:18px;color:#999999;padding-left:14px;float:left">提示信息</label><span class="close" id="closeNewsDialog">&nbsp;</span></div>',
						    headerStyle : {
						    	height:'45px',
							    backgroundColor:'#f5f7fa',
							    borderBottom:'2px solid #cc0000'
						    },
						    closeAction : 'destroy',
						    bodyStyle : {
						      border : 'none',
						      height : '90px',
						      margin:0
						    },
						    elStyle : {
						      border : '2px solid #999999'
						    },
						    footerStyle : {
						      height:'65px',
						      margin:0,
						      textAlign:'center'
						    },
						    buttons : [{
						      text : '&nbsp;',
						      elCls : 'dialog_buttonOk',
						      handler : function() {
    					    	  window.location.href = location;
    					    	  this.close();
						      }
						    },{
							      text : '&nbsp;',
							      elCls : 'dialog_buttonNo',
							      handler : function() {
					    			  this.close();
							      }
							}],
						    bodyContent : '<div style="width:201px;line-height:90px;height:90px;background-color: #FFFFFF;margin:0 auto;"><img src="src/common-module/img/icon_warning.png" style="float: left;width: 24px;height: 24px;margin-top:32px;"><p style="font-size:15px;padding-left: 7px;float: left;">登录超时，请重新登录！</p></div>' 
						}); 
					    navNewsModel.show();
						$(".bui-ext-close").eq(0).remove();
						Node.all("#closeNewsDialog").on("click",function(){
    						//登录状态，置为失效
    				    	navNewsModel.close(); 
    				    	window.location.href = location;
    				    }); 
				   }
    			}
    		}
    	});
        
     };
    
    return AjaxFilter;
}, {
	requires : [ 'node','io','json','event','bui/overlay','common-module/css/base.css']
});
