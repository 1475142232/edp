KISSY.add("fullcalendar-module/src/agenda-day", function(S,IO ,Calendar, Cookie){
	function AgendaDay(){
		var _this = this;
		var cookie = new Cookie();
		var role = "";
		this.init=function(){
			var selectdate=localStorage.getItem("selectdate");
			var dateType=localStorage.getItem("dateType");
			_this.getUserByRole();
			_this.goFullcalendar();
			if(dateType==1 && (role === "1" || role ==="2")){
				_this.goBossDay(selectdate);
			}else{
				_this.goAgendaDay(selectdate);
			}
			
		}
		/**
		 * BOSS获取当日信息
		 */
		this.goBossDay=function(selectdate){
			var dateType=localStorage.getItem("dateType");
			$.ajax({
				 type: "post",
	             url: "TaskInfoController/findTaskInfoByProductIdAndDate.action",
	             dataType: "json",  
	             data:{
	            	 date : selectdate,
	            	 productId : localStorage.getItem("productId")
	             },
	             success: function(data){
	            	 for(var i=0 ; i<data.length ; i++){
            			 var html='';
	            		 for(var j=0; j<data[i].length ; j++){
	            				 html+='<div class="task-list-info">'+
	     						           '<div class="task-list-info-name">'+
								                '<span class="info-taskname">'+data[i][j].taskName+'</span>'+
								                '<span class="info-tasktime">预计交付时间：</span>'+
								                '<span class="info-tasktime">'+data[i][j].taskDoneTime+'</span>'+
								                '<span class="info-tasktime">状态：</span>'+
								                '<span class="info-tasktime">'+data[i][j].StateString+'</span>'+
							               '</div>'+
							               '<div class="task-list-info-desc">'+
							                    data[i][j].taskSpec+
							               '</div>'+
						               '</div>';
	            		 }
	            		 if(i==0){
	            			 if(data[i].length!=0){
	            				 $("#myYesList").html(html);
	            			 }else{
	            				 $("#myYesList").html('<div class="task-list-info">暂无相关任务。</div>');
	            			 }
	            		 }else{
	            			 if(data[i].length!=0){
	            				 $("#myNoList").html(html);
	            			 }else{
	            				 $("#myNoList").html('<div class="task-list-info">暂无相关任务。</div>');
	            			 }
	            		 }
	            	 }
	             }
			})    
		}
		/**
		 * 获取当日的信息
		 */
		this.goAgendaDay=function(selectdate){
			$.ajax({
				 type: "post",
	             url: "TaskInfoController/findTaskInfoByDate.action",
	             dataType: "json",  
	             data:{
	            	 date : selectdate
	             },
	             success: function(data){
	            	 for(var i=0 ; i<data.length ; i++){
            			 var html='';
	            		 for(var j=0; j<data[i].length ; j++){
	            				 html+='<div class="task-list-info">'+
	     						           '<div class="task-list-info-name">'+
								                '<span class="info-taskname">'+data[i][j].taskName+'</span>'+
								                '<span class="info-tasktime">预计交付时间：</span>'+
								                '<span class="info-tasktime">'+data[i][j].taskDoneTime+'</span>'+
								                '<span class="info-tasktime">状态：</span>'+
								                '<span class="info-tasktime">'+data[i][j].StateString+'</span>'+
							               '</div>'+
							               '<div class="task-list-info-desc">'+
							                    data[i][j].taskSpec+
							               '</div>'+
						               '</div>';
	            		 }
	            		 if(i==0){
	            			 if(data[i].length!=0){
	            				 $("#myYesList").html(html);
	            			 }else{
	            				 $("#myYesList").html('<div class="task-list-info">暂无相关任务。</div>');
	            			 }
	            		 }else{
	            			 if(data[i].length!=0){
	            				 $("#myNoList").html(html);
	            			 }else{
	            				 $("#myNoList").html('<div class="task-list-info">暂无相关任务。</div>');
	            			 }
	            		 }
	            	 }
	             }
			})
		}
		/**
		 * 跳转日历
		 */
		this.goFullcalendar = function(){
			var type = "2"
			var dateType=localStorage.getItem("dateType");
			if(dateType==1 && (role === "1" || role ==="2")){
				type = "1";
			}
			$("#problem_back").on("click",function(){
				IO.get("views/fullcalendar/agenda-views.html",null,function(){
	     			$("#mainpage").html(arguments[0], true);
                    var calendar = new Calendar();
                    calendar.init(type);
	         	});
			});
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
	
	return AgendaDay;
},{
	requires : ['io',
	            'fullcalendar-module/src/calendar'
	            ,'common-module/src/cookie']
});