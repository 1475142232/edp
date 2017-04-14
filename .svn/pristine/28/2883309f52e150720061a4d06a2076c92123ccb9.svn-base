KISSY.add("teamcreat-module/src/myproject",function(S,IO,Projectlist, Cookie){
	function myProject(){
		var _this = this;
		var cookie = new Cookie();
		var userIds = [];
		
		this.init = function(){
			//获取团队用户
			_this.findUserByTeamId();
			//修改状态获取项目用户
			_this.getUpdateUserList();
			//创建项目-提交
			$('#creatpro').click(function(){
				if($("#productName").val() == "" || $("#productName").val() == null){
					$("#myModal").modal("show");
					$("#modelInfo").text("请输入项目名称");
				}else{
					var userId = "";
					if(userIds.length > 0){
						for (var i = 0; i < userIds.length; i++) {
							if(i === 0){
								userId += userIds[i];
							}else{
								userId += "," + userIds[i];
							}
						}
					}
					if($("#id").val() != "" && $("#id").val() != null){
						_this.updateProject(userId);
					}else{
						var teamId = cookie.getCookie("teamId");
						var formvalue =  $("#formsend").serialize();
						$.ajax({
							type: "POST",
							url: "productController/addProduct.action?teamId="+teamId+"&userIds=" + userId,
							async: false,
							dataType: "json",
							data:formvalue,
							success: function(data){
								if(data !== null && data === "0000"){
									//跳转到项目列表    调用刷新列表方法
									IO.get("views/team/projectlist.html",null,function(){
										$("#mainpage").html(arguments[0], true);
										var projectlist = new Projectlist();
										projectlist.getproductList(teamId);
									});
								}else{
									$("#myModal").modal("show");
									$("#modelInfo").text("创建失败!");
								}
							}
						});
					}
				}
			});
			//点击返回-返回项目列表
			$(".back").click(function(){
				IO.get("views/team/projectlist.html",null,function(){
					$("#mainpage").html(arguments[0], true);
					var teamId = cookie.getCookie("teamId");
					var projectlist = new Projectlist();
					projectlist.getproductList(teamId);
				});
			});
			//取消创建-返回项目列表
			$("#nocreatpro").on("click",function(){
				IO.get("views/team/projectlist.html",null,function(){
					$("#mainpage").html(arguments[0], true);
					var teamId = cookie.getCookie("teamId");
					var projectlist = new Projectlist();
					projectlist.getproductList(teamId);
				});
			});
			
			//取消创建-返回项目列表
			$("#productOwner").on("click",function(){
				var user = $("#productOwner").val();
				var boolean = true;
				for (var i = 0; i < userIds.length; i++) {
					if(user === userIds[i]){
						boolean = false;
					}
				}
				if(boolean && user !== undefined && user !== null && user !== ""){
					userIds.push(user);
					var userName = $("#productOwner").find("option:selected").text();
					$("#userList").append('<div class="btn-lg glyphicon glyphicon-user addOwner" id="user_'+user+'"><a class="glyphicon glyphicon-remove" href="javascript:void(0);" id="'+user+'" style="position: absolute;left: 5px;top: 5px;"></a><span>'+userName+'</span></div>');
					
					$(".glyphicon-remove").unbind("click");
					$(".glyphicon-remove").on("click", function(){
						var userId = this.id;
						userIds.remove(userId);
						$("#user_" + userId).remove();
					});
				}
			});
			
		};
		
		/**
		 * 新增项目
		 */
		this.updateProject = function(userId){
			var teamId = cookie.getCookie("teamId");
			var formvalue =  $("#formsend").serialize();
			formvalue.id = $("#id").val();
			$.ajax({
				type: "POST",
				url: "productController/editProductById.action?teamId="+ teamId +"&userIds=" + userId,
				async: false,
				dataType: "json",
				data:formvalue,
				success: function(data){
					if(data !== null && data === "0000"){
						//跳转到项目列表    调用刷新列表方法
						IO.get("views/team/projectlist.html",null,function(){
							$("#mainpage").html(arguments[0], true);
							var projectlist = new Projectlist();
							projectlist.getproductList(teamId);
						});
					}else{
						$("#myModal").modal("show");
						$("#modelInfo").text("修改失败!");
					}
				}
			});
		};
		
		/**
		 * 项目分配资源
		 */
		this.findUserByTeamId = function(){
			$("#productOwner").html("");
			var teamId = cookie.getCookie("teamId");
			$.ajax({
      		  	type : 'post',
      		  	url : "userController/selectUserByTeamId.action?teamId="+teamId,
      		  	dataType : "json",
      		  	async : false,
      		  	success : function(data) {
      		  		if (data !== null && data.length > 0) {
      		  			$("#productOwner").append(new Option("请选择项目成员",""));
      		  			for (var i = 0; i < data.length; i++) {
      		  				$("#productOwner").append(new Option(data[i].userName,data[i].id));
						}
      		  		} else {
      		  			$("#myModal").modal('hide');
      		  			var error = data !== "" ? data : "查询失败，请联系管理员!";
      		  			$("#modelInfo").html(error);
      		  		}
      		  	}   
      	  	});
		};
		
		/**
		 * 修改状态获取项目用户
		 */
		this.getUpdateUserList = function(){
			var id = $("#id").val();
			if(id !== undefined && id !== ""){
				$.ajax({
	      		  	type : 'post',
	      		  	url : "userController/findUserByProductId.action?ProductId=" + id,
	      		  	dataType : "json",
	      		  	async : false,
	      		  	success : function(data) {
	      		  		if (data !== null && data.length > 0) {
	      		  			for (var i = 0; i < data.length; i++) {
		      		  			userIds.push(data[i].id);
		    					$("#userList").append('<div class="btn-lg glyphicon glyphicon-user addOwner" id="user_'+data[i].id+'"><a class="glyphicon glyphicon-remove" href="javascript:void(0);" id="'+data[i].id+'" style="position: absolute;left: 5px;top: 5px;"></a><span>'+data[i].userName+'</span></div>');
							}
		      		  		$(".glyphicon-remove").unbind("click");
							$(".glyphicon-remove").on("click", function(){
								var userId = this.id;
								userIds.remove(userId);
								$("#user_" + userId).remove();
							});
	      		  		} else {
	      		  			$("#myModal").modal('hide');
	      		  			var error = data !== "" ? data : "查询失败，请联系管理员!";
	      		  			$("#modelInfo").html(error);
	      		  		}
	      		  	}   
	      	  	});
			}
		};
		
		/**
		 * 修改中删除关联的用户
		 */
		this.delProductUser = function(productId, id){
			
		};
		
		Array.prototype.indexOf = function(val) {
            for (var i = 0; i < this.length; i++) {
                if (this[i] == val) return i;
            }
            return -1;
        };
        Array.prototype.remove = function(val) {
            var index = this.indexOf(val);
            if (index > -1) {
                this.splice(index, 1);
            }
        };
	}
	return myProject;
},{
	requires : ['io',
	            'teamcreat-module/src/projectlist',
	            'common-module/src/cookie']
});