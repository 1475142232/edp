KISSY.add("database-module/src/databaseList",function(S,IO, Cookie, DataTable){
	function DatabaseList(){
		var _this = this;
		var cookie = new Cookie();
		var userRole = "";
		var userBool = false;
		var baseProduct = [];
		
		this.init = function(){
			_this.getUserRole();//获取用户权限
			
			_this.getDatabaseList();
			
			if(userRole === "3" && userBool){
				_this.dataValidator();
				
				$("#save_Data").on("click",function(){
					$('#save_Form').bootstrapValidator('validate');
					if($('#save_Form').data('bootstrapValidator').isValid()){
						_this.saveDatabase();
					}
				});
			}
		}
		
	    this.getDatabaseList = function(){
			var teamId = cookie.getCookie("teamId");
			if(userRole === "3" && userBool){
				$("#databaseList").html('<a id="addDatabase" href="javascript:;" data-toggle="modal">+</a>');
			}else{
				$("#databaseList").html('<a id="addDatabase" href="javascript:;" data-toggle="modal" style="display:none;">+</a>');
			}
			//获取项目列表
			$.ajax({
	             type: "POST",
	             url: "DataController/findAllData.action?teamId="+teamId,
	             async: true,
	             dataType: "json",
	             success: function(data){
	            	 //console.log(data);
	             	 var add="";
                     for(var i=0; i<data.length; i++) {
                    	add += '<div class="myDatabase">';
                    	if(userRole === "3" && userBool){
                    		add += '<a class="books" style="cursor:pointer" id="books_'+data[i].id+'"></a>';
                    	}
    	             	add += '<a href="javascript:;" class="wode" id="'+data[i].id+'">'+data[i].dataName+'</a>';
                     	add += '<span class="product_name">'+_this.getProductById(data[i].productId)+'</span>';
                     	if(userRole === "3" && userBool){
	                     	add += '<dl id="dl_'+data[i].id+'"><dd class="togglelist" id="'+data[i].id+'" data-toggle="modal"><a href="javascript:;">'+'编辑'+'</a></dd>';
	                     	add += '<dd  class="togglelist2" id="'+data[i].id+'" data-toggle="modal"><a href="javascript:;">'+'删除'+'</a></dd><dl>';
                     	}
                     	add += '</div>';
                     }
                     $("#addDatabase").before(add);
                     
                     //跳转到表设计
     				 $(".wode").click(function(){
     					var dataId = this.id;
     					var dataName = $(this).html();
     		 			//我的项目跳转
     		 			IO.get("views/database/datatable.html",null,function(){
     		     			$("#mainpage").html(arguments[0], true);
     		     			var dataTable = new DataTable();
     		     			dataTable.init(dataId, dataName);
     		     			localStorage.setItem("dataId",dataId);
     		     			localStorage.setItem("dataName",dataName);
     		     			localStorage.setItem("target","datatable");
     		         	});
     				 });
     				if(userRole === "3" && userBool){
     					  //toggle
                		 $(".books").click(function(){
                			var ids = (this.id).split("_");
                			$("#dl_"+ids[1]).toggle();
                		 });
	                     //删除
	             		 $(".togglelist2").click(function(){
	             			$("#dl_" + this.id).toggle();
	             			 _this.delDatabase(this.id);
	             		 });
	             		 //编辑
	             		 $(".togglelist").click(function(){
	             			$("#dl_" + this.id).toggle();
	             			_this.editDatabase(this.id);
	             		 });
     				}
                  }
        	});
			if(userRole === "3" && userBool){
				//跳转到新建项目
		  		$("#addDatabase").click(function(){
		  			_this.addDatabase();
		  		});
			}
		}
	    
	    /**
	     * 表单验证
	     */
	    this.dataValidator = function(){
	    	$('#save_Form').bootstrapValidator({
	            message: 'This value is not valid',
	            feedbackIcons: {
	                valid: 'glyphicon glyphicon-ok',
	                invalid: 'glyphicon glyphicon-remove',
	                validating: 'glyphicon glyphicon-refresh'
	            },
	            fields: {
	            	dataName: {
	                    message: 'The username is not valid',
	                    validators: {
	                        notEmpty: {
	                            message: '请输入数据库名称!'
	                        },
	                        stringLength: {
	                            max: 20,
	                            message: '长度最大不能超过20!'
	                        },
	                        regexp: {
	                            regexp: /^[a-zA-Z0-9\u2E80-\u9FFF\.\_\-]+$/,
	                            message: '输入的名字格式错误!(只能输入汉字、字母、数字、.、_、-)'
	                        }
	                    }
	                },
	                productId: {
	                	validators: {
	                		notEmpty: {
	                            message: '请选择所属项目!'
	                        }
	                    }
	                },
	                dataDesc: {
	                    validators: {
	                    	stringLength: {
	                            max: 50,
	                            message: '长度最大不能超过50!'
	                        }
	                    }
	                }
	            }
	        });
	    }
	    
	    this.saveDatabase = function(){
			 //验证成功，保存数据
	    	var saveData = $("#save_Form").serialize();
	    	var url = "DataController/addData.action";
	    	var id = $("#sava_id").val();
	    	if(id !== null && id !== ""){
	    		saveData.id = id;
	    		url = "DataController/editData.action";
	    	}
	    	$.ajax({
      		  	type : 'post',
      		  	url : url,
      		  	data : saveData,
      		  	dataType : "json",
      		  	async : false,
      		  	success : function(data) {
      		  		if (data !== null && data === '0000') {
      		  			_this.getDatabaseList();
      		  			$("#saveModal").modal('hide');
      		  		} else {
      		  			var error = data !== "" ? data : "保存失败，请联系管理员!";
      		  			$("#error").html(error);
      		  		}
      		  	}   
      	  	});
	    }
		
	    /**
	     * 添加数据库的点击事件
	     */
		this.addDatabase = function(){
			//清除表单验证信息
			$("#save_Form").data('bootstrapValidator').destroy();
			$('#save_Form').data('bootstrapValidator', null);
			_this.dataValidator();
			
			//清空表单
			$("#sava_id").val("");
			$("#dataName").val("");
			$("#dataDesc").val("");
			
			$("#myModalLabel").html("新建数据库");
			$("#error").html("");
			_this.getProductList();
			$("#saveModal").modal('show');
		}
		
		/**
		 * 修改数据库信息
		 */
		this.editDatabase = function(id){
			//清除表单验证信息
			$("#save_Form").data('bootstrapValidator').destroy();
			$('#save_Form').data('bootstrapValidator', null);
			_this.dataValidator();
			$("#error").html("");
			$.ajax({
	             type: "POST",
	             url: "DataController/findDataById.action",
	             async: true,
	             dataType: "json",
	             data:{id: id},
	             success: function(data){
	            	//项目跳转
	            	if(data !== null){
	            		_this.getProductList(data.productId);
	            		$("#myModalLabel").html("编辑数据库");
	            		$("#sava_id").val(data.id);
	            		$("#dataName").val(data.dataName);
	            		$("#dataDesc").val(data.dataDesc);
	            		$("#saveModal").modal('show');
	            	}else{
	            		$("#myModal").modal('show');
	            		$("#modelInfo").html("查询失败，请联系管理员!");
	            	}
                 }
       	 	});
		};
		
		/**
		 * 删除数据库信息
		 */
		this.delDatabase = function(id){
			$("#delModal").modal('show');
			$("#del_Data").on("click",function(){
				$.ajax({
					type: "POST",
					url: "DataController/editData.action",
					async: true,
					dataType: "json",
					data:{id: id, dataState: "00"},
					success: function(data){
						if(data !== "" && data === "0000"){
							$("#delModal").modal('hide');
							_this.getDatabaseList();
						}
					}
				});
			});
		};
		
		/**
		 * 获取项目列表
		 */
		this.getProductList = function(productId){
			$("#productId").html("");
			var teamId = cookie.getCookie("teamId");
			$.ajax({
	             type: "POST",
	             url: "productController/productList.action?teamId=" + teamId,
	             async: true,
	             dataType: "json",
	             success: function(data){
	            	 if(data !== null){
	            		 for (var i = 0; i < data.length; i++) {
	            			 for (var j = 0; j < baseProduct.length; j++) {
								if(data[i].id === baseProduct[j]){
									$("#productId").append('<option value="'+data[i].id+'">'+data[i].productName+'</option>' );
								}
							 }
						 }
	            		 if(productId !== null && productId !== ""){
	            			 $("#productId").val(productId);
	            		 }
	            	 }
                }
      	 	});
		}
		
		/**
		 * 获取项目详情
		 */
		this.getProductById = function(productId){
			var productName= "";
			$.ajax({
	             type: "POST",
	             url: "productController/findProductById.action?productId=" + productId,
	             async: false,
	             dataType: "json",
	             success: function(data){
	            	 if(data !== null){
	            		 productName = data.productName;
	            	 }
                }
      	 	});
			return productName;
		}
		
		//获取登录人权限
		this.getUserRole = function(){
			$.ajax({
	             type: "POST",
	             url: "userController/getUser.action",
	             data: {teamId: cookie.getCookie("teamId")},
	             async: false,
	             dataType: "json",
	             success: function(data){
          			if(data !== null && data !== ""){
          				userRole = data.userRole;
          				_this.verfiyTaskUser(data.id);
          			}else{
          				userRole = "";
          			}
                }
      	 	});
		};
		
		/**
		 * 获取用户任务下是否有此未完成的数据库任务
		 */
		this.verfiyTaskUser = function(userId){
			baseProduct = [];
			$.ajax({
	             type: "POST",
	             data: {userId: userId, teamId: cookie.getCookie("teamId")},
	             url: "TaskInfoController/findTaskInfoByUserId.action",
	             async: false,
	             dataType: "json",
	             success: function(data){
         			if(data !== null && data.length > 0){
         				for (var i = 0; i < data[0].length; i++) {
							if(""+userId+"" === data[0][i].taskOwner && data[0][i].taskType === "06"){
								userBool = true;
								baseProduct.push(data[0][i].productId);
							}
						}
         			}
               }
     	 	});
		};
	}
	
	return DatabaseList;
},{
	requires : ['io',
	            'common-module/src/cookie',
	            'database-module/src/datatable'
	            ]
});
