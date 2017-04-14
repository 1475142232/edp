KISSY.add("systemlogin-module/src/register",function(S){
	function Register(){
		var _this = this;
		
		//注册表单校验并提交表单
		$('#defaultForm').bootstrapValidator({
            message: 'This value is not valid',
            feedbackIcons: {
                valid: 'glyphicon glyphicon-ok',
                invalid: 'glyphicon glyphicon-remove',
                validating: 'glyphicon glyphicon-refresh'
            },
            fields: {
                username: {
                    message: 'The username is not valid',
                    validators: {
                        notEmpty: {
                            message: '请输入您的名字!'
                        },
                        stringLength: {
                            max: 30,
                            message: '名字长度最大不能超过30!'
                        },
                        regexp: {
                            regexp: /^[a-zA-Z0-9\u2E80-\u9FFF\.]+$/,
                            message: '输入的名字格式错误!(只能输入汉字、字母、数字、.)'
                        }
                    }
                },
                usermail: {
                	validators: {
                        notEmpty: {
                            message: '请输入邮箱地址!'
                        },
                        regexp: {
                            regexp: /^([a-zA-Z0-9_\.\-])+\@(([a-zA-Z0-9\-])+\.)+([a-zA-Z0-9]{2,4})+$/,
                            message: '输入的邮箱格式错误!(例：xxx@163.com)'
                        }
                    }
                },
                password: {
                    validators: {
                        notEmpty: {
                            message: '请输入密码!'
                        }
                    },
                    stringLength: {
                        max: 8,
                        message: '密码长度最大不能超过8位!'
                    }
                },
                password2: {
                    validators: {
                        notEmpty: {
                            message: '请再次输入密码!'
                        },
                        identical: {//相同
                            field: 'password', //需要进行比较的input name值
                            message: '两次密码不一致'
                        }
                    }
                }
            }
        }) .on('success.form.bv', function(e) {
          var username = $.trim($("#username").val());
      	  var password = $.trim($("#password").val());
      	  var usermail = $.trim($("#usermail").val());
      	  var teamId = _this.getQueryString("teamId");//团队ID
      	  $.ajax({
      		  type : 'post',
      		  url : "../userController/registerUser.action",
      		  data : {
      			 userName : username,
      			 userMail : usermail,
      		     userPassword : password,
      		     teamId : teamId
      		  },
      		  dataType : "json",
      		  async : false,
      		  success : function(data) {
      			 if (data === '0000') {
      				$("#myModal").modal("show");
      				$("#modelInfo").html("恭喜您注册成功!");
      				setTimeout(function(){
      					window.location="../";
      				},2000);//延时2秒 
      			 } else {
      				$("#myModal").modal("show");
      				var error = data != "" ? data : "注册失败，请联系管理员";
      				$("#modelInfo").html(error);
      			 }
      		  }   
      	  });
        });
		
		$("#register").on("click",function(e){
			 window.location="./registerPage.action";
		});
		
		//返回登录
		$("#login").on("click",function(e){
			var teamId = _this.getQueryString("teamId");
			if(teamId !== null && teamId !== undefined && teamId !== ""){
				window.location="./loginPage.action?teamId=" + teamId;
			}else{
				window.location="./loginPage.action";
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
	
	return Register;
},{
	requires : []
});
