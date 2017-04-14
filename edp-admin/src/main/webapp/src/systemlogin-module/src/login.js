KISSY.add("systemlogin-module/src/login",function(S){
	function Login(){
		var _this = this;
		var textId= "#checkout";
		//记录用户名和密码是否正确的字段
		var uBool = true,pBool = true;
		//获取本地存储的用户名和密码并进行赋值
		var loUser = localStorage.getItem("user") || "";
        var loPass = localStorage.getItem("pass") || "";
        $("#username").val(loUser);
        $("#password").val(loPass);
        if(loUser !== "" && loPass !== ""){
            $("#rememberpwd").attr("checked","");
        }
		//登录事件
		$("#loginButt").click(function(){
			localStorage.setItem("target","");
			uBool = true,pBool = true;
			$(textId).text("");
			var username=$.trim($("#username").val());
			if(username == null || username == '') {//用户名不能为空
				$(textId).text("请输入用户名");
				uBool = false;
				return;
			}
			var filter  = /^([a-zA-Z0-9_\.\-])+\@(([a-zA-Z0-9\-])+\.)+([a-zA-Z0-9]{2,4})+$/;
			if (!filter.test(username)){//用户名必须为邮箱
			   $(textId).text("用户名格式不正确");
			   uBool = false;
			   return;
			}
			var password=$.trim($("#password").val());
			if(password == null || password == '') {//密码不能为空
				$(textId).text("请输入密码");
				pBool = false;
				return;
			}
			var teamId = _this.getQueryString("teamId");
			//登录
			$.ajax({
				type:'POST',
				url: "login.action",
				data: {userMail:username, userPassword:password,teamId: teamId},
		        dataType: "json",
		        async:false,
		        success: function(data){
		            if(data != null && data === '0000') { //登录成功跳转其他页面
		            	window.location="../";
		            	//记住密码
		            	var checkbox = $("#rememberpwd").is(':checked');
	            		if(checkbox === true || checkbox === "checked"){
	                        localStorage.setItem("user",$("#username").val());
	                        localStorage.setItem("pass",$("#password").val());
	                    }else{
	                        localStorage.setItem("user","");
	                        localStorage.setItem("pass","");
	                    }
		            } else {
		            	var info = data;
		            	if(data === null || data === ""){
		            		info = "登录失败，请联系管理员！";
		            	}
		            	$(textId).text(info);
		            }	
		        }
			});
		});
		
		//页面回车处罚登录按钮
		$("#username,#password").keydown(function(e){
			if(e.keyCode === 13){
				$("#loginButt").click();
			}
		});
		
		//当用户名或密码内容改变时清除错误信息(非IE)
		$("#username,#password").on("input",function(e){
			var text = $("#checkout").text();
			if(text !== ""){
				if(this.id === "username" && !uBool){
					$(textId).text("");
				}else if(this.id === "password" && !pBool){
					$(textId).text("");
				}else if(pBool && uBool){
					$(textId).text("");
				}
			}
		});
		
		//当用户名或密码内容改变时清除错误信息(IE)
		$("#username,#password").on("propertychange",function(e){
			var text = $(textId).text();
			if(text !== ""){
				if(this.id === "username" && !uBool){
					$(textId).text("");
				}else if(this.id === "password" && !pBool){
					$(textId).text("");
				}else if(pBool && uBool){
					$(textId).text("");
				}
			}
		});
		
		//注册
		$("#register").on("click",function(e){
			var teamId = _this.getQueryString("teamId");
			if(teamId !== null && teamId !== undefined && teamId !== ""){
				window.location="./registerPage.action?teamId=" + teamId;
			}else{
				window.location="./registerPage.action";
			}
		});
		
		/*
		 * 获取url地址的参数
		 * name 参数名称
		 */
		this.getQueryString = function(name){
		     var reg = new RegExp("(^|&)"+ name +"=([^&]*)(&|$)");
		     var r = window.location.search.substr(1).match(reg);
		     if(r!=null)return  unescape(r[2]); return null;
		}
	};
	
	return Login;
},{
	requires : []
});
