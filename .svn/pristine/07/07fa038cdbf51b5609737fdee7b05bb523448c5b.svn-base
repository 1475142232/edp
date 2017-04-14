KISSY.add("password/src/passWord",function(S){
	function PassWord(){
		var _this = this;
		/**
		 * 启动
		 */
		this.init = function(){
			_this.addClick();
		}
		/**
		 * 添加点击事件
		 */
		this.addClick = function(){
			var userMail = $("#username").val();
			$("#Send_out").on("click",function(){			
				
				$.ajax({
   	               type: "POST",
   	               url: "userController/getCodeByMail.action",
   	               async: false,
   	               dataType: "json",
   	               data: { userMail: userMail},
   	               success: function(data){
   	            	   
   	            	   if(data==="0000"){
   	            		   $("#Label_out").html("请查看邮箱并输入验证码");
   	            	   }else{
   	            		   alert('系统错误，请与管理员联系！');
   	            	   }
   	            	  
   	               }
				})
			})
			
			$("#save_password").on("click",function(){
				var userPassword = $("#new_password").val();
				var code = $("#code_password").val();
				$.ajax({
	   	           type: "POST",
	   	           url: "userController/editPassWord.action",
	   	           async: false,
	   	           dataType: "json",
	   	           data: { 
	   	                	userMail: userMail,
	   	                	userPassword:userPassword,
	   	                	code:code   	        	        
	   	        	     },
	   	           success: function(data){
	   	            	   
	   	        	 if(data==="0000"){
	   	        		alert('修改成功，返回登录界面！');
	      			    window.location="../";
	   	        	 }else{
	   	        		alert('系统错误，请与管理员联系！');
	   	        	 }
	   	            
	   	           }
				})
				
			})
		}
		
	}
	return PassWord;
},{
	requires :[]
});
