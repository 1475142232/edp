KISSY.add("email-module/src/email",function(S,IO,Email2){
    function EmailList(){
        var _this = this;
        var checkDate = '';
    	var pageNumber = 10;//每页显示条数
        $("#navUl li").removeClass("active");
        this.getEmail = function(){
            $.ajax({
                type: "post",
                url: "MailController/getMailByUserId.action?state=&pageNow="+1+"&pageSize="+pageNumber,
                dataType: "json",
                success: function(msg){
                	$(".ul1").html("");
                	for (i = 0;i < msg.length; i++) {
                		var mailState ='';
                		if (msg[i].mailState == '00') {
                			mailState = "未读";
                		}else if (msg[i].mailState == '01'){
                			mailState = "已读";
                		}
                		var state = '<li style="margin-top=20px;" class="'+msg[i].id+'">'+
                		'<span class="span1">'+mailState+'</span>'+
                		'<span class="span2">'+msg[i].mailCreatuser+'</span>'+
                		'<span class="span3">'+msg[i].mailDesc+'</span>'+
                		'<span class="span4">'+msg[i].mailCreattiame+'</span>'+
                		'</li>';
                		$(".ul1").append(state);
                	}
                	_this.getPage();
                	
                	//站内信详情
                	$(".ul1 li").on("click",function(){
                		var emailId = $(this).attr('class');
        	 			IO.get("views/email/email2.html",null,function(){
        	     			$("#mainpage").html(arguments[0], true);
        	     			var email2 = new Email2();
        	     			email2.getEmail2(emailId);
        	         	});
        			});
                }
             });
            
            //日期筛选
            $("#check-date").on('click',function(){
                $("input[name='date']").blur(function(){
                    checkDate = $("input[name='date']").val();
                });
                $.ajax({
                    url: '',
                    type: 'post',
                    cache: false,
                    async: false,
                    dataType: 'json',
//                    data: {  : checkDate},
                    success:function(){
                        _this.getEmail();
                        _this.getPage();
                    }
                });
            });
        }
        this.getPage = function(){
        	var element = $('#bp-3-element-test');//获得数据装配的位置
        	//初始化所需数据
            var options = {
                bootstrapMajorVersion:3,//版本号。3代表的是第三版本
                currentPage: 1, //当前页数
                numberOfPages: 5, //显示页码数标个数
                totalPages:21, //总共的数据所需要的总页数
                itemTexts: function (type, page, current) {
                		//图标的更改显示可以在这里修改。
                switch (type) {
                        case "first":
                            return "<<";
                        case "prev":
                            return "<";
                        case "next":
                            return ">";
                        case "last":
                            return ">>";
                        case "page":
                            return  page;
                    }
                },
                tooltipTitles: function (type, page, current) {
    				//如果想要去掉页码数字上面的预览功能，则在此操作。例如：可以直接return。
                    switch (type) {
    		            case "first":
    		                return "Go to first page";
    		            case "prev":
    		                return "Go to previous page";
    		            case "next":
    		                return "Go to next page";
    		            case "last":
    		                return "Go to last page";
    		            case "page":
    		                return (page === current) ? "Current page is " + page : "Go to page " + page;
    		        }
                },
                onPageClicked: function (e, originalEvent, type, page) {
                    //单击当前页码触发的事件。若需要与后台发生交互事件可在此通过ajax操作。page为目标页数。
                    //console.log(e);
                    //console.log(originalEvent);
                    //console.log(type);
                    //console.log(page);
                	 $.ajax({
                         url: '',
                         type: 'post',
                         cache: false,
                         async: false,
                         dataType: 'json',
         //              data: {  : page, : pageNumber},
                         success:function(){
                             _this.getEmail();
                             _this.getPage();
                         }
                     });
                }
            };
            element.bootstrapPaginator(options);	//进行初始化   
        }
    }
	return EmailList;
},{
	requires : ['io',
	            'email-module/src/email2'
	            ]
});
