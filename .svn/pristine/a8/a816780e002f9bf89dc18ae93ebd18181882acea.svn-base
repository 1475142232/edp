  KISSY.add("activititree-module/src/activititree",function (S,Event,Tree,IO,Data,Form,Node,Cookie){
	 function ActivitiTree() {
        var _this = this;
        var cookie = new Cookie();
        var tree;
        var addForm = new Form.HForm({
	        srcNode : '#addFrom'
	      }).render();
        
        //功能分组和子功能添加
        Node.one("#Save_Module").on("click",function(){
    		var func_name = Node.one("#name").val();
    		var func_desc = Node.one("#desc").val();
    		if(addForm.isValid()){//校验名称输入的正确性
    			var data = {treeName: func_name,treeDesc: func_desc,treeId: cookie.getCookie("productId")};
    			IO({
    				url: "TreeController/addFunctionByTree.action?sceneId="+ cookie.getCookie("taskId"),
    				data: data,
    				type: "POST",
    				dataType: 'json',
    				cache: false,
    				async: false,
    				success: function (data) {
						renderTree(true);
    					//添加完成清空上次的选择
    					Node.one("#name").val("");
    					Node.one("#desc").val("");
    				},
    				error: function (XMLHttpRequest, textStatus, errorThrown) {
    				}
    			}); 
    		}
        });
        
        renderTree();
       
        /**
         * 渲染树列表
         * funcId 节点ID,新增功能刷新后使用
         */
        function renderTree(bool){
        	 Node.one("#atree").html("");//清空树
             Event.detach("#atree");//重置树关联
        	 var url = 'TreeController/findTreeByType.action?productId=' + cookie.getCookie("productId") + "&type=8";
        	 IO({
               url: url,
               type: "post",
               dataType: 'json',
               cache: false,
               async: false,
               success: function (data) {
                   if (data !== null && data !== undefined) {
                	   for (var i = 0; i < data.length; i++) {
                		   data[i].text = data[i].treeName;
                		   if(bool){
                			   window.parent.document.getElementById("treeCheckId").value = data[0].id;
       						   window.parent.document.getElementById("treeCheckName").value = data[0].treeName;
       						   window.parent.document.getElementById("treeCheckType").value = getParamString("type");
       						   data[0].checked = true;
                		   }else{
                			   if(window.parent.document.getElementById("treeCheckId").value === data[i].id){
                				   data[i].checked = true;
                			   }
                		   }
                	   }
                	   /**
                        * 树内容方法
                        */
                       tree = new Tree.TreeList({
                          render : '#atree',
                          showLine : true, 
                          height: '100%',
                          nodes : data,
                          isSpecialIcon: true,
                          checkType: 'all',
                          multipleCheck : false, //是否多选，非多选时使用radio
                          showRoot : false
                        });
                       tree.render();
                       
                       //树节点单选框勾选事件
                       tree.on('checkedchange',function(ev){
                      	 var checkedNodes = tree.getCheckedNodes();
                           BUI.each(checkedNodes,function(node){
                    		   window.parent.document.getElementById("treeCheckId").value = node.id;
                    		   window.parent.document.getElementById("treeCheckName").value = node.text;
                    		   window.parent.document.getElementById("treeCheckType").value = type;
                           });
                       });
                   }
               },
               error: function (XMLHttpRequest, textStatus, errorThrown) {
               }
           }); 
        }     
        
        /**
         * 获取地址栏url的参数
         * name 参数名称
         */
        function getParamString(name){
             var reg = new RegExp("(^|&)"+ name +"=([^&]*)(&|$)");
             var r = window.parent.location.search.substr(1).match(reg);
             if(r!=null)return  unescape(r[2]); return null;
        }
        

	 }
      
	 return ActivitiTree;
      
},  {requires: ['event',
                'bui/tree',
                'io',
                'bui/data',
                'bui/form',
                'node',
                'common-module/src/cookie'
               ]});