KISSY.add('tree-module/src/showModule',function(S,Node, Event,IO,ModuleListManager,
		SceneListManager,FunctionListManager,TableListManager,ColumnListManager) {
	function ShowModule() {
		//测试模块管理
		this.showModuleListManager = function(item,version,type){
    		IO.get("views/module/showModule.html",null,function(){
    			Node.all("#t5").html(arguments[0], true);
    			var moduleListManager=new ModuleListManager();
	    		moduleListManager.initTreeData(item);
    	    },"html")
		}
		
		this.addModuleListManager = function(item,callback,i,version,type){
			IO.get("views/module/addModule.html",null,function(){
    			Node.all("#t5").html(arguments[0], true);
    			var moduleListManager=new ModuleListManager();
	    		moduleListManager.initTreeAdd(item,callback,i,type);
    	    },"html")
		}
		
		this.editModuleListManager = function(item,callback,version,type){
			IO.get("views/module/editModule.html",null,function(){
    			Node.all("#t5").html(arguments[0], true);
    			var moduleListManager=new ModuleListManager();
	    		moduleListManager.initTreeEdit(item,callback,type);
    	    },"html")
		}
		//场景 增 改 查
		this.showSceneListManager = function(item,version,type){
			IO.get("views/scene/showScene.html",null,function(){
				Node.all("#t5").html(arguments[0], true);
    			var sceneListManager=new SceneListManager();
    			sceneListManager.initTreeData(item);
			},"html")
		}
		
		this.addSceneListManager = function(item,callback,version,type){
			IO.get("views/scene/addScene.html",null,function(){
    			Node.all("#t5").html(arguments[0], true);
    			var sceneListManager=new SceneListManager();
    			sceneListManager.initTreeAdd(item,callback,version,type);
    	    },"html")
		}
		
		this.editSceneListManager = function(item,callbackII,version,type){
			IO.get("views/scene/editScene.html",null,function(){
    			Node.all("#t5").html(arguments[0], true);
    			var sceneListManager=new SceneListManager();
    			sceneListManager.initTreeEdit(item,callbackII,version,type);
    	    },"html")
		}
		//功能 增 改 查
		this.addFunctionListManager = function(item,callback,version,type){
			IO.get("views/function/addFunction.html",null,function(){
    			Node.all("#t5").html(arguments[0], true);
    			var functionListManager=new FunctionListManager();
    			functionListManager.initTreeAdd(item,callback,version,type);
    	    },"html")
		}
		
		this.showFunctionListManager = function(item,version,type){
			IO.get("views/function/showFunction.html",null,function(){
				Node.all("#t5").html(arguments[0], true);
				var functionListManager=new FunctionListManager();
				functionListManager.initTreeData(item);
			},"html")
		}
		
		this.editFunctionListManager = function(item,callback,version,type){
			IO.get("views/function/editFunction.html",null,function(){
    			Node.all("#t5").html(arguments[0], true);
    			var functionListManager=new FunctionListManager();
    			functionListManager.initTreeEdit(item,callback,version,type);
    	    },"html")
		}
		
		//数据 增删改
		this.addTableListManager = function(item,callback,type){
			IO.get("views/table/addTable.html",null,function(){
    			Node.all("#t5").html(arguments[0], true);
    			var tableListManager=new TableListManager();
    			tableListManager.initTreeAdd(item,callback,type);
    	    },"html")
		}
		
		this.showTableListManager = function(item,version,type){
			IO.get("views/table/showTable.html",null,function(){
				Node.all("#t5").html(arguments[0], true);
				var tableListManager=new TableListManager();
				tableListManager.initTreeData(item);
			},"html")
		}
		
		this.editTableListManager = function(item,callback,version,type){
			IO.get("views/table/editTable.html",null,function(){
    			Node.all("#t5").html(arguments[0], true);
    			var tableListManager=new TableListManager();
    			tableListManager.initTreeEdit(item,callback,version,type);
    	    },"html")
		}
		
		//字段的增删改查
		this.addColumnListManager = function(item,callback,version,type){
			IO.get("views/column/addColumnlist.html",null,function(){
    			Node.all("#t5").html(arguments[0], true);
    			var columnListManager = new ColumnListManager();
    			columnListManager.initTreeAdd(item,callback,version,type);
    	    },"html")
		}
		
		this.showColumnListManager= function(item,version,type){
			IO.get("views/column/showColumn.html",null,function(){
				Node.all("#t5").html(arguments[0], true);
				var columnListManager = new ColumnListManager();
    			columnListManager.initTreeData(item);
			},"html")
		} 
		
		this.editColumnListManager = function(item,callback,version,type){
			IO.get("views/column/editColumn.html",null,function(){
    			Node.all("#t5").html(arguments[0], true);
    			var columnListManager = new ColumnListManager();
    			columnListManager.initTreeEdit(item,callback,version,type);
    	    },"html")
		}
		
		this.addModuleActivitiManager = function(item,callback,version,type){
    		Node.all("#version").val(version); 
    		Node.all("#table_type").val(type); 
			Node.all("#t5").html('<iframe style="width: 100%;height: 100%;" src="activitiController/create.do?id='+ item.id + '&type=' + type + '&ttype=' + item.treeNodeType +'&version='+version+'"></iframe>');
		}
		//上传图片
		this.addPicListManager = function(item,callback,version,type){
			IO.get("views/prototype/prototype.html",null,function(){
    			Node.all("#t5").html(arguments[0], true);
    			var functionListManager=new FunctionListManager();
    			functionListManager.initFuncPic(item,callback,type);
    	    },"html")
		}
		//显示图片
		this.findPicById = function(item,callback,version,type){
			IO.get("views/prototype/showFuncPic.html",null,function(){
    			Node.all("#t5").html(arguments[0], true);
    			var functionListManager=new FunctionListManager();
    			functionListManager.findPicById(item);
    	    },"html")
		}
		
		this.addGroup = function(item,callback,version,type){
			IO.get("views/function/addGroup.html",null,function(){
				Node.all("#t5").html(arguments[0], true);
				var functionListManager=new FunctionListManager();
				functionListManager.addGroup(item,callback,version,type);
			},"html")
		}
		
	};
	return ShowModule;
}, {
	requires : ['node', 
	            'event', 
	            'io',
	            'module-module/src/modulelist',
	            'scene-module/src/scenelist',
	            'function-module/src/functionlist',
	            'table-module/src/tablelist',
	            'column-module/src/columnlist'
	            ]
})