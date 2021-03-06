KISSY.add("tasklist-module/src/taskdetails",function(S,IO,TaskList,Cookie){
	function taskdetails(){
		var _this = this;
		var cookie = new Cookie();
		var _listId = '';//任务Id
		var _userRole = '';//用户权限
		var type = '';//任务类型
		this.getTaskDetails = function () {
			_listId = localStorage.getItem("listId");
			_this.getUser();
			if (_userRole === '3') {
				$('.footer').css('display','none');
			}
			$('.task-content ul').html('');
			$('.task-name').html('');
			$('.task-owner').html('');
			$('.task_type').html('');
			$('.task_done_time').html('');
			$.ajax({
				url: "TaskInfoController/findTaskInfoById.action?id="+ _listId,
				type: "POST",
				async: true,
				dataType: "json",
				success: function (data) {
					type = data.taskType;
					var state = "";
					if (data.taskState == "01") {
						state = "已完成";
						$('.footer').css('display','none');
					}else if (data.taskState == "02") {
						state = "未完成";
					}else if (data.taskState == "03") {
						state = "未分配";
					}else if (data.taskState == "04") {
						state = "审核中";
					};
					$('.task-content ul').html('');
					$('.task-name').html(data.taskName);
					$('.task-owner').html(data.userName);
					$('.task_type').html(state);
					$('.task_done_time').html(data.taskDoneTime);
					if (_userRole === '1' || _userRole === '2') {
						//提交    --  不通过原因
						$("#bohui").unbind('click');
						$("#bohui").on('click',function(){
							$('#myModal').modal('show');
							$('#submitchange').unbind('click');
							$('#submitchange').on('click',function(){
								var obj = $('#myModal textarea').html();
								$.ajax({
									type: "post",
									url: "TaskInfoController/editTaskInfo.action",
									async: true,
									dataType: "json",
									data: {
										id : _listId,
										taskState : '02'
									},
									success: function(data){
										$('#myModal').modal('hide');
										_this.getTaskDetails();
									}
								});
							})
						})
						//通过
						$("#pass").unbind('click');
						$("#pass").on('click',function(){
							$('#delate').modal('show');
							$('.alert').html('确定审核通过吗？');
							$('#btn-add-delate-col').unbind('click');
							$('#btn-add-delate-col').on('click',function(){
								$.ajax({
									type: "post",
									url: "TaskInfoController/editTaskInfo.action",
									async: true,
									dataType: "json",
									data: {
										id : _listId,
										taskState : '01'
									},
									success: function(data){
										$('#delate').modal('hide');
										_this.getTaskDetails();
									}
								})
							})
						});
					}
					_this.getSceneList(_listId);
				}
			});
			_this.backFrist();
		}
		this.getSceneList = function(_listId){
			var url = 'TreeController/findTreeNodeByPid.action';
			var typeName = '';
			if (type == '02') {
				typeName = '场景流程图';
			}else if (type == '03') {
				typeName = '界面原型图';
			}else if (type == '04') {
				typeName = '功能流程图';
			}else if (type == '05') {
				typeName = '原型图限制条件';
			}else if (type == '06') {
				typeName = '设计数据库';
			}else if (type == '07') {
				url = 'DataController/findAllData.action';
				typeName = '设计接口';
			}
			//获取项目列表
			$.ajax({
	             type: "POST",
	             url: url+"?id="+ _listId,
	             async: true,
	             dataType: "json",
	             success: function(data){
	            	 $("#addScene").html('');
	             	 var add="";
                     for(var i=0; i<data.length; i++) {
                    	add += '<div class="myScene" id="books_'+data[i].id+'">';
    	             	add += typeName+'名称：<a href="javascript:;" class="wode" id="'+data[i].id+'">'+data[i].treeName+'</a><br />';
    	             	add += typeName+'描述：<a href="javascript:;" class="wode" id="'+data[i].id+'">'+data[i].treeDesc+'</a>'
                     	add += '</div>';
                     }
                     $("#addScene").append(add);
                     
                     //跳转到表设计
     				$(".myScene").click(function(){
     					var id = this.id;
     		 			window.open("activitiController/create.do?id="+ id + "&type=6","_blank");
     				});
                  }
        	});
		}
		//返回
		this.backFrist = function(){
			$(".back").on("click",function(){
				var taskTarget = localStorage.getItem("taskTarget");
				//根据不同来源跳转
				if(taskTarget === "taskList"){
					//任务列表
					IO.get("views/tasklist/tasklist.html",null,function(){
						$("#mainpage").html(arguments[0], true);
						var tasklist = new TaskList();
						tasklist.init(localStorage.getItem("productId"));
					});
				}else{
					//“我自己”跳转
		 			IO.get("views/myself/myself.html",null,function(){
		     			$("#mainpage").html(arguments[0], true);
		         	});
				}
			});
		}
		//获取权限
		this.getUser = function(){
			$.ajax({
				url: 'userController/getUser.action',
				data: {teamId: cookie.getCookie("teamId")},
				type: 'post',
				cache: false,
				async: false,
				dataType: 'json',
				success: function (data){
					if (data !== null && data !== '') {
						_userRole = data.userRole;
					} else{
						$("#delate").modal("show");
					}
				}
			})
		}
		
	}
	return taskdetails;
},{
	requires : ['io','tasklist-module/src/tasklist','common-module/src/cookie'
	            ]
});
