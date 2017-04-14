/**
 * 国际化
 */
KISSY.add('common-module/src/i18n',function(S,IO,Node,Json){
	function I18N(){
		var _this = this;
		var messageResource = Json.parse(Node.all("#messageResource").attr("message")); 
		this.getMessageResource = function(){
			var param = {locale:'CN'};
			new IO({
				url:'i18NController/getMessageResource.action',
				type:'get',
				data:param,
				async:false,
				success:function(data){
					Node.all("#messageResource").attr("message",data);
					messageResource = Json.parse(Node.all("#messageResource").attr("message")); 
				},
				error:function(){
				}
			});
		};
		this.renderMessage = function(param){
			var i = 0;
			for(i;i<param.length;i++){
				for(var n in param[i]){
					var nodeId = "#"+n;
					var nodeList = Node.all(nodeId);
					if(typeof nodeList !== undefined){
						nodeList.each(function(node){
							_this.execNode(node,param[i][n]);
						});
					}
				}
			}
		};
		this.execNode = function(node,param){
			var nodeName = node.getDOMNode().nodeName;
			if("input" === nodeName || "INPUT" ===nodeName || "button"===nodeName || "BUTTON" ===nodeName){
				node.val(messageResource[param]);
			}else{
				node.html( messageResource[param]);
			}
		};
		this.getMessageByKey = function(key){
			return messageResource[key];
		};
	}
	return I18N;
},{
	requires : ['io','node','json']
});