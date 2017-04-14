KISSY.add("teamcreat-module/src/teamcreat",function(S,IO,Cookie,Projectlist){
	function teamCreat(){
		var _this = this;
		var cookie = new Cookie();
		
		function getTreamlist(){
			$(".userinfo").show();
			//团队列表获取-----
			$.ajax({
	             type: "POST",
	             url: "TeamController/getAllTream.action",
	             async: true,
	             dataType: "json",
	             success: function(data){
	            	 
	            	 var add = '<div class="navList">';
	                 for(var i=0; i<data.length; i++) {
	                 	add += '<div class="addNav project" id="'+data[i].id+'">';
	                 	add += '<a href="javascript:;">'+data[i].teamName+'</a>';
	                 	add += '</div>';
	                 }
	                 add += '<a href="javascript:;" class="addNavBtn addteam">+新建团队</a>';
	                 add += '</div>';
	                 $("#addNav").html(add);
	                 
	                 // 新增弹出窗口
	                 $(".addNavBtn").click(function(){
	                	 $(".addNavAlert").show().find("input").val("");
	                 });
	                 
	                //团队获取Id
	         		$(".project").click(function(){
	         			var teamId = this.id;
	         			$("#team_Name").text($("#"+ this.id + " a").html());
	         			//隐藏退出登录按钮
	         			$(".userinfo").hide();
	         			$("#navTop").show();
	         			//团队跳转
	         			IO.get("views/team/projectlist.html",null,function(){
	             			$("#mainpage").html(arguments[0], true);
	             			var projectlist = new Projectlist();
	             			projectlist.getproductList(teamId);
	             			
	             			localStorage.setItem("target","projectlink");
	                 	});
	         		});
	              }
	        });
		}
		getTreamlist();
		
		$(".addNavBtn").click(function(){
			$("#myModal").modal('show');
		});
		// 确定创建团队-----
		$(".addNavOk").click(function(){
			var _data = {teamName: $(".addNavName").val()};
			var teamName = $(".addNavName").val();
			if(teamName != "" || teamName != null ){
				//console.log($(".addNavName").val());
				$.ajax({
		             type: "POST",
		             url: "TeamController/addTream.action",
		             async: true,
		             dataType: "json",
		             data:_data,
		             success: function(data){
		        		 $(".addNavAlert").hide();
		                 getTreamlist();
		                 _this.getTeamListbyId();
		             }
		        });
			}else{
				 $(".addNavName").attr("placeholder","请输入团队名称");
			}
		});
		
		// 取消创建团队
		$(".addNavNo").click(function(){
			$(".addNavAlert").hide();
		});
		
		
		/**
		 * 团队列表
		 */
		this.getTeamListbyId = function(){
			$("#teamSelect").html("");
			//团队列表获取-----
			$.ajax({
	             type: "POST",
	             url: "TeamController/getAllTream.action",
	             async: true,
	             dataType: "json",
	             success: function(data){
	            	 if(data !== null && data.length > 0){
	            		 var teamId = cookie.getCookie("teamId");
	            		 var teamList = "";
	            		 for(var i=0; i<data.length; i++) {
	            			 teamList += '<li id="team_'+ data[i].id +'"><a href="javascript:void(0);" class="nav-color-zhu">'+ data[i].teamName +'</a></li>';
	            			 if(data[i].id == teamId){
	            				 $("#team_Name").text(data[i].teamName);
	            			 }
	            		 }
	            		 teamList += '<li class="add-team"><a href="javascript:void(0);">新建团队</a></li>';
	            		 $("#teamSelect").html(teamList);
	            		 
	            		 $("#teamSelect li").unbind("click");
	            		 //团队获取Id
	            		 $("#teamSelect li").on("click", function(){
	            			 var teamIds = (this.id).split("_");
	            			 if(teamIds.length > 1){
	            				 $("#team_Name").text($(this).find('a').html());
	            				 //团队跳转
	            				 IO.get("views/team/projectlist.html",null,function(){
	            					 $("#mainpage").html(arguments[0], true);
	            					 var projectlist = new Projectlist();
	            	         		 projectlist.getproductList(teamIds[1]);
	            	         		 
	            	         		 localStorage.setItem("target","projectlink");
	            				 });
	            			 }
	            		 });
	            		 
	            		 $(".add-team").unbind("click");
	            		 $(".add-team").on("click", function(){
	            			 IO.get("views/team/teamcreat.html",null,function(){
            	  				$("#mainpage").html(arguments[0], true);
            	  				$("#navTop").hide();
            	  				localStorage.setItem("target","team");
            	  	     	 });
	            		 });
	            	 }
	              }
	        });
		};
		
		//点击退出，退出登录
		$("#tuichu").on("click",function(){
			$("#loginout").modal('show');
			$("#loginoutok").click(function(){
				_this.signout();
			});
		})
		/**
		 * 用户退出
		 */
		this.signout = function(){
			$.ajax({
                url: 'loginController/signout.action',
                type: "post",
                dataType: 'json',
                cache: false,
                async: false,
                success: function (data) {
	               	 if(data === "SUCCESS"){
	               		 localStorage.setItem("target","");
	               		 $("#signoutModal").modal("hide");
	               		 window.location.href='./loginController/loginPage.action';
	               	 }else{
	               		 $("#signoutModal").modal("hide");
	               		 $("#errorModal").modal("show");
	               		 $("#errorInfo").text("退出失败，请联系管理员!");
	               	 }
                },
                error: function (XMLHttpRequest, textStatus, errorThrown) {
                }
            });
		};
		/**
		 * 获取登录人权限
		 */
		this.getUserRole = function(){
			var teamId = cookie.getCookie("teamId");
			var _teamId = teamId;
			$.ajax({
	             type: "POST",
	             url: "userController/getUser.action",
	             data: {teamId: _teamId},
	             async: false,
	             dataType: "json",
	             success: function(data){
         			if(data !== null && data !== ""){
         				var username = data.userName;
         				$("#loginname").html(username);
         			}else{
         				alert("用户名获取失败，请联系管理员");
         			}
                 }
     	 	});
		 }
		getUserRole();
	}
	return teamCreat;
},{
	requires : ['io','common-module/src/cookie',
	            'teamcreat-module/src/projectlist'
	            ]
});