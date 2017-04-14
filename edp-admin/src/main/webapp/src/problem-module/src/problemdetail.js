KISSY.add("problem-module/src/problemdetail",function(S,IO, Cookie){
	function ProblemDetail(){
		_this = this;
		var cookie = new Cookie();
		var problemId = "";
		
		this.init = function(id){
			problemId = id;
			
			_this.getProblemDetail();
			
			_this.getTransferUser();
			
			//返回问题列表
			$("#problem_back").on("click",function(){
	 			IO.get("views/problem/problem_list.html",null,function(){
	     			$("#mainpage").html(arguments[0], true);
	         	});
			});
		}
		
		this.getProblemDetail = function(){
			$(".g_replyBar").html("");
			//获取项目列表
			$.ajax({
	             type: "POST",
	             url: "ProblemController/findProblemById.action?problemId="+problemId,
	             async: true,
	             dataType: "json",
	             success: function(data){
	            	 if(data !== null && data !== ""){
	            		 $("#problem_title").text(data.problemName);
	            		 $("#problem_desc").text(data.problemDesc);
	            		 $("#problem_user").text(data.problemStarteName);
	            		 $("#problem_time").text(data.problemStarteTime);
	            		 //已解决的问题不能有“已解决”和“转移”
	            		 var userId = _this.getUserRole();
	            		 if(userId === data.problemStarteUser || userId === data.problemEndUser){
	            			 if(data.problemState === "02"){
	            				 $(".g_footer").html("<label>已解决</label>");
	            			 }else{
	            				 _this.setProblemOperation(); //解决问题和转移操作
	            			 }
	            		 }else{
	            			 if(data.problemState === "02"){
	            				 $(".g_footer").html("<label>已解决</label>");
	            			 }else{
	            				 $(".g_footer").html("<label>未解决</label>");
	            			 }
	            		 }
	            		 //回复列表
	            		 _this.getReplyList(data);
	            	 }
	             }
			});
		};
		
		/**
		 * 设置问题的解决和转移事件
		 */
		this.setProblemOperation = function(){
			//问题转移
			$("#transferSubmit").on("click",function(){
				var transfer_User = $("#transfer_User").val();
				var transfer_Name = $("#transfer_User").find("option:selected").text();
				if(transfer_User !== undefined && transfer_User !== ""){
					var params = {
							id: problemId,
							problemEndUser: transfer_User,
							problemEndName: transfer_Name
					};
					_this.updateProblemInfo(params, 1);
				}
			});
			//问题已解决
			$("#successOK").on("click",function(){
				$("#updateModal").modal("show");
			});
			
			//问题已解决
			$("#up_Submit").on("click",function(){
				var params = {
						id: problemId,
						problemState: "02"
				};
				_this.updateProblemInfo(params, 2);
			});
		};
		
		/**
		 * 渲染回复列表
		 */
		this.getReplyList = function(data){
			var children = data.children;
		    for (var i = 0; i < children.length; i++) {
				var html = '<li>'
   					+'<span class="g_replayname">'+ children[i].replyUserName +'</span>'
   					+'<span class="g_replaycon" id="desc_'+i+'"></span>'
   					+'<span class="g_replaytime">'+ children[i].replyTime +'</span>'
   					+'</li>';
				$(".g_replyBar").prepend(html);
				$("#desc_" + i).text(children[i].replyDesc);
			}
		    
		    $("#my_Relpy").on("click", function(){
		    	$("#addModal").modal('show');
		    	$("#reply_Desc").val("");
		    });
		    
		    $("#reply_Submit").on("click", function(){
		    	$("#addModal").modal('show');
		    	_this.addReplyInfo(data.id);
		    });
		};
		
		this.addReplyInfo = function(id){
			var desc = $("#reply_Desc").val();
			if(desc === undefined || desc === ""){
				return;
			}
			var saveData = {problemId: id,replyDesc: desc};
	    	$.ajax({
      		  	type : 'post',
      		  	url : "ReplyController/addReply.action",
      		  	data : saveData,
      		  	dataType : "json",
      		  	async : false,
      		  	success : function(data) {
      		  		if (data !== null && data !== "") {
      		  			var desc = (data.replyDesc);  
	      		  		var html = '<li>'
	       					+'<span class="g_replayname">'+ data.replyUserName +'</span>'
	       					+'<span class="g_replaycon" id="desc_'+data.id+'"></span>'
	       					+'<span class="g_replaytime">'+ data.replyTime +'</span>'
	       					+'</li>';
	    				$(".g_replyBar").prepend(html);
	    				$("#addModal").modal('hide');
	    				$("#desc_"+data.id).text(data.replyDesc);
      		  		} else {
      		  			var error = data !== "" ? data : "回复失败，请联系管理员!";
      		  			$("#error").html(error);
      		  		}
      		  	}   
      	  	});
		};
		
		/**
		 * 获取转移的解决人列表
		 */
		this.getTransferUser = function(){
			var teamId = cookie.getCookie("teamId");
			$("#transfer_User").html("");
			//获取人员列表
			$.ajax({
	             type: "POST",
	             url: "userController/findUserByTeamId.action?teamId="+teamId,
	             async: true,
	             dataType: "json",
	             success: function(data){
	             	  if(data !== null && data.length > 0){
	             		 $("#transfer_User").append(new Option("请选择",""));
	             		 for (var i = 0; i < data.length; i++) {
	             			 $("#transfer_User").append(new Option(data[i].userName, data[i].id));
						 }
	             	  }
	             }
			});		
		};
		
		/**
		 * 修改问题信息
		 */
		this.updateProblemInfo = function(params, type){
			//获取人员列表
			$.ajax({
	             type: "POST",
	             url: "ProblemController/editProblem.action",
	             data: params,
	             async: true,
	             dataType: "json",
	             success: function(data){
	             	  if(data !== null && data === "0000"){
	             		  if(type === 1){
	             			  $("#modelInfo").text("转移操作执行成功!");
	             		  }else{
	             			  $("#modelInfo").text("该问题解决操作执行成功!");
	             			  $("#updateModal").modal("hide");
	             			  _this.getProblemDetail();
	             		  }
	             		  $("#myModal").modal("show");
	             	  }else{
	             		 $("#myModal").modal("show");
	             		  if(type === 1){
	             			  $("#modelInfo").text("转移操作执行失败!");
	             		  }else{
	             			  $("#modelInfo").text("问题解决操作执行失败!");
	             		  }
	             	  }
	             }
			});	
		};
		
		//获取登录人权限
		this.getUserRole = function(){
			var userId = "";
			$.ajax({
	             type: "POST",
	             url: "userController/getUser.action",
	             data: {teamId: cookie.getCookie("teamId")},
	             async: false,
	             dataType: "json",
	             success: function(data){
          			if(data !== null && data !== ""){
          				userId = data.id;
          			}else{
          				userId = "";
          			}
                }
      	 	});
			return userId;
		};
	};
	
	return ProblemDetail;
},{
	requires : ['io','common-module/src/cookie']
});