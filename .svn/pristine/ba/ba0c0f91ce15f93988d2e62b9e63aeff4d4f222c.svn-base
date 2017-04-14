KISSY.add("tasklist-module/src/tasklist",function(S,IO,Event,Calendar,Cookie){
	function TaskList(){
		var _this = this;
		var cookie = new Cookie();
		var tableId = "ready1";
		var _productId = "";//项目id
		var taskId = "";//分栏id
		var alertId = '';//模态框id
		var listId = "";//任务id
		var alertNews = '';
		var taskState = "01,02,03,04";
		var taskType = "";
		var userRole = "";
		
		this.init = function(productId){
			_this.getTasklist(productId);
			if(userRole === "1" || userRole === "2"){
				_this.renderTaskEvent();
				//项目日历
				$(".project-date").attr("style","display: ;");
				$(".project-date").on("click", function(){
					IO.get("views/fullcalendar/agenda-views.html",null,function(){
		     			$("#mainpage").html(arguments[0], true);
	                    var calendar = new Calendar();
	                    calendar.init(1);
		         	});
				});
			}
			$(".project-team").text(localStorage.getItem("productName"));
			
			//模态框关闭清空校验规则
			$('#add-ready1').on('hidden.bs.modal', function() {
		        $('#form-add-ready1').data('bootstrapValidator', null);
		        _this.taskValidator();
			});
			
			$('#add-need').on('hidden.bs.modal', function() {
		        $('#form-add-need').data('bootstrapValidator', null);
		        _this.taskValidator();
			});
			
			$('#add-design').on('hidden.bs.modal', function() {    
		        $('#form-add-design').data('bootstrapValidator', null);
		        _this.taskValidator();
			});
			
			$('#add-list').on('hidden.bs.modal', function() {   
		        $('#form-add-list').data('bootstrapValidator', null);
		        _this.taskValidator();
			});
			
			$('#add-test').on('hidden.bs.modal', function() {    
		        $('#form-add-test').data('bootstrapValidator', null);
		        _this.taskValidator();
			});
			
			$('#add-ready2').on('hidden.bs.modal', function() {     
		        $('#form-add-ready2').data('bootstrapValidator', null);
		        _this.taskValidator();
		    });
		}
		
		//内容获取
		this.getTasklist = function(productId){
			_productId = productId;
			//获取用户权限
			_this.getUserRole();
			//统计
			_this.statistics();
			
			
			//新增栏
			var table_add = '<div class="main-common" id="add_column"><a href="javascript:void(0);" data-target="#add-column" data-toggle="modal" style="width:125px;">增加添加项目阶段</a><div class="modal fade" id="add-column" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true" data-backdrop="false" ><div class="modal-dialog"><div class="modal-content"><div class="modal-header"><h4 class="modal-title" id="myModalLabel">新建项目阶段</h4></div><div class="modal-body container-fluid"><div class="row"><div class="col-md-11 col-md-offset-1"><label for="fenceId">阶段名称：</label><input type="text" name="fenceId" id="fenceId" class="input-lg" style="width:  379px;" /></div></div></div><div class="modal-footer"><button type="button" class="btn btn-default" data-dismiss="modal">关闭</button><button type="submit" class="btn btn-primary" id="btn_add_column">确认</button></div></div></div></div></div>';
			if(userRole !== "1" && userRole !== "2"){
				table_add = '<div class="main-common" id="add_column" style="display: none;"></div>'
			}
			$('.project-main-wrap').html(table_add);
			
			var url = 'fenceController/getAllFence.action?productId='+productId+"&taskState="+taskState;//'fenceController/getAllFence.action';
			$.ajax({
				url: url,
				type: 'post',
				cache: false,
				async: false,
				dataType: 'json',
				success: function (data){
					for(var i = 0; i < data.length; i++){
						tableId = "ready1";
						if (data[i].fenceType == 01) {
							tableId = "ready1";
						} else if (data[i].fenceType == 02) {
							tableId = "need";
						} else if (data[i].fenceType == 03) {
							tableId = "design";
						} else if (data[i].fenceType == 04) {
							tableId = "list";
						} else if (data[i].fenceType == 05) {
							tableId = "test";
						} else if (data[i].fenceType == 06) {
							tableId = "question";
						} else if (data[i].fenceType == 07) {
							tableId = "column";
						}
						//生成并插入栏
						var table;
						if (tableId == "question") {
							table = "<div class='main-common' id='"+tableId+"'><p class='title'>"+data[i].fenceName+"</p></div>";
						}else if (tableId == "ready1") {
							table = "<div class='main-common' id='"+tableId+"'><p class='title'>"+data[i].fenceName+"</p>";
							if(userRole === "1" || userRole === "2"){
								table += "<a class='addmodel' href='javascript:void(0);' data-toggle='modal' id='"+data[i].id+"'>增加"+data[i].fenceName+"任务</a>";
							}else{
								table += "<a style='display: none;'></a>";
							}
							table += "</div>";
						}else if (tableId == "column") {
							table = "<div class='main-common' id='"+tableId+"'><p class='title'>"+data[i].fenceName+"<span class='glyphicon glyphicon glyphicon-trash' id='del_"+data[i].id+"'></span></p>";
							if(userRole === "1" || userRole === "2"){
								table += "<a class='addmodel' href='javascript:void(0);' data-toggle='modal' id='"+data[i].id+"'>增加"+data[i].fenceName+"任务</a>";
							}else{
								table += "<a style='display: none;'></a>";
							}
							table += "</div>";
						}else{
							table = "<div class='main-common' id='"+tableId+"'><p class='title'>"+data[i].fenceName+"</p>";
							if(userRole === "1" || userRole === "2"){
								table += "<a class='addmodel' href='javascript:void(0);' data-toggle='modal'  id='"+data[i].id+"'>增加"+data[i].fenceName+"</a></div>";
							}else{
								table += "<a style='display: none;'></a>";
							}
							table += "</div>";
						}
						$("#add_column").before(table);
						//生成任务列表
						
					//生成任务列表
						var child = data[i].children;
						for(var j = 0; j < child.length; j++ ){
							var state = "";
							if (child[j].taskState == "01") {
								state = "已完成";
							}else if (child[j].taskState == "02") {
								state = "未完成";
							}else if (child[j].taskState == "03") {
								state = "未分配";
							}else if (child[j].taskState == "04") {
								state = "审核中";
							};
							var userName = child[j].userName !== undefined ? child[j].userName : "无";
							if (tableId == "ready1") {
							//增加任务
								var ready = '<div class="row task_common" id="child_'+child[j].id+'" style="position: relative;">';
								if(userRole === "1" || userRole === "2"){
									ready += '<i class="glyphicon glyphicon-remove"></i><i class="glyphicon glyphicon-wrench"></i>';
								}
								ready += '<p class="ellipsis">名称：'+child[j].taskName+'</p><p>责任人：'+userName+'</p>'
									+'<p>状态：'+state+'</p><p>完成时间：'+child[j].taskCreateTime+'</p></div>';
								$('#'+tableId+' a').eq(0).after(ready);
							} else if (tableId == "need") {
							//增加需求任务
								var need = '<div class="row task_common" id="child_'+child[j].id+'" style="position: relative;">';
								if(userRole === "1" || userRole === "2"){
									need += '<i class="glyphicon glyphicon-remove"></i><i class="glyphicon glyphicon-wrench"></i>';
								}
								need += '<p class="ellipsis">名称：'+child[j].taskName+'</p><p>责任人：'+userName+'</p>'
								+'<p>状态：'+state+'</p><p>完成时间：'+child[j].taskCreateTime+'</p></div>';
								$('#'+tableId+' a').eq(0).after(need);
							} else if (tableId == "design") {
							//增加设计任务
								var design = '<div class="row task_common" id="child_'+child[j].id+'" style="position: relative;">';
								if(userRole === "1" || userRole === "2"){
									design += '<i class="glyphicon glyphicon-remove"></i><i class="glyphicon glyphicon-wrench"></i>';
								}
								design += '<p class="ellipsis">名称：'+child[j].taskName+'</p><p>责任人：'+userName+'</p>'
								+'<p>状态：'+state+'</p><p>完成时间：'+child[j].taskCreateTime+'</p></div>';
								$('#'+tableId+' a').eq(0).after(design);
							} else if (tableId == "list") {
							//分配工单
								var list = '<div class="row task_common" id="child_'+child[j].id+'" style="position: relative;">';
								if(userRole === "1" || userRole === "2"){
									list += '<i class="glyphicon glyphicon-remove"></i><i class="glyphicon glyphicon-wrench"></i>';
								}
								list += '<p class="ellipsis">名称：'+child[j].taskName+'</p><p>责任人：'+userName+'</p>'
								+'<p>状态：'+state+'</p><p>完成时间：'+child[j].taskCreateTime+'</p></div>';
								$('#'+tableId+' a').eq(0).after(list);
							}else if (tableId == "test") {
							//测试工单
								var test = '<div class="row task_common" id="child_'+child[j].id+'" style="position: relative;">';
								if(userRole === "1" || userRole === "2"){
									test += '<i class="glyphicon glyphicon-remove"></i><i class="glyphicon glyphicon-wrench"></i>';
								}
								test += '<p class="ellipsis">名称：'+child[j].taskName+'</p><p>责任人：'+userName+'</p>'
								+'<p>状态：'+state+'</p><p>完成时间：'+child[j].taskCreateTime+'</p></div>';
								$('#'+tableId+' a').eq(0).after(test);
							}else if (tableId == "column") {
							//新增
								var column = '<div class="row task_common" id="child_'+child[j].id+'" style="position: relative;">';
								if(userRole === "1" || userRole === "2"){
									column += '<i class="glyphicon glyphicon-remove"></i><i class="glyphicon glyphicon-wrench"></i>';
								}
								column += '<p class="ellipsis">名称：'+child[j].taskName+'</p><p>责任人：'+userName+'</p>'
								+'<p>状态：'+state+'</p><p>完成时间：'+child[j].taskCreateTime+'</p></div>';
								$('#'+tableId+' a').eq(0).after(column);
							}else if (tableId == "question") {
							//问题
								
							}
						}
					}
					
					$(".addmodel").unbind('click');
					$(".addmodel").on("click", function(){
						listId = '';
						alertId = $(this).parent().attr("id");
						taskId = this.id;
						taskType = this.fenceType;
						if (alertId == 'ready1') {
							_this.ClearForm('form-add-ready1');
							$('#add-ready1 #myModalLabel').html("新建立项任务");
							$("#add-ready1").modal("show");
						}else if (alertId == 'need') {
							_this.ClearForm('form-add-need');
							$('#add-need #myModalLabel').html("新建需求任务");
							$("#add-need").modal("show");
						}else if (alertId == 'design') {
							_this.ClearForm('form-add-design');
							$('#add-design #myModalLabel').html("新建设计任务");
							$("#add-design").modal("show");
						}else if (alertId == 'list') {
							_this.ClearForm('form-add-list');
							$('#add-list #myModalLabel').html("分配工单");
							$("#add-list").modal("show");
						}else if (alertId == 'test') {
							_this.ClearForm('form-add-test');
							$('#add-test #myModalLabel').html("新建测试任务");
							$("#add-test").modal("show");
						}else if (alertId == 'column') {
							_this.ClearForm('form-add-ready2');
							$('#add-ready2 #myModalLabel').html("新建任务");
							$("#add-ready2").modal("show");
						}
						
					});
					//任务详情
					_this.taskDetails();
					//获取负责人列表
					_this.getUserList();
					//任务编辑
					_this.readyListEdit();
					//日历
					$('input[name="taskStartTime"]').daterangepicker({
						singleDatePicker: true,
						autoclose: false,
				        beforeShowDay: $.noop,
				        calendarWeeks: false,
				        clearBtn: false,
				        daysOfWeekDisabled: [],
				        endDate: Infinity,
				        forceParse: true,
				        format : 'YYYY/MM/DD HH:mm:ss',
				        keyboardNavigation: true,
				        language: 'cn',
				        minViewMode: 0,
				        orientation: "auto",
				        rtl: false,
				        startDate: -Infinity,
				        startView: 0,
				        todayBtn: false,
				        todayHighlight: false,
				        weekStart: 0,
				        locale : {  
                            daysOfWeek : [ '日', '一', '二', '三', '四', '五', '六' ],  
                            monthNames : [ '一月', '二月', '三月', '四月', '五月', '六月',  
                                    '七月', '八月', '九月', '十月', '十一月', '十二月' ]
                        	}  
						},
						function(start, end, label) {
//							alert(start.format('YYYY-MM-DD'));
						}
					);
					$('input[name="taskDoneTime"]').daterangepicker({
						singleDatePicker: true,
						autoclose: false,
				        beforeShowDay: $.noop,
				        calendarWeeks: false,
				        clearBtn: false,
				        daysOfWeekDisabled: [],
				        endDate: Infinity,
				        forceParse: true,
				        format: 'YYYY/MM/DD HH:mm:ss',
				        keyboardNavigation: true,
				        language: 'cn',
				        minViewMode: 0,
				        orientation: "auto",
				        rtl: false,
				        startDate: -Infinity,
				        startView: 0,
				        todayBtn: false,
				        todayHighlight: false,
				        weekStart: 0,
				        locale : {  
                            daysOfWeek : [ '日', '一', '二', '三', '四', '五', '六' ],  
                            monthNames : [ '一月', '二月', '三月', '四月', '五月', '六月',  
                                    '七月', '八月', '九月', '十月', '十一月', '十二月' ]
                        	}  
						},
						function(start, end, label) {
//							alert(start.format('YYYY-MM-DD'));
						}
					);
					
					//删除任务
					$(".glyphicon-remove").unbind("click");
					$(".glyphicon-remove").on('click',function(ev){
						var Event=ev||window.event;
						if (Event.stopPropagation){
							Event.stopPropagation();//非IE阻止事件传播
						}else{
							Event.cancelBubble=true;//IE阻止事件冒泡
						}
						listId = $(this).parent().attr("id").split("_")[1];
						$("#delate-list").modal("show");
						$("#btn-add-delate-lis").unbind("click");
						$("#btn-add-delate-lis").on('click',function(){
							$.ajax({
								url: 'TaskInfoController/editTaskInfo.action',
								type: 'post',
								cache: false,
								async: true,
								dataType: 'json',
								data: {
									id:listId,
									taskState:"00"
								},
								success: function (data){
									if (data !== null && data === '0000') {
										$("#delate-list").modal("hide");
										$(".project-main-wrap").html('');
										_this.getTasklist(_productId);
									} else{
										$("#mymodual").modal("show");
										$('#hint').html('删除失败！');
									}
								}
							});
						});
					});
					
					//删除column
					$(".glyphicon-trash").unbind('click');
					$(".glyphicon-trash").on('click',function(){
						var columnId = $(this).attr('id').split("_")[1];
						$("#delate-column").modal("show");
						$("#delate-column #btn-add-delate-col").unbind('click');
						$("#delate-column #btn-add-delate-col").on('click',function(){
							$.ajax({
								url: 'fenceController/editFence.action',
								type: 'post',
								cache: false,
								async: true,
								dataType: 'json',
								data: {
									id:columnId
								},
								success: function (data){
									if (data !== null && data === '0000') {
										$("#delate-column").modal("hide");
										$(".project-main-wrap").html('');
										_this.getTasklist(_productId);
									} else{
										$("#mymodual").modal("show");
										$('#hint').html('删除失败！');
									}
								}
							});
						})
					});
					//任务状态筛选框
					$(".project-hd-info input").unbind("click");
					$(".project-hd-info input").on('click',function(){
						taskState = "";
						var val1 = $("#success1").val();
						var val2 = $("#success2").val();
						var val3 = $("#success3").val();
						var val4 = $("#success4").val();
						var check1 = $("#success1").is(':checked');
						var check2 = $("#success2").is(':checked');
						var check3 = $("#success3").is(':checked');
						var check4 = $("#success4").is(':checked');
						if(check1){
							taskState += val1;
						}else{
							taskState += "";
						}
						if(check2){
							if(taskState !== ""){
								taskState += "," + val2;
							}else{
								taskState += val2;
							}
						}else{
							taskState += "";
						}
						if(check3){
							if(taskState !== ""){
								taskState += "," + val3;
							}else{
								taskState += val3;
							}
						}else{
							taskState += "";
						}
						if(check4){
							if(taskState !== ""){
								taskState += "," + val4;
							}else{
								taskState += val4;
							}
						}else{
							taskState += "";
						}
						$.ajax({
							type:"post",
							url:"fenceController/getAllFence.action",
							cache: false,
							async:true,
							data: {taskState : taskState},
							dataType: 'json',
							success: function(data){
								if (data !== null && data !== '') {
									$(".project-main-wrap").html('');
									_this.getTasklist(_productId);
								} else{
									$("#mymodual").modal("show");
									$('#hint').html('操作失败！');
								}
							}
						});
					});
					
				}
			});
		};
		
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
          			}else{
          				userRole = "";
          			}
                }
      	 	});
		};
		
		//设置新增事件
		this.renderTaskEvent = function(){
			//增加新增（栏）任务
			$("#btn_add_ready2").unbind("clcik");
			$("#btn_add_ready2").on('click',function(){
				_this.taskValidator();
				//验证表单
				$('#form-add-ready2').bootstrapValidator('validate');
				if($('#form-add-ready2').data('bootstrapValidator').isValid()){
					if(listId == ""){
						var project = _this.serialize("form-add-ready2");
						project.fenceId = taskId;
						project.productId = _productId;
						project.taskType = '11';
							$.ajax({
								url: 'TaskInfoController/addTaskInfo.action',
								type: 'post',
								cache: false,
								async: true,
								dataType: 'json',
								data: project,
								success: function (data){
									$("#add-ready2").modal("hide");
									if (data !== null && data === '0000') {
										$(".project-main-wrap").html('');
										_this.getTasklist(_productId);
									} else{
										$("#mymodual").modal("show");
										$('#hint').html('增加失败！');
									}
								}
						});
					}else{
						_this.editTaskSubmit("form-add-ready2","add-ready2");
					}
				}
			});
			//增加准备任务
			$("#btn_add_ready1").unbind("click");
			$("#btn_add_ready1").on('click',function(){
				_this.taskValidator();
				//验证表单
				$('#form-add-ready1').bootstrapValidator('validate');
				if($('#form-add-ready1').data('bootstrapValidator').isValid()){
					if (listId == '') {
						var project = _this.serialize("form-add-ready1");
						project.fenceId = taskId;
						project.productId = _productId;
						project.taskType = '01';
							$("#add-ready1").modal("hide");
							$.ajax({
								url: 'TaskInfoController/addTaskInfo.action',
								type: 'post',
								cache: false,
								async: true,
								dataType: 'json',
								data: project,
								success: function (data){
									$("#add-ready1").modal("hide");
									if (data !== null && data === '0000') {
										$(".project-main-wrap").html('');
										_this.getTasklist(_productId);
									} else{
										$("#mymodual").modal("show");
										$('#hint').html('增加失败！');
									}
								}
							});
					}else{
						_this.editTaskSubmit("form-add-ready1","add-ready1");
					}
				}
			});
			//增加需求任务
			$("#btn_add_need").unbind("click");
			$("#btn_add_need").on('click',function(){
				_this.taskValidator();
				//验证表单
				$('#form-add-need').bootstrapValidator('validate');
				if($('#form-add-need').data('bootstrapValidator').isValid()){
					if (listId == '') {
						var project = _this.serialize("form-add-need");
						project.fenceId = taskId;
						project.productId = _productId;
							$.ajax({
								url: 'TaskInfoController/addTaskInfo.action',
								type: 'post',
								cache: false,
								async: true,
								dataType: 'json',
								data: project,
								success: function (data){
									$("#add-need").modal("hide");
									if (data !== null && data === '0000') {
										$(".project-main-wrap").html('');
										_this.getTasklist(_productId);
									} else{
										$("#mymodual").modal("show");
										$('#hint').html('增加失败！');
									}
								}
							});
					}else{
						_this.editTaskSubmit("form-add-need","add-need");
					}
				}
			});
			//增加设计任务
			$("#btn_add_design").unbind("click");
			$("#btn_add_design").on('click',function(){
				_this.taskValidator();
				//验证表单
				$('#form-add-design').bootstrapValidator('validate');
				if($('#form-add-design').data('bootstrapValidator').isValid()){
					if (listId == '') {
						var project = _this.serialize("form-add-design");
						project.fenceId = taskId;
						project.productId = _productId;
							$.ajax({
								url: 'TaskInfoController/addTaskInfo.action',
								type: 'post',
								cache: false,
								async: true,
								dataType: 'json',
								data: project,
								success: function (data){
									$("#add-design").modal("hide");
									if (data !== null && data === '0000') {
										$(".project-main-wrap").html('');
										_this.getTasklist(_productId);
									} else{
										$("#mymodual").modal("show");
										$('#hint').html('增加失败！');
									}
								}
							});
					}else{
						_this.editTaskSubmit("form-add-design","add-design");
					}
				}
			});
			//增加开发任务
			$("#btn_add_list").unbind("click");
			$("#btn_add_list").on('click',function(){
				_this.taskValidator();
				//验证表单
				$('#form-add-list').bootstrapValidator('validate');
				if($('#form-add-list').data('bootstrapValidator').isValid()){
					if (listId == '') {
						var project = _this.serialize("form-add-list");
						project.fenceId = taskId;
						project.productId = _productId;
						project.taskType = '08';
							$.ajax({
								url: 'TaskInfoController/addTaskInfo.action',
								type: 'post',
								cache: false,
								async: true,
								dataType: 'json',
								data: project,
								success: function (data){
									$("#add-list").modal("hide");
									if (data !== null && data === '0000') {
										$(".project-main-wrap").html('');
										_this.getTasklist(_productId);
									} else{
										$("#mymodual").modal("show");
										$('#hint').html('增加失败！');
									}
								}
							});
					}else{
						_this.editTaskSubmit("form-add-list","add-list");
					}
				}
			});
			//增加测试任务
			$("#btn_add_test").unbind("click");
			$("#btn_add_test").on('click',function(){
				_this.taskValidator();
				//验证表单
				$('#form-add-test').bootstrapValidator('validate');
				if($('#form-add-test').data('bootstrapValidator').isValid()){
					if (listId == '') {
						var project = _this.serialize("form-add-test");
						project.fenceId = taskId;
						project.productId = _productId;
						project.taskType = '09';
							$.ajax({
								url: 'TaskInfoController/addTaskInfo.action',
								type: 'post',
								cache: false,
								async: true,
								dataType: 'json',
								data: project,
								success: function (data){
									$("#add-test").modal("hide");
									if (data !== null && data === '0000') {
										$(".project-main-wrap").html('');
										_this.getTasklist(_productId);
									} else{
										$("#mymodual").modal("show");
										$('#hint').html('增加失败！');
									}
								}
							});
					}else{
						_this.editTaskSubmit("form-add-test","add-test");
					}
				}
			});
			//增加column
			$("#btn_add_column").unbind("click");
			$("#btn_add_column").on('click',function(){
				var project = $("#fenceId").val();
				if (project == ""){
					$("#fenceId").after("<p style='margin: 10px 0 0 70px;color: red;'>请输入名称！</p>");
				} else {
					$.ajax({
						url: 'fenceController/addFence.action',
						type: 'post',
						cache: false,
						async: true,
						dataType: 'json',
						data: {
							productId:productId,
							fenceName:project,
							fenceType:"07"
						},
						success: function (data){
							if (data !== null && data === '0000') {
								$(".project-main-wrap").html('');
								_this.getTasklist(_productId);
							} else{
								$("#mymodual").modal("show");
								$('#hint').html('增加失败！');
							}
						}
					});
				}
				
			});
		};
		
		this.editTaskSubmit = function(formId, modalId){
			var object = _this.serialize(formId);
			object.id = listId;
			$.ajax({
				url:"TaskInfoController/editTaskInfo.action",
				type:"post",
				cache: false,
				async: true,
				data: object,
				dataType: 'json',
				success: function (data) {
					if (data !== null && data !== '') {
						$("#"+modalId).modal("hide");
						$(".project-main-wrap").html('');
						_this.getTasklist(_productId);
					} else{
						$("#mymodual").modal("show");
						$('#hint').html('操作失败！');
					}
				}
			});
		};
		
		//准备任务编辑
		this.readyListEdit = function(){
			$('.glyphicon-wrench').unbind('click');
			$('.glyphicon-wrench').on('click',function(ev){
				var Event=ev||window.event;
				if (Event.stopPropagation){
					Event.stopPropagation();//非IE阻止事件传播
				}else{
					Event.cancelBubble=true;//IE阻止事件冒泡
				}
				listId = $(this).parent().attr("id").split("_")[1];
				alertId = $(this).parent().parent().attr('id');
				$.ajax({
					url:"TaskInfoController/findTaskInfoById.action",
					type:"post",
					cache: false,
					async: true,
					dataType: 'json',
					data: {id : listId},
					success: function(data){
						if (data !== null && data !== '') {
							if (alertId == 'ready1') {
								_this.ClearForm('form-add-ready1');
								$("#add-ready1").modal("show");
								$('#add-ready1 #myModalLabel').html("修改立项任务");
								$('#add-ready1 input[name="taskName"]').val(data.taskName);
								$('#add-ready1 select[name="taskOwner"]').val(data.taskOwner);
								$('#add-ready1 input[name="taskEvalTime"]').val(data.taskEvalTime);
								$('#add-ready1 input[name="taskStartTime"]').val(data.taskStartTime);
								$('#add-ready1 input[name="taskDoneTime"]').val(data.taskDoneTime);
								$('#add-ready1 textarea[name="taskSpec"]').val(data.taskSpec);
							}else if (alertId == 'need') {
								_this.ClearForm('form-add-need');
								$("#add-need").modal("show");
								$('#add-need #myModalLabel').html("修改需求任务");
								$('#add-need input[name="taskName"]').val(data.taskName);
								$('#add-need select[name="taskOwner"]').val(data.taskOwner);
								$('#add-need select[name="taskType"]').val(data.taskType);
								$('#add-need input[name="taskEvalTime"]').val(data.taskEvalTime);
								$('#add-need input[name="taskStartTime"]').val(data.taskStartTime);
								$('#add-need input[name="taskDoneTime"]').val(data.taskDoneTime);
								$('#add-need textarea[name="taskSpec"]').val(data.taskSpec);
							}else if (alertId == 'design') {
								_this.ClearForm('form-add-design');
								$("#add-design").modal("show");
								$('#add-design #myModalLabel').html("修改设计任务");
								$('#add-design input[name="taskName"]').val(data.taskName);
								$('#add-design select[name="taskOwner"]').val(data.taskOwner);
								$('#add-design select[name="taskType"]').val(data.taskType);
								$('#add-design input[name="taskEvalTime"]').val(data.taskEvalTime);
								$('#add-design input[name="taskStartTime"]').val(data.taskStartTime);
								$('#add-design input[name="taskDoneTime"]').val(data.taskDoneTime);
								$('#add-design textarea[name="taskSpec"]').val(data.taskSpec);
							}else if (alertId == 'list') {
								_this.ClearForm('form-add-list');
								$("#add-list").modal("show");
								$('#add-list #myModalLabel').html("修改设计任务");
								$('#add-list input[name="taskName"]').val(data.taskName);
								$('#add-list select[name="taskOwner"]').val(data.taskOwner);
								$('#add-list input[name="taskEvalTime"]').val(data.taskEvalTime);
								$('#add-list input[name="taskStartTime"]').val(data.taskStartTime);
								$('#add-list input[name="taskDoneTime"]').val(data.taskDoneTime);
								$('#add-list textarea[name="taskSpec"]').val(data.taskSpec);
							}else if (alertId == 'test') {
								_this.ClearForm('form-add-test');
								$("#add-test").modal("show");
								$('#add-test #myModalLabel').html("修改测试任务");
								$('#add-test select[name="taskName"]').val(data.taskName);
								$('#add-test select[name="taskOwner"]').val(data.taskOwner);
								$('#add-test input[name="taskEvalTime"]').val(data.taskEvalTime);
								$('#add-test input[name="taskStartTime"]').val(data.taskStartTime);
								$('#add-test input[name="taskDoneTime"]').val(data.taskDoneTime);
								$('#add-test textarea[name="taskSpec"]').val(data.taskSpec);
							}else if (alertId == 'column') {
								_this.ClearForm('form-add-ready2');
								$("#add-ready2").modal("show");
								$('#add-ready2 #myModalLabel').html("修改任务");
								$('#add-ready2 input[name="taskName"]').val(data.taskName);
								$('#add-ready2 select[name="taskOwner"]').val(data.taskOwner);
								$('#add-ready2 input[name="taskEvalTime"]').val(data.taskEvalTime);
								$('#add-ready2 input[name="taskStartTime"]').val(data.taskStartTime);
								$('#add-ready2 input[name="taskDoneTime"]').val(data.taskDoneTime);
								$('#add-ready2 textarea[name="taskSpec"]').val(data.taskSpec);
							}
							_this.renderTaskEvent();
						} else{
							$("#mymodual").modal("show");
							$('#hint').html('操作失败！');
						}
					}
				})
				
			});
		}
		
		//任务详情
		this.taskDetails = function(){
			$('.task_common').unbind('click');
			$('.task_common').on('click',function(){
				listId = $(this).attr("id").split("_")[1];	
	 			IO.get("views/tasklist/taskdetails.html",null,function(){
	     			$("#mainpage").html(arguments[0], true);
	     			localStorage.setItem("listId",listId);
	     			localStorage.setItem("productId",_productId);
	     			localStorage.setItem("taskTarget", "taskList");
	         	});
			});
		}
		//获取负责人并插入
		this.getUserList = function(){
			$.ajax({
				url: 'userController/findUserByProductId.action?ProductId='+_productId,
				type: 'post',
				cache: false,
				async: true,
				dataType: 'json',
				success: function (obj){
					$("select[name='taskOwner']").html('<option value="">请选择</option>');
					for (var i = 0; i < obj.length; i++) {
						$("select[name='taskOwner']").append('<option value="'+obj[i].id+'">'+obj[i].userName+'</option>')
					}
				}
			});
		}
		//统计
		this.statistics = function () {
			$.ajax({
				url: 'TaskInfoController/countTask',
				type: 'post',
				cache: false,
				async: true,
				dataType: 'json',
				data: {
					productId : _productId,
					type : '1'
				},
				success: function (obj){
					$('.success1').html(obj[0]);
					$('.success2').html(obj[1]);
					$('.success3').html(obj[2]);
					$('.success4').html(obj[3]);
				}
			});
		}
		//序列化表单
		this.serialize = function(form){
			var $form = (typeof(form)=="string" ? $("#"+form) : form);
			var dataArray =  $form.serializeArray();
			var result={};
			$(dataArray).each(function(){
				//如果在结果对象中存在这个值，那么就说明是多选的情形。
				if(result[this.name]){
					//多选的情形，值是数组，直接push
					result[this.name].push(this.value);
				}else{
					//获取当前表单控件元素
					var element = $form.find("[name='"+ this.name +"']")[0];
					//获取当前控件类型
					var type = ( element.type || element.nodeName ).toLowerCase();
					//如果控件类型为多选那么值就是数组形式，否则就是单值形式。
					result[this.name] = (/^(select-multiple|checkbox)$/i).test(type) ? [this.value] : this.value;
				}
			});
			return result;
		};
		this.taskValidator = function(){
		//增加准备任务表单验证
	    	$('#form-add-ready1').bootstrapValidator({
	            message: 'This value is not valid',
	            feedbackIcons: {
	                valid: 'glyphicon glyphicon-ok',
	                invalid: 'glyphicon glyphicon-remove',
	                validating: 'glyphicon glyphicon-refresh'
	            },
	            fields: {
	            	taskName: {
	                    message: 'The username is not valid',
	                    validators: {
	                        notEmpty: {
	                            message: '请输入任务名称!'
	                        },
	                        stringLength: {
	                            max: 60,
	                            message: '长度最大不能超过60!'
	                        },
	                        regexp: {
	                            regexp: /^[a-zA-Z0-9\u2E80-\u9FFF\.\_\-]+$/,
	                            message: '输入的名名称格式错误!(只能输入汉字、字母、数字、.、_、-)'
	                        }
	                    }
	                },
	                taskOwner: {
	                	validators: {
	                		notEmpty: {
	                            message: '请选择分配人!'
	                        },
	                        stringLength: {
	                            max: 20,
	                            message: '长度最大不能超过20!'
	                        }
	                    }
	                },
	                taskEvalTime: {
	                	validators: {
	                		notEmpty: {
	                            message: '请填写任务估时!'
	                        },
	                        stringLength: {
	                            max: 3,
	                            message: '长度最大不能超过3!'
	                        },
	                        regexp: {
								regexp: /^[0-9]*$/,
								message: '输入的时间格式错误!(只能输入数字)'
							}
	                    }
	                },
	                taskDoneTime: {
	                	validators: {
	                		integer: {},
	                		callback: {
	                			message: '结束日期不能小于开始日期',
	                			callback: function(value, validator, $field) {
	                				var begin = $('#form-add-ready1').find("input[name='taskStartTime']").val();
	                				$('#form-add-ready1').find("input[name='taskStartTime']").keypress();
	                				validator.updateStatus('taskDoneTime', 'VALID');
	                				return value >= begin;
	                			}
	                		}
	                	}
	                },
	                taskSpec: {
	                    validators: {
	                    	stringLength: {
	                            max: 50,
	                            message: '长度最大不能超过50!'
	                        }
	                    }
	                }
	            }
	        });
	    	//增加新增栏任务
	    	$('#form-add-ready2').bootstrapValidator({
	            message: 'This value is not valid',
	            feedbackIcons: {
	                valid: 'glyphicon glyphicon-ok',
	                invalid: 'glyphicon glyphicon-remove',
	                validating: 'glyphicon glyphicon-refresh'
	            },
	            fields: {
	            	taskName: {
	                    message: 'The username is not valid',
	                    validators: {
	                        notEmpty: {
	                            message: '请输入任务名称!'
	                        },
	                        stringLength: {
	                            max: 60,
	                            message: '长度最大不能超过60!'
	                        },
	                        regexp: {
	                            regexp: /^[a-zA-Z0-9\u2E80-\u9FFF\.\_\-]+$/,
	                            message: '输入的名名称格式错误!(只能输入汉字、字母、数字、.、_、-)'
	                        }
	                    }
	                },
	                taskOwner: {
	                	validators: {
	                		notEmpty: {
	                            message: '请选择分配人!'
	                        },
	                        stringLength: {
	                            max: 20,
	                            message: '长度最大不能超过20!'
	                        }
	                    }
	                },
	                taskEvalTime: {
	                	validators: {
	                		notEmpty: {
	                            message: '请填写任务估时!'
	                        },
	                        stringLength: {
	                            max: 3,
	                            message: '长度最大不能超过3!'
	                        },
	                        regexp: {
								regexp: /^[0-9]*$/,
								message: '输入的时间格式错误!(只能输入数字)'
							}
	                    }
	                },
	                taskDoneTime: {
	                	validators: {
	                		integer: {},
	                		callback: {
	                			message: '结束日期不能小于开始日期',
	                			callback: function(value, validator, $field) {
	                				var begin = $('#form-add-ready2').find("input[name='taskStartTime']").val();
	                				$('#form-add-ready2').find("input[name='taskStartTime']").keypress();
	                				validator.updateStatus('taskDoneTime', 'VALID');
	                				return value >= begin;
	                			}
	                		}
	                	}
	                },
	                taskSpec: {
	                    validators: {
	                    	stringLength: {
	                            max: 50,
	                            message: '长度最大不能超过50!'
	                        }
	                    }
	                }
	            }
	        });
	    	//增加需求任务表单验证
	    	$('#form-add-need').bootstrapValidator({
	            message: 'This value is not valid',
	            feedbackIcons: {
	                valid: 'glyphicon glyphicon-ok',
	                invalid: 'glyphicon glyphicon-remove',
	                validating: 'glyphicon glyphicon-refresh'
	            },
	            fields: {
	            	taskName: {
	                    message: 'The username is not valid',
	                    validators: {
	                        notEmpty: {
	                            message: '请输入任务名称!'
	                        },
	                        stringLength: {
	                            max: 60,
	                            message: '长度最大不能超过60!'
	                        },
	                        regexp: {
	                            regexp: /^[a-zA-Z0-9\u2E80-\u9FFF\.\_\-]+$/,
	                            message: '输入的名名称格式错误!(只能输入汉字、字母、数字、.、_、-)'
	                        }
	                    }
	                },
	                taskOwner: {
	                	validators: {
	                		notEmpty: {
	                            message: '请选择分配人!'
	                        },
	                        stringLength: {
	                            max: 20,
	                            message: '长度最大不能超过20!'
	                        }
	                    }
	                },
	                taskType: {
	                	validators: {
	                		notEmpty: {
	                            message: '请选择任务类型!'
	                        },
	                        stringLength: {
	                            max: 2,
	                            message: '长度最大不能超过2!'
	                        }
	                    }
	                },
	                taskEvalTime: {
	                	validators: {
	                		notEmpty: {
	                            message: '请填写任务估时!'
	                        },
	                        stringLength: {
	                            max: 3,
	                            message: '长度最大不能超过3!'
	                        },
	                        regexp: {
								regexp: /^[0-9]*$/,
								message: '输入的时间格式错误!(只能输入数字)'
							}
	                    }
	                },
	                taskDoneTime: {
	                	validators: {
	                		integer: {},
	                		callback: {
	                			message: '结束日期不能小于开始日期',
	                			callback: function(value, validator, $field) {
	                				var begin = $('#form-add-need').find("input[name='taskStartTime']").val();
	                				$('#form-add-need').find("input[name='taskStartTime']").keypress();
	                				validator.updateStatus('taskDoneTime', 'VALID');
	                				return value >= begin;
	                			}
	                		}
	                	}
	                },
	                taskSpec: {
	                    validators: {
	                    	stringLength: {
	                            max: 50,
	                            message: '长度最大不能超过50!'
	                        }
	                    }
	                }
	            }
	        });
	    	//增加设计任务表单验证
	    	$('#form-add-design').bootstrapValidator({
	            message: 'This value is not valid',
	            feedbackIcons: {
	                valid: 'glyphicon glyphicon-ok',
	                invalid: 'glyphicon glyphicon-remove',
	                validating: 'glyphicon glyphicon-refresh'
	            },
	            fields: {
	            	taskName: {
	                    message: 'The username is not valid',
	                    validators: {
	                        notEmpty: {
	                            message: '请输入任务名称!'
	                        },
	                        stringLength: {
	                            max: 60,
	                            message: '长度最大不能超过60!'
	                        },
	                        regexp: {
	                            regexp: /^[a-zA-Z0-9\u2E80-\u9FFF\.\_\-]+$/,
	                            message: '输入的名名称格式错误!(只能输入汉字、字母、数字、.、_、-)'
	                        }
	                    }
	                },
	                taskOwner: {
	                	validators: {
	                		notEmpty: {
	                            message: '请选择分配人!'
	                        },
	                        stringLength: {
	                            max: 20,
	                            message: '长度最大不能超过20!'
	                        }
	                    }
	                },
	                taskType: {
	                	validators: {
	                		notEmpty: {
	                            message: '请选择任务类型!'
	                        },
	                        stringLength: {
	                            max: 2,
	                            message: '长度最大不能超过2!'
	                        }
	                    }
	                },
	                taskEvalTime: {
	                	validators: {
	                		notEmpty: {
	                            message: '请填写任务估时!'
	                        },
	                        stringLength: {
	                            max: 3,
	                            message: '长度最大不能超过3!'
	                        },
	                        regexp: {
								regexp: /^[0-9]*$/,
								message: '输入的时间格式错误!(只能输入数字)'
							}
	                    }
	                },
	                taskDoneTime: {
	                	validators: {
	                		integer: {},
	                		callback: {
	                			message: '结束日期不能小于开始日期',
	                			callback: function(value, validator, $field) {
	                				var begin = $('#form-add-design').find("input[name='taskStartTime']").val();
	                				$('#form-add-design').find("input[name='taskStartTime']").keypress();
	                				validator.updateStatus('taskDoneTime', 'VALID');
	                				return value >= begin;
	                			}
	                		}
	                	}
	                },
	                taskSpec: {
	                    validators: {
	                    	stringLength: {
	                            max: 50,
	                            message: '长度最大不能超过50!'
	                        }
	                    }
	                }
	            }
	        });
	    	//增加开发任务表单验证
	    	$('#form-add-list').bootstrapValidator({
	            message: 'This value is not valid',
	            feedbackIcons: {
	                valid: 'glyphicon glyphicon-ok',
	                invalid: 'glyphicon glyphicon-remove',
	                validating: 'glyphicon glyphicon-refresh'
	            },
	            fields: {
	            	taskName: {
	                    message: 'The username is not valid',
	                    validators: {
	                        notEmpty: {
	                            message: '请输入任务名称!'
	                        },
	                        stringLength: {
	                            max: 60,
	                            message: '长度最大不能超过60!'
	                        },
	                        regexp: {
	                            regexp: /^[a-zA-Z0-9\u2E80-\u9FFF\.\_\-]+$/,
	                            message: '输入的名名称格式错误!(只能输入汉字、字母、数字、.、_、-)'
	                        }
	                    }
	                },
	                taskOwner: {
	                	validators: {
	                		notEmpty: {
	                            message: '请选择分配人!'
	                        },
	                        stringLength: {
	                            max: 20,
	                            message: '长度最大不能超过20!'
	                        }
	                    }
	                },
	                taskType: {
	                	validators: {
	                		notEmpty: {
	                            message: '请选择任务类型!'
	                        },
	                        stringLength: {
	                            max: 2,
	                            message: '长度最大不能超过2!'
	                        }
	                    }
	                },
	                taskEvalTime: {
	                	validators: {
	                		notEmpty: {
	                            message: '请填写任务估时!'
	                        },
	                        stringLength: {
	                            max: 3,
	                            message: '长度最大不能超过3!'
	                        },
	                        regexp: {
								regexp: /^[0-9]*$/,
								message: '输入的时间格式错误!(只能输入数字)'
							}
	                    }
	                },
	                taskDoneTime: {
	                	validators: {
	                		integer: {},
	                		callback: {
	                			message: '结束日期不能小于开始日期',
	                			callback: function(value, validator, $field) {
	                				var begin = $('#form-add-list').find("input[name='taskStartTime']").val();
	                				$('#form-add-list').find("input[name='taskStartTime']").keypress();
	                				validator.updateStatus('taskDoneTime', 'VALID');
	                				return value >= begin;
	                			}
	                		}
	                	}
	                },
	                taskSpec: {
	                    validators: {
	                    	stringLength: {
	                            max: 50,
	                            message: '长度最大不能超过50!'
	                        }
	                    }
	                }
	            }
	        });
	    	//增加测试任务表单验证
	    	$('#form-add-test').bootstrapValidator({
	            message: 'This value is not valid',
	            feedbackIcons: {
	                valid: 'glyphicon glyphicon-ok',
	                invalid: 'glyphicon glyphicon-remove',
	                validating: 'glyphicon glyphicon-refresh'
	            },
	            fields: {
	            	taskName: {
	                    message: 'The username is not valid',
	                    validators: {
	                        notEmpty: {
	                            message: '请输入任务名称!'
	                        },
	                        stringLength: {
	                            max: 60,
	                            message: '长度最大不能超过60!'
	                        },
	                        regexp: {
	                            regexp: /^[a-zA-Z0-9\u2E80-\u9FFF\.\_\-]+$/,
	                            message: '输入的名名称格式错误!(只能输入汉字、字母、数字、.、_、-)'
	                        }
	                    }
	                },
	                taskOwner: {
	                	validators: {
	                		notEmpty: {
	                            message: '请选择分配人!'
	                        },
	                        stringLength: {
	                            max: 20,
	                            message: '长度最大不能超过20!'
	                        }
	                    }
	                },
	                taskType: {
	                	validators: {
	                		notEmpty: {
	                            message: '请选择任务类型!'
	                        },
	                        stringLength: {
	                            max: 2,
	                            message: '长度最大不能超过2!'
	                        }
	                    }
	                },
	                taskEvalTime: {
	                	validators: {
	                		notEmpty: {
	                            message: '请填写任务估时!'
	                        },
	                        stringLength: {
	                            max: 3,
	                            message: '长度最大不能超过3!'
	                        },
	                        regexp: {
								regexp: /^[0-9]*$/,
								message: '输入的时间格式错误!(只能输入数字)'
							}
	                    }
	                },
	                taskDoneTime: {
	                	validators: {
	                		integer: {},
	                		callback: {
	                			message: '结束日期不能小于开始日期',
	                			callback: function(value, validator, $field) {
	                				var begin = $('#form-add-test').find("input[name='taskStartTime']").val();
	                				$('#form-add-test').find("input[name='taskStartTime']").keypress();
	                				validator.updateStatus('taskDoneTime', 'VALID');
	                				return value >= begin;
	                			}
	                		}
	                	}
	                },
	                taskSpec: {
	                    validators: {
	                    	stringLength: {
	                            max: 50,
	                            message: '长度最大不能超过50!'
	                        }
	                    }
	                }
	            }
	        });
	    	
	    };
	    this.ClearForm = function (id) {
	        var objId = document.getElementById(id);
	        if (objId == undefined) {
	            return;
	        }
	        for (var i = 0; i < objId.elements.length; i++) {
	            if (objId.elements[i].type == "text") {
	                objId.elements[i].value = "";
	            }
	            else if (objId.elements[i].type == "password") {
	                objId.elements[i].value = "";
	            }
	            else if (objId.elements[i].type == "radio") {
	                objId.elements[i].checked = false;
	            }
	            else if (objId.elements[i].type == "checkbox") {
	                objId.elements[i].checked = false;
	            }
	            else if (objId.elements[i].type == "select-one") {
	                objId.elements[i].options[0].selected = true;
	            }
	            else if (objId.elements[i].type == "select-multiple") {
	                for (var j = 0; j < objId.elements[i].options.length; j++) {
	                    objId.elements[i].options[j].selected = false;
	                }
	            }
	            else if (objId.elements[i].type == "textarea") {
	                objId.elements[i].value = "";
	            }
	        }
	    }
	    
	}
	return TaskList;
},{
	requires : ['io',
	            'event',
	            'fullcalendar-module/src/calendar',
	            'common-module/src/cookie'
	            ]
});
