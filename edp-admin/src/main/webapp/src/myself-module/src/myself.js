KISSY.add("myself-module/src/myself",function(S,IO,Calendar,Cookie){
	function Myself(){
		var _this = this;
		var cookie = new Cookie();
		var userRole= "3";
		
		this.init = function(){
			_this.getUserInfo();//获取用户信息
			_this.getUserTask();//获取用户下的任务
			_this.addProblemValidator();//设置新增问题的校验
			//只有普通成员能编辑任务
			if(userRole === "3"){
				$("#taskEdit").attr("style","display: block;");
			}else{
				$("#taskEdit2").attr("style","display: block;");
			}
		};
		
		/*
		 * 获取用户的个人信息
		 */
		this.getUserInfo = function(){
			$.ajax({
	             type: "post",
	             url: "userController/getUser.action",
	             data: {teamId: cookie.getCookie("teamId")},
	             dataType: "json",
	             async: false,
	             success: function(data){
	            	 if(data !== null){
	            		 $("#info_UserId").text(data.id);
	            		 $("#info_UserName").text(data.userName);
	            		 $("#info_UserMail").text(data.userMail);
	            		 userRole = data.userRole;
	            	 }else{
	            		 $('#modelInfo').text("查询失败，请联系管理员!");
	            		 $('#myModal').modal('show');
	            	 }
	             },
	             error: function(errorTwon){
	            	 
	             }
	        });
			
			//跳转到自己的项目日历
			$("#CalendarId").on("click",function(){
				IO.get("views/fullcalendar/agenda-views.html",null,function(){
	     			$("#mainpage").html(arguments[0], true);
                    var calendar = new Calendar();
                    calendar.init(2);
	         	});
			});
			
			//只有普通成员能编辑任务
			if(userRole === "3"){
				/**
				 * 编辑任务
				 */
				$("#editTaskInfo").on("click",function(){
					var id =  $('.task-dateil-task input[name="task"]:checked').attr("id");
					if(id !== undefined && id !== ""){
						_this.editTaskInfo(id);
					}else{
						$("#myModal").modal("show");
						$("#modelInfo").text("请选择一个任务！");
					}
				});
				
				/**
				 * 提交问题
				 */
				$("#addProblem").on("click", function(){
					var productId =  $('.task-dateil-task input[name="task"]:checked').attr("productId");
					if(productId !== undefined && productId !== ""){
						//清除表单验证信息
						$("#addProblem_Form").data('bootstrapValidator').destroy();
						$('#addProblem_Form').data('bootstrapValidator', null);
						_this.addProblemValidator();
						
						//清空表单
						$("#problemName").val("");
						$("#problemDesc").val("");
						$("#productId").val(productId);
						
						$("#error").html("");
						
						_this.getProjectUserList();//获取团队或项目下的所有用户
						$("#addProblemModal").modal('show');
					}else{
						$("#myModal").modal("show");
						$("#modelInfo").text("请选择一个任务！");
					}
				});
				
				//提交问题
				$("#save_Problem").on("click", function(){
					$('#addProblem_Form').bootstrapValidator('validate');
					if($('#addProblem_Form').data('bootstrapValidator').isValid()){
						_this.addProblemInfo();
					}
				});
				
				/**
				 * 提交任务
				 */
				//提交任务弹框提示
				$("#submitProblem").on("click", function(){
					var id =  $('.task-dateil-task input[name="task"]:checked').attr("id");
					if(id !== undefined && id !== ""){
						$("#submitModal").modal("show");
					}else{
						$("#myModal").modal("show");
						$("#modelInfo").text("请选择一个任务！");
					}
				});
				
				//确认任务提交完成
				$("#submit_Data").on("click", function(){
					var id =  $('.task-dateil-task input[name="task"]:checked').attr("id");
					if(id !== undefined && id !== ""){
						_this.submitProblem(id);
					}
				});
				
			}else{
				//审核任务
				$("#verifyTaskInfo").on("click", function(){
					var id =  $('.task-dateil-task input[name="task"]:checked').attr("id");
					var productId =  $('.task-dateil-task input[name="task"]:checked').attr("productId");
					if(id !== undefined && id !== ""){
						IO.get("views/tasklist/taskdetails.html",null,function(){
			     			$("#mainpage").html(arguments[0], true);
			     			localStorage.setItem("listId", id);
			     			localStorage.setItem("productId", productId);
			     			localStorage.setItem("taskTarget", "myself");
			         	});
					}else{
						$("#myModal").modal("show");
						$("#modelInfo").text("请选择一个任务！");
					}
				});
				
				//新增问题弹框2
				$("#addProblem2").on("click", function(){
					var productId =  $('.task-dateil-task input[name="task"]:checked').attr("productId");
					if(productId !== undefined && productId !== ""){
						//清除表单验证信息
						$("#addProblem_Form").data('bootstrapValidator').destroy();
						$('#addProblem_Form').data('bootstrapValidator', null);
						_this.addProblemValidator();
						
						//清空表单
						$("#problemName").val("");
						$("#problemDesc").val("");
						$("#productId").val(productId);
						
						$("#error").html("");
						
						_this.getProjectUserList();//获取团队或项目下的所有用户
						$("#addProblemModal").modal('show');
					}else{
						$("#myModal").modal("show");
						$("#modelInfo").text("请选择一个任务！");
					}
				});
				
				//提交问题2
				$("#save_Problem").on("click", function(){
					$('#addProblem_Form').bootstrapValidator('validate');
					if($('#addProblem_Form').data('bootstrapValidator').isValid()){
						_this.addProblemInfo();
					}
				});
			}
			
			//将选中的用户名称添加到隐藏input
			$("#problemEndUser").on("click", function(){
				if($(this).val() === ""){
					$("#problemEndName").val("");
				}else{
					$("#problemEndName").val($(this).find("option:selected").text());
				}
			});
			
			//密码修改弹出框
			$("#updataPwd").on("click", function(){
				$("#userPwd").val("");
				$("#userPwd1").val("");
				$("#userPwd2").val("");
				$("#updatePwd_Form").data('bootstrapValidator').destroy();
				$('#updatePwd_Form').data('bootstrapValidator', null);
				
				_this.updatePwdValidator();
				$("#updatePwdModal").modal("show");
			});
			
			//修改密码提交
			$("#pwd_Submit").on("click", function(){
				$('#updatePwd_Form').bootstrapValidator('validate');
				if($('#updatePwd_Form').data('bootstrapValidator').isValid()){
					_this.updateUserPwd();
				}
			});
			
			_this.updatePwdValidator();
		};
		
		/*
		 * 获取用户所有任务
		 */
		this.getUserTask = function(){
			$("#noList").html('');
			$("#yesList").html('');
			$("#approveList").html('');
			$.ajax({
	             type: "post",
	             url: "TaskInfoController/findTaskInfoByUserId.action",
	             dataType: "json",
	             success: function(data){
	            	 if(data !== null && data.length > 0){
	            		 //未完成的任务
	            		 if(data[0] !== null && data[0].length > 0){
	            			 var data1 = data[0];
	            			 var taskHtml = "";
	            			 for (var i = 0; i < data1.length; i++) {
	            				 var taskSpec = (data1[i].taskSpec !== undefined && data1[i].taskSpec !== "") ? data1[i].taskSpec : "";
	            				 taskHtml += '<div class="task-list-info">'
	            					 +'<div class="task-list-info-name">'
	            					 +'<input type="radio" name="task" style="float:left;margin-top: 9px;" id="'+ data1[i].id +'" productId="'+data1[i].productId+'"/>'
	            					 +'<span class="info-taskname">'+ data1[i].taskName +'</span>'
	            					 +'<span class="info-tasktime">交付时间：</span>'
	            					 +'<span class="info-tasktime">'+ data1[i].taskDoneTime +'</span>'
	            					 +'</div>'
	            					 +'<div class="task-list-info-desc">'
	            					 + taskSpec
	            					 +'</div>'
	            					 +'</div>';
							}
	            			//只有普通成员能编辑任务
    	     			    if(userRole === "3"){
		            			$("#noList").append(taskHtml);
		            			//统计未完成的任务
		            			$("#no_task").text(data[0].length);
    	     			    }
	            		}else{
	            			$("#noList").html('<div class="task-list-info">暂无相关任务。<div>');
	            		}
	            		//已完成的任务
	            		if(data[1] !== null && data[1].length > 0){
	            			var data2 = data[1];
	            			 var taskHtml = "";
	            			 for (var i = 0; i < data2.length; i++) {
	            				 var taskSpec = (data2[i].taskSpec !== undefined && data2[i].taskSpec !== "") ? data2[i].taskSpec : "";
	            				 taskHtml += '<div class="task-list-info">'
	            					 +'<div class="task-list-info-name">'
	            					 +'<span class="info-taskname">'+ data2[i].taskName +'</span>'
	            					 +'<span class="info-tasktime">交付时间：</span>'
	            					 +'<span class="info-tasktime">'+ data2[i].taskDoneTime +'</span>'
	            					 +'</div>'
	            					 +'<div class="task-list-info-desc">'
	            					 + taskSpec
	            					 +'</div>'
	            					 +'</div>';
							}
	            			//只有普通成员能编辑任务
	    	     			if(userRole === "3"){
		            			$("#yesList").html(taskHtml);
		            			//统计已完成的任务
		            			$("#yes_task").text(data[1].length);
	    	     			}
	            		}else{
	            			$("#yesList").html('<div class="task-list-info">暂无相关任务。<div>');
	            		}
	            		//审核的任务
	            		if(data[2] !== null && data[2].length > 0){
	            			 var data3 = data[2];
	            			 var taskHtml = "";
	            			 for (var i = 0; i < data3.length; i++) {
	            				 var radioInput = "";
	            				 //只有管理员能审核任务
	        	     			 if(userRole === "1" || userRole === "2"){
	        	     				 radioInput = '<input type="radio" name="task" style="float:left;margin-top: 9px;" id="'+ data3[i].id +'" productId="'+data3[i].productId+'"/>';
	        	     			 }
	            				 var taskSpec = (data3[i].taskSpec !== undefined && data3[i].taskSpec !== "") ? data3[i].taskSpec : "";
	            				 taskHtml += '<div class="task-list-info">'
	            					 +'<div class="task-list-info-name">'
	            					 + radioInput
	            					 +'<span class="info-taskname">'+ data3[i].taskName +'</span>'
	            					 +'<span class="info-tasktime">交付时间：</span>'
	            					 +'<span class="info-tasktime">'+ data3[i].taskDoneTime +'</span>'
	            					 +'</div>'
	            					 +'<div class="task-list-info-desc">'
	            					 + taskSpec
	            					 +'</div>'
	            					 +'</div>';
							}
	            			$("#approveList").html(taskHtml);
	            			//统计审核的任务
	            			$("#approve_task").text(data[2].length);
	            		}else{
	            			$("#approveList").html('<div class="task-list-info">暂无相关任务。<div>');
	            		}
	            	 }else{
	            		 $("#noList").html('<div class="task-list-info">暂无相关任务。<div>');
	            		 $("#yesList").html('<div class="task-list-info">暂无相关任务。<div>');
	            		 $("#approveList").html('<div class="task-list-info">暂无相关任务。<div>');
	            		 $('#modelInfo').text("查询失败，请联系管理员!");
	            		 $('#myModal').modal('show');
	            	 }
	            	 
	            	 //只有普通成员能编辑任务
	     			 if(userRole === "1" || userRole === "2"){
	     				$(".task-deteil-no").attr("style","display: none;");
	     				$(".task-deteil-yes").attr("style","display: none;");
	     			 }
	             },
	             error: function(errorTwon){
	            	 
	             }
	        });
		};
		
		/**
		 * 设置新增问题的校验
		 */
		this.addProblemValidator = function(){
			$('#addProblem_Form').bootstrapValidator({
	            message: 'This value is not valid',
	            feedbackIcons: {
	                valid: 'glyphicon glyphicon-ok',
	                invalid: 'glyphicon glyphicon-remove',
	                validating: 'glyphicon glyphicon-refresh'
	            },
	            fields: {
	            	problemName: {
	                    message: 'The username is not valid',
	                    validators: {
	                        notEmpty: {
	                            message: '请输入问题名称!'
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
	                problemDesc: {
	                    validators: {
	                    	notEmpty: {
	                            message: '请输入问题描述!'
		                    },stringLength: {
	                            max: 50,
	                            message: '长度最大不能超过500!'
	                        }
	                    }
	                },
	                problemType: {
	                	validators: {
	                		notEmpty: {
	                            message: '请选择问题类型!'
	                        }
	                    }
	                },
	                problemLv: {
	                	validators: {
	                		notEmpty: {
	                            message: '请选择问题等级!'
	                        }
	                    }
	                },
	                problemEndUser: {
	                	validators: {
	                		notEmpty: {
	                            message: '请选择问题解决人!'
	                        }
	                    }
	                }
	            }
	        });
		};
		
		/**
		 * 获取团队或项目下的所有用户
		 */
		this.getProjectUserList = function(){
			$("#problemEndUser").html("");
			$("#problemEndName").val("");
			var teamId = cookie.getCookie("teamId");
			var productId =  $('.task-dateil-task input[name="task"]:checked').attr("productId");
			$.ajax({
	             type: "POST",
	             url: "userController/findUserByProductId.action?ProductId="+ productId,
	             async: true,
	             dataType: "json",
	             success: function(data){
	            	 $("#problemEndUser").append('<option value="">请选择解决人</option>' );
	            	 if(data !== null){
	            		 for (var i = 0; i < data.length; i++) {
	            			 $("#problemEndUser").append('<option value="'+data[i].id+'">'+data[i].userName+'</option>' );
						 }
	            	 }
               }
     	 	});
		};
		
		/**
		 * 新增问题
		 */
		this.addProblemInfo = function(){
			 //验证成功，保存数据
	    	var saveData = $("#addProblem_Form").serialize();
	    	$.ajax({
      		  	type : 'post',
      		  	url : "ProblemController/addProblem.action",
      		  	data : saveData,
      		  	dataType : "json",
      		  	async : false,
      		  	success : function(data) {
      		  		if (data !== null && data === '0000') {
      		  			$("#addProblemModal").modal('hide');
      		  			$("#myModal").modal('show');
      		  			$("#modelInfo").text("问题新增成功！");
      		  		} else {
      		  			var error = data !== "" ? data : "新增失败，请联系管理员!";
      		  			$("#error").html(error);
      		  		}
      		  	}   
      	  	});
		};
		
		/**
		 * 提交任务，任务完成
		 */
		this.submitProblem = function(id){
			var saveData = {id: id, taskState: "04"};
	    	$.ajax({
      		  	type : 'post',
      		  	url : "TaskInfoController/editTaskInfo.action",
      		  	data : saveData,
      		  	dataType : "json",
      		  	async : false,
      		  	success : function(data) {
      		  		if (data !== null && data === '0000') {
      		  			$("#submitModal").modal('hide');
      		  			$("#myModal").modal('show');
      		  			$("#modelInfo").text("任务提交成功，已进入审核状态！");
      		  			_this.getUserTask();//获取用户下的任务
      		  		} else {
      		  			$("#submitModal").modal('hide');
      		  			$("#myModal").modal('show');
      		  			var error = data !== "" ? data : "任务提交失败，请联系管理员!";
      		  			$("#modelInfo").text(error);
      		  		}
      		  	}   
      	  	});
		};
		
		/*
		 * 修改密码
		 */
		this.updateUserPwd = function(){
			var datasend = {};
			datasend.passWord = $("#userPwd").val();
			datasend.NewPass = $("#userPwd1").val();
			$.ajax({
	             type: "POST",
	             url: "userController/editPassWord.action",
	             async: true,
	             dataType: "json",
	             data: datasend,
	             success: function(data){
	            	//项目跳转
	            	if(data !== null && data === "0000"){
	            		$("#updatePwdModal").modal("hide");
	            		$("#myModal").modal("show");
	            		$("#modelInfo").text("密码修改成功!");
	            		//判断是否保存密码，重新替换旧密码
	            		var loPass = localStorage.getItem("pass") || "";
	            		if(loPass !== ""){
	            			localStorage.setItem("pass", $("#userPwd1").val());
	            		}
	            	}else{
	            		var error = data !== "" ? data : "修改密码失败，请联系管理员!";
	            		$("#upError").html(error);
	            	}
               }
     	 	});
		};
		
		/*
		 * 跳转到编辑页面
		 */
		this.editTaskInfo = function(id){
			$.ajax({
	             type: "POST",
	             url: "TaskInfoController/findTaskInfoById.action",
	             async: true,
	             dataType: "json",
	             data:{id: id},
	             success: function(data){
	            	//项目跳转
	            	if(data !== null){
	            		if(data.taskType === "01"){
	            			
	            		}else if(data.taskType === "02"){
	            			var productId =  $('.task-dateil-task input[name="task"]:checked').attr("productId");
	            			cookie.setCookie("productId", productId);
	            			cookie.setCookie("taskId", id);
	            			localStorage.setItem("target","scenelist");
	            			//“场景”跳转
	        	 			IO.get("views/scene/scene_list.html",null,function(){
	        	     			$("#mainpage").html(arguments[0], true);
	        	         	});
	            		}else if(data.taskType === "03"){
	            			
	            		}else if(data.taskType === "04"){
	            			_this.navQie("");
	            			var productId =  $('.task-dateil-task input[name="task"]:checked').attr("productId");
	            			cookie.setCookie("productId", productId);
	            			cookie.setCookie("taskId", id);
	            			//“场景”跳转
	            			IO.get("views/actionlist/actionlist.html",null,function(){
	            				$("#mainpage").html(arguments[0], true);
	            			});
	            		}else if(data.taskType === "05"){
	            			_this.navQie("");
	            			var productId =  $('.task-dateil-task input[name="task"]:checked').attr("productId");
	            			cookie.setCookie("productId", productId);
	            			cookie.setCookie("taskId", id);
	            			//“原型图”跳转
	        	 			IO.get("views/prototype/prototype.html",null,function(){
	        	     			$("#mainpage").html(arguments[0], true);
	        	         	});
	            		}else if(data.taskType === "06"){
	            			_this.navQie("my_Database");
	        				//“数据库”跳转
	        	 			IO.get("views/database/database_list.html",null,function(){
	        	     			$("#mainpage").html(arguments[0], true);
	        	     			localStorage.setItem("target","my_Database");
	        	         	});
	            		}else if(data.taskType === "07"){
	            			_this.navQie("");
	            			var productId =  $('.task-dateil-task input[name="task"]:checked').attr("productId");
	            			cookie.setCookie("productId", productId);
	            			cookie.setCookie("taskId", id);
	            			//“接口”跳转
	        	 			IO.get("views/port/port_list.html",null,function(){
	        	     			$("#mainpage").html(arguments[0], true);
	        	         	});
	            		}else if(data.taskType === "08"){
	            			
	            		}else if(data.taskType === "09"){
	            			
	            		}
	            	}else{
	            		$("#myModal").modal('show');
	            		$("#modelInfo").html("查询失败，请联系管理员!");
	            	}
                }
      	 	});
		};
		
		/**
		 * 设置修改密码的校验
		 */
		this.updatePwdValidator = function(){
			$('#updatePwd_Form').bootstrapValidator({
	            message: 'This value is not valid',
	            feedbackIcons: {
	                valid: 'glyphicon glyphicon-ok',
	                invalid: 'glyphicon glyphicon-remove',
	                validating: 'glyphicon glyphicon-refresh'
	            },
	            fields: {
	            	userPwd: {
	                    message: 'The username is not valid',
	                    validators: {
	                        notEmpty: {
	                            message: '请输入修改前密码!'
	                        },
	                        stringLength: {
	                            max: 8,
	                            message: '长度最大不能超过8位!'
	                        }
	                    }
	                },
	                userPwd1: {
	                    validators: {
	                        notEmpty: {
	                            message: '请输入修改后密码!'
	                        }
	                    },
	                    stringLength: {
	                        max: 8,
	                        message: '密码长度最大不能超过8位!'
	                    },
                        identical: {//相同
                            field: 'userPwd', //需要进行比较的input name值
                            message: '新密码不能与旧密码相同!'
                        }
	                },
	                userPwd2: {
	                    validators: {
	                        notEmpty: {
	                            message: '请再次输入修改后密码!'
	                        },
	                        identical: {//相同
	                            field: 'userPwd1', //需要进行比较的input name值
	                            message: '两次密码不一致'
	                        }
	                    }
	                }
	            }
	        });
		};
		
		/**
		 * 头部导航切换样式
		 */
		this.navQie = function(id){
			$("#navTop").show();
			var li = $("#navUl li.active");
			if(li !== null && li !== undefined){
				li.removeAttr("class");
			}
			$("#"+id).parent().attr("class","active");
		}
	};
	
	return Myself;
},{
	requires : ['io',
	            'fullcalendar-module/src/calendar',
	            'common-module/src/cookie']
});