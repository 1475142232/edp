KISSY.add("email-module/src/email2",function(S,IO){
    function Email2List(){
    	var _this = this;
    	this.getEmail2 = function(id){
    		$.ajax({
    			type: "post",
    			url: "MailController/editMail.action",
    			dataType: "json",
    			data: {
    				id : id
    			},
    			success: function(data){
    				$("#emailName").html(data.mailName);
    				$("#emailPeople").html(data.mailCreatuser);
    				$("#emailDate").html(data.mailCreattiame);
    				$(".email2-mian").html(data.mailDesc);
    				//返回站内信列表
    				$(".back").on("click",function(){
    		 			IO.get("views/email/email.html",null,function(){
    		     			$("#mainpage").html(arguments[0], true);
    		         	});
    				});
    			}
    		})
    	};
    }
	return Email2List;
},{
	requires : [
	            'io'
	            ]
});