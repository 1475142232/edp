KISSY.add("actionlist-module/src/actionlist",function(S,IO,Cookie){
	function ActionList(){
		var _this = this;
		var cookie = new Cookie();
		var userRole = "";
		var userBool = false;
		var taskId = '';
		
		this.init = function(){
			_this.getUserRole();//获取用户权限
			_this.getActionList();//获取功能信息
			
			_this.dataValidator();//表单验证
//			if(userRole === "3" && userBool){
//				_this.dataValidator();
//				
//				$("#save_Data").on("click",function(){
//					$('#save_Form').bootstrapValidator('validate');
//					if($('#save_Form').data('bootstrapValidator').isValid()){
//						_this.saveAction();
//					}
//				});
//			}
		}
		
	    this.getActionList = function(){
	    	taskId = cookie.getCookie("taskId");
			if(userRole === "3" && userBool){
				$('.task-deteil-list-h3').append('<span class="editAction"><a>编辑流程</a></span>');
			}
			$.ajax({
				url: "TaskInfoController/findTaskInfoById.action?id="+ taskId,
				type: "POST",
				async: true,
				dataType: "json",
				success: function (data) {
	            	 $('.listName').html(data.taskName);
	             }
			})
			
			if(userRole === "3" && userBool){
				//跳转到新建项目
				$("#addAction").on('click',function(){
					_this.addAction();
				});
				$('.editAction').on('click',function(){
					var id = cookie.getCookie("taskId");
 					window.open("activitiController/create.do?id="+ id + "&type=7","_self");
				})
			}
			$('.back').on('click',function(){
				IO.get("views/myself/myself.html",null,function(){
	     			$("#mainpage").html(arguments[0], true);
	     			localStorage.setItem("target","myself");
	         	});
			})
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
	                            message: '请输入功能名称!'
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
	                            message: '请选择所属任务!'
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
	    
	    this.saveAction = function(){
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
      		  			_this.getActionList();
      		  			$("#saveModal").modal('hide');
      		  		} else {
      		  			var error = data !== "" ? data : "保存失败，请联系管理员!";
      		  			$("#error").html(error);
      		  		}
      		  	}   
      	  	});
	    }
		
	    /**
	     * 添加功能的点击事件
	     */
		this.addAction = function(){
			//清除表单验证信息
			$("#save_Form").data('bootstrapValidator').destroy();
			$('#save_Form').data('bootstrapValidator', null);
			_this.dataValidator();
			
			//清空表单
//			$("#sava_id").val("");
//			$("#").val("");
//			$("#").val("");
			
			$("#myModalLabel").html("新建功能");
			$("#error").html("");
			_this.getProductList(_productId);
			$("#saveModal").modal('show');
		}
		
		/**
		 * 修改功能信息
		 */
		this.editAction = function(id){
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
	            		$("#myModalLabel").html("编辑功能");
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
		 * 删除功能信息
		 */
		this.delSence = function(id){
			$("#delModal").modal('show');
			$("#del_Data").on("click",function(){
				$.ajax({
					type: "POST",
					url: "/", 	
					async: true,
					dataType: "json",
					data:{id: id, dataState: "00"},
					success: function(data){
						if(data !== "" && data === "0000"){
							$("#delModal").modal('hide');
							_this.getActionList();
						}
					}
				});
			});
		};
		
		/**
		 * 获取所属任务
		 */
		this.getProductList = function(productId){
			$("#productId").html("");
			var teamId = cookie.getCookie("teamId");
			$.ajax({
	             type: "POST",
	             url: "" ,
	             async: true,
	             dataType: "json",
	             success: function(data){
	            	 if(data !== null){
	            		 for (var i = 0; i < data.length; i++) {
	            			 $("#productId").append('<option value="'+data[i].id+'">'+data[i].productName+'</option>' );
						 }
	            		 if(productId !== null && productId !== ""){
	            			 $("#productId").val(productId);
	            		 }
	            	 }
                }
      	 	});
		}
		
		/**
		 * 获取功能详情
		 */
		this.getProductById = function(productId){
			var productName= "";
			$.ajax({
	             type: "POST",
	             url: "=" + productId,
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
		 * 获取用户任务下是否有此未完成的功能任务
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
							if(data[0][i].taskType === "04"){
								userBool = true;
							}
						}
         			}
               }
     	 	});
		};
	}
	
	return ActionList;
},{
	requires : ['io',
	            'common-module/src/cookie'
	            ]
});
