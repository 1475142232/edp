KISSY.add("fullcalendar-module/src/calendar",function(S,IO, Cookie){
	
	function Calendar(){
		var _this = this;
		var date = new Date();
		var d = date.getDate();
		var m = date.getMonth();
		var y = date.getFullYear();
		var cookie = new Cookie();
		var role=""; 
		this.init=function(type){
			_this.getUserByRole();
			if(type==2){
				_this.goCalendar();	
			}else if(type == 1 && (role === "1" || role ==="2")){
				_this.goBoss();
			}
					
		}
		/**
		 * Boss日历
		 */
		this.goBoss = function(){
			var event = [];
			$.ajax({
				 type: "post",
	             url: "TaskInfoController/findTaskInfoByProductId.action",
	             data:{
	            	 productId : localStorage.getItem("productId")
	             },
	             dataType: "json",      
	             success: function(data){
	            	 for(var i=0;i<data.length;i++){
	            		 var state = '0';
	            		 var date1=new Date(data[i].taskDoneYear, data[i].taskDoneMonth, data[i].taskDoneDay);
	            		 var date2=new Date(data[i].taskRealYear, data[i].taskRealMonth, data[i].taskRealDay);
	            		 if(date2>date1){
	            			 state = '1';
	            		 }
	            		 event.push({
	            			 "id": data[i].id,
	            			 "title": data[i].taskName+"            状态："+data[i].StateString,
	            			 "start": new Date(data[i].taskStarteYear, data[i].taskStarteMonth, data[i].taskStarteDay),
	            			 "end": new Date(data[i].taskDoneYear, data[i].taskDoneMonth, data[i].taskDoneDay),
	            			 "state" : state
	            		 })
	            	 }
	            	 $('#calendar').fullCalendar({
	     				header: {
	     					left: 'prev,next today',
	     					center: 'title',
	     					right: 'month,agendaWeek,agendaDay'
	     				},
	     				editable: false,
	     				events: event,
	     				monthNames: ["一月", "二月", "三月", "四月", "五月", "六月", "七月", "八月", "九月", "十月", "十一月", "十二月"],
	     				monthNamesShort: ["一月", "二月", "三月", "四月", "五月", "六月", "七月", "八月", "九月", "十月", "十一月", "十二月"],
	     				dayNames: ["周日", "周一", "周二", "周三", "周四", "周五", "周六"],
	     				dayNamesShort: ["周日", "周一", "周二", "周三", "周四", "周五", "周六"],
	     				today: ["今天"],
                        firstDay: 1,
                        buttonText: {
                                      today: '本月',
                                      month: '月',
	     		                      week: '周',
	     			                  day: '日',
	     			                  prev: '上一月',
	     		                      next: '下一月'
	                    },
	     				dayClick: function(date, allDay, jsEvent, view) { 
	     					var selectdate = $.fullCalendar.formatDate(date, "MM/dd/yyyy");//选择当前日期的时间转换
	     					localStorage.setItem("selectdate",selectdate);
	     					localStorage.setItem("dateType","1");
	     					IO.get("views/fullcalendar/agenda-day.html",null,function(){
	        	     			$("#mainpage").html(arguments[0], true);   	     			
	        	         	});
                            
	     				}
	     			});
	            	 
	             }
			})
		}
		/**
		 * 个人日历
		 */
		this.goCalendar = function(){
			var event = [];
			$.ajax({
				 type: "post",
	             url: "TaskInfoController/findTaskInfoByTime.action",
	             dataType: "json",      
	             success: function(data){
	            	 for(var i=0;i<data.length;i++){
	            		 var state = '0';
	            		 var date1=new Date(data[i].taskDoneYear, data[i].taskDoneMonth, data[i].taskDoneDay);
	            		 var date2=new Date(data[i].taskRealYear, data[i].taskRealMonth, data[i].taskRealDay);
	            		 if(date2>date1){
	            			 state = '1';
	            		 }
	            		 event.push({
	            			 "id": data[i].id,
	            			 "title": data[i].taskName+"            状态："+data[i].StateString,
	            			 "start": new Date(data[i].taskStarteYear, data[i].taskStarteMonth, data[i].taskStarteDay),
	            			 "end": new Date(data[i].taskDoneYear, data[i].taskDoneMonth, data[i].taskDoneDay),
	            			 "state" : state
	            		 })
	            	 }
	            	 $('#calendar').fullCalendar({
	     				header: {
	     					left: 'prev,next today',
	     					center: 'title',
	     					right: 'month,agendaWeek,agendaDay'
	     				},
	     				editable: false,
	     				events: event,
	     				monthNames: ["一月", "二月", "三月", "四月", "五月", "六月", "七月", "八月", "九月", "十月", "十一月", "十二月"],
	     				monthNamesShort: ["一月", "二月", "三月", "四月", "五月", "六月", "七月", "八月", "九月", "十月", "十一月", "十二月"],
	     				dayNames: ["周日", "周一", "周二", "周三", "周四", "周五", "周六"],
	     				dayNamesShort: ["周日", "周一", "周二", "周三", "周四", "周五", "周六"],
	     				today: ["今天"],
                        firstDay: 1,
                        buttonText: {
                                      today: '本月',
                                      month: '月',
	     		                      week: '周',
	     			                  day: '日',
	     			                  prev: '上一月',
	     		                      next: '下一月'
	                    },
	     				dayClick: function(date, allDay, jsEvent, view) { 
	     					var selectdate = $.fullCalendar.formatDate(date, "MM/dd/yyyy");//选择当前日期的时间转换
	     					localStorage.setItem("selectdate",selectdate);
	     					localStorage.setItem("dateType","2");
	     					IO.get("views/fullcalendar/agenda-day.html",null,function(){
	        	     			$("#mainpage").html(arguments[0], true);   	     			
	        	         	});
                            
	     				}
	     			});
	            	 
	             }
			})
		}
		
		/**
		 * 获取权限
		 */
		this.getUserByRole = function(){
			$.ajax({
				 type: "post",
	             url: "userController/getUser.action",
	             async: false,
	             dataType: "json",  
	             data:{
	            	 teamId : cookie.getCookie("teamId")
	             },
	             success: function(data){
	            	 role = data.userRole;
	             }
			})
		}
		
	}	
	return Calendar;
},{
	requires : ['io'
	            ,'common-module/src/cookie']
});
