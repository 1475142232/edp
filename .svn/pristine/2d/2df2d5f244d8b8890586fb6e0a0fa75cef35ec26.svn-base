  KISSY.add("tree-module/src/showTree",function (S,Event,Tree,IO,Data,Form,Node,AlertDialog, Overlay,Menu,Toolbar,Editor,Cookie){
	 function ShowTree() {
        var _this = this;
        var tree;
        var alertDialog = new AlertDialog();
        var item;
//      var showModule = new ShowModule();
        var productId;
        var cookie = new Cookie();
        /**
         *  zhang_cancan
         */
        this.init = function(){
        	var treeTeamId=cookie.getCookie("teamId");
        	_this.GoProduct(treeTeamId);
        }
        
        
        /**
         * select项目 
         */
        this.GoProduct = function(teamId){
        	$.ajax({
	             type: "POST",
	             url: "productController/productList.action",
	             async: false,
	             dataType: "json",
	             data:{
	            	 teamId : teamId
	             },
	             success: function(data){
	            	 var select = "";
	            	 for(var i=0;i<data.length;i++){
	            		 select+=' <option value="'+data[i].id+'">'+data[i].productName+'</option>';
	            	 }
	            	 $("#product_select").html(select);
	            	 if(data.length!=0){
                         _this.GoTree(data[0].id);
	            	 }else{
	            		 alert("请先创建项目");
	            	 }
	             }
        	});
        }
        /**
         * 树的方法
         */
        this.GoTree=function(id){
     	   
        	productId = id;
        	var data=new Array();
             /**
              * 树叶
              */ 
        	IO({
                url: 'TreeController/findTreeById.action',
                type: "post",
                data: {
                	productId:productId
                },
                dataType: 'json',
                cache: false,
                async: false,
                success: function (date) {
                	data.push(date);
                },
                error: function (XMLHttpRequest, textStatus, errorThrown) {
                }
            });
             /**
              * 树内容方法
              */      
             var tree = new Tree.TreeList({
                 render :'#tree',
                 showLine : true,
                 height: '97%',
                 nodes : data
             });
             tree.render();
             /**
              * 单击事件
              */
//             tree.on('itemclick',function(ev){
//            	Node.one("#t2").removeAttr("style");
//            	Node.all("#t7").hide();
//                item = ev.item;
//                tree.expandNode(item);
//             	$("#t3").show();
//            	Node.all("#t5").html("");
//                var callback=function(Node){
//        			var selectedNode = tree.getSelected();
//        			selectedNode.text=Node.text;
//        			store.update(selectedNode);
//        		}
//                if(item.treeNodeType==8){//场景
//                	showModule.addModuleActivitiManager(item,_this.callback,item.treeNodeState,type);
//                }else if(item.treeNodeType==11){//功能流程图
//                	showModule.addModuleActivitiManager(item,_this.callback,item.treeNodeState,type);
//                }else if(item.treeNodeType==7){//功能
//                	showModule.editFunctionListManager(item,callback,version,type);
//                }else if(item.treeNodeType==9){
//                	showModule.editTableListManager(item,callback,version,type);
//                }else if(item.treeNodeType==10){
//                	showModule.editColumnListManager(item,callback,version,type);
//                }else if(item.treeNodeType==12){
//                	showModule.findPicById(item,_this.callback,version,type);
//                }
//
//             });   
          }     
 		  
	 }
      
	 return ShowTree;
      
},  {requires: [
                'event',
                'bui/tree',
                'io',
                'bui/data',
                'bui/form',
                'node',
                'common-module/src/alertDialog',
                'bui/overlay',
                'bui/menu',
                'bui/toolbar',
                'bui/editor',
                'common-module/src/cookie'
               ]});