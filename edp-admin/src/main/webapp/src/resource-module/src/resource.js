KISSY.add("resource-module/src/resource",function(S){
	function resourceList(){
		var _this = this;
		var _teamId = "";
		this.getresourcelist = function(teamId){
			_teamId = teamId;
			$(".myrow").html('<a href="javascript:void(0);" id="addpeople" class="addowner" data-toggle="modal" data-target="#mymodal"><b>+</b><span>添加成员</span></a>');
			//获取人员列表
			$.ajax({
	             type: "GET",
	             url: "userController/findUserByTeamId.action?teamId="+teamId,
	             async: true,
	             dataType: "json",
	             success: function(data){
  		             var _data = data;
	            	 //查询自己信息
	            	 $.ajax({
	    	             type: "POST",
	    	             url: "userController/getUser.action",
	    	             data: {teamId: _teamId},
	    	             async: true,
	    	             dataType: "json",
	    	             success: function(data){
	    	            	var role = data.userRole;
	    	            	//所有人员信息
	     		            _this.getListData(_data,role);
	    	             }
	    			});
	             }
			});
			//增加成员url
			$.ajax({
				type: "GET",
				url : "userController/findUrlByTeamId.action?teamId="+teamId,
				async: true,
	            dataType: "json",
	            success: function(data){
	            	$("#valueurl").val(data);
	            }
			});
		}
		//人员列表data
		this.getListData = function(_data,role){
			var add = "";
        	var updatename ="";
            for(var i=0; i<_data.length; i++) {
            	var userrole = _data[i].userRole;
	    	    if(userrole === "1"){
	    		    updatename = "超级管理员";
	    	    }else if(userrole === "2"){
	    		    updatename = "管理员";
	    	    }else if(userrole === '3'){
	    		    updatename = "普通成员";
	    	    }
	           	add+='<div class="owners" id="'+_data[i].userRole+'">';
	           	add+='<a href="javascript:void(0);" id="'+_data[i].id+'" class="glyphicon glyphicon-remove"></a>';//X    
	           	add+='<a href="javascript:void(0);" id="users" class="btn-lg glyphicon glyphicon-user" style="text-decoration: none;"></a>';//icon-user
	           	add+='<div class="people">';
	           	add+='<a href="javascript:void(0);" id="'+_data[i].userMail+'" style="line-height:40px;text-decoration: none;">'+_data[i].userName+'</a>';
	           	add+='<a href="javascript:void(0);" style="font-size:12px;color:#666; text-decoration: none;">'+updatename+'</a>';
	           	add+='</div>';
	           	add+='</div>';
	            $(".myrow").append(add);
	            add = "";
	        }
            //判断权限
            if(role === "1"){
                $(".owners>a:first-child").css('display','block');
                $(".addowner").css('display','inline-block');
                //点击X获取ID
                $(".glyphicon-remove").unbind("click");
                $(".glyphicon-remove").on("click",function(ev){
                	var Event=ev||window.event;
                	if (Event.stopPropagation) {
                	 		Event.stopPropagation();
                	}else{
                	 		Event.cancelBubble=true;
                	};
                	var _id = this.id;
                	$("#deleteowner").modal('show');
                	//确定删除人员点击事件
                	$("#confirmdelete").unbind("click");
                    $("#confirmdelete").on("click",function(){
            			$.ajax({
            	             type: "POST",
            	             url: "userController/delUserByTeamId.action",
            	             async: true,
            	             dataType: "json",
            	             data:{userId:_id,teamId:_teamId},
            	             success: function(data){
        	            		//刷新列表-调用加载列表方法
             	            	_this.getresourcelist(_teamId);
                            }
                   	 	});
            		});
                });
            };
            if(role === "1" || role === "2"){
            	_this.lookOwnerDetails();
            };
		}
		//查看人员详细信息
		this.lookOwnerDetails = function(){
			$(".owners").unbind("click");
			$(".owners").on("click",function(){
				var owner_id = $(this).children("a").eq(0).attr('id');//Id
				var owner_role =  $(this).attr('id');//获取当前人员权限
				var emails = $(this).find("div").children("a").eq(0).attr('id');
				var names = $(this).find("div").children("a").eq(0).html();
				//判断权限
				if(owner_role == "1"){
					$("#updatequanxian").css("display","none");
				}else if(owner_role == "2" || owner_role == "3"){
					$("#updatequanxian").css("display","inline-block");
				}
				$("#ownersdetails").css("display","block");
				$("#info_UserName").text(names);
				$("#info_UserMail").text(emails);
				//修改权限
 				$("#updatequanxian").unbind("click");
 				$("#updatequanxian").on("click",function(){
 					$("#updatemodal").modal("show");
 					$("#putong").removeAttr("checked");
 					$("#guanli").removeAttr("checked");
 					if(owner_role == "2"){
 						$("#guanli").prop("checked","checked");
 					}else if(owner_role == "3"){
 						$("#putong").prop("checked","checked");
 					}
 					var _owners_id = owner_id;
 					console.log(owner_role);//表示点击的人的权限
 					//console.log(_owners_id);//判断权限，默认选中单选框
 					//确认修改成员权限
 					$("#updatequanxianok").unbind("click");
 	           	 	$("#updatequanxianok").on("click",function(){
 	           	 		var teamId = _teamId;
 	           	 		var user_id = _owners_id;
 	           	 		var _role = $('input:radio[name="owner"]:checked').val();
 	                    $.ajax({
 	   		             	type: "POST",
 	   		             	url: "userController/editRoleById",
 	   		             	dataType: "json",
 	   		             	data:{userId:_owners_id,teamId:_teamId,role:_role},
 	   		             	success: function(data){
 	   		             		if(data!=null || data === "0000"){
	 	   		             		$('body').removeClass('modal-open');
	 	   		             		$('.modal-backdrop').remove();
		 	   		             	$("#updatemodal").modal("hide");
	 	   		             		$("#updateok").modal("show");
	 	   		             		//刷新列表-显示新权限
	             	            	_this.getresourcelist(_teamId);
 	   		             		}
 	   		             	}
 	           		   })
 	           	 	});
 				})
				//获取任务信息
				$.ajax({
		             type: "POST",
		             url: "TaskInfoController/findTaskInfoByUserId.action",
		             dataType: "json",
		             data:{userId:owner_id,teamId:_teamId},
		             success: function(data){
		            	 if(data !== null && data.length > 0){
		            		 //未完成的任务
		            		 if(data[0] !== null && data[0].length > 0){
		            			 var data1 = data[0];
		            			 var taskHtml = "";
			            		 $("#noList").html("");
		            			 for (var i = 0; i < data1.length; i++) {
		            				 taskHtml += '<div class="task-list-info">'
		            					 +'<div class="task-list-info-name">'
		            					 //+'<input type="radio" name="task" style="float:left;" id="'+ data1[i].id +'" />'
		            					 +'<span class="info-taskname">'+ data1[i].taskName +'</span>'
		            					 +'<span class="info-tasktime">交付时间：</span>'
		            					 +'<span class="info-tasktime">'+ data1[i].taskDoneTime +'</span>'
		            					 +'</div>'
		            					 +'<div class="task-list-info-desc">'
		            					 + data1[i].taskSpec
		            					 +'</div>'
		            					 +'</div>';
								}
		            			$("#noList").append(taskHtml);
		            			//统计未完成的任务
		            			$("no_task").text(data[0].length);
		            		}else{
		            			$("#noList").html('<div class="task-list-info">暂无相关任务。<div>');
		            		}
		            		//已完成的任务
		            		if(data[1] !== null && data[1].length > 0){
		            			 var data2 = data[1];
		            			 var taskHtml = "";
		            			 $("#yesList").html("");
		            			 for (var i = 0; i < data2.length; i++) {
		            				 taskHtml += '<div class="task-list-info">'
		            					 +'<div class="task-list-info-name">'
		            					 //+'<input type="radio" name="task" style="float:left;" id="'+ data2[i].id +'" productId="'+data2[i].productId+'"/>'
		            					 +'<span class="info-taskname">'+ data2[i].taskName +'</span>'
		            					 +'<span class="info-tasktime">交付时间：</span>'
		            					 +'<span class="info-tasktime">'+ data2[i].taskDoneTime +'</span>'
		            					 +'</div>'
		            					 +'<div class="task-list-info-desc">'
		            					 + data2[i].taskSpec
		            					 +'</div>'
		            					 +'</div>';
								}
		            			$("#yesList").html(taskHtml);
		            			//统计已完成的任务
		            			$("yes_task").text(data[1].length);
		            		}else{
		            			$("#yesList").html('<div class="task-list-info">暂无相关任务。<div>');
		            		}
		            		//审核的任务
		            		if(data[2] !== null && data[2].length > 0){
		            			 var data3 = data[2];
		            			 var taskHtml = "";
		            			 $("#approveList").html("");
		            			 for (var i = 0; i < data3.length; i++) {
		            				 taskHtml += '<div class="task-list-info">'
		            					 +'<div class="task-list-info-name">'
		            					 //+'<input type="radio" name="task" style="float:left;" id="'+ data3[i].id +'" />'
		            					 +'<span class="info-taskname">'+ data3[i].taskName +'</span>'
		            					 +'<span class="info-tasktime">交付时间：</span>'
		            					 +'<span class="info-tasktime">'+ data3[i].taskDoneTime +'</span>'
		            					 +'</div>'
		            					 +'<div class="task-list-info-desc">'
		            					 + data3[i].taskSpec
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
		             }
		        });
			});
			$("#backlist").on("click",function(){
				$("#ownersdetails").css("display","none");
			})
		}
		//复制粘贴
		$("#copy").on("click",function(){
			var cv = document.getElementById("valueurl");
			cv.select();
			document.execCommand("Copy");
			$("#copyok").html("已复制成功！");
		});
	}
	return resourceList;
},{
	requires : []
});