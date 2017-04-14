KISSY.add('common-module/src/calendar-choice', function(S, Calendar, IO, Json,Node,Event) {
	function CalendarChoice() {
		var currentDate;
		var _this = this;
		IO({
			url: 'payBackController/getCurrentTime.action',
			//type: "post",
			dataType : 'json',
			async : false,
			//cache : false,
			success: function(data){
				currentDate = data;
			},
			error: function(XMLHttpRequest, textStatus, errorThrown){
			}
		});
		/**
		 * 查询条件时间区间框
		 * className   起始时间类名
		 */
		this.startDatepicker = function(className) {
			new Calendar.DatePicker({
				disabled : false,
				trigger : '.' + className,
				maxDate : currentDate,
				autoRender : true
			});
		};
		
		/**
		 * 查询条件时间区间框
		 * className     结束时间类名
		 * startDateId   起始日期Id名
		 */
		this.blurEvent = function(startDateId, className, endDate){
			var dateTime;
			dateTime = new Calendar.DatePicker({
				trigger : '.' + className,
				autoRender : true
			});
			Event.on("#" + startDateId, "blur", function(){
				if (Node.all("#" + startDateId).val() !== null && Node.all("#" + startDateId).val() !== "") {
					//Node.all("." + className).attr("disabled", false);
					Node.all("#validateDate").remove();
					dateTime.enable();
					dateTime.set("maxDate", currentDate);
					dateTime.set("minDate", Node.all("#" + startDateId).val());
				} else {
					//Node.all("." + className).attr("disabled", true);
					dateTime.disable();
					Node.all("." + className).val("");
				}
			});
			Event.on("."+className,"click",function(){
				if (Node.all("#" + startDateId).val() === null || Node.all("#" + startDateId).val() === "") {
					dateTime.disable();
					dateTime.set("visible", false);
					Node.all("#validateDate").remove();
					Node.all("#" + endDate).parent().append(newErrorMsg("validateDate",'起始日期不能为空！')); 
				}
			});
			Event.on("."+className,"blur",function(){
					Node.all("#validateDate").remove();
			});
		};
	}
	return CalendarChoice;
	
}, {
	requires : [ 'bui/calendar', 'io', 'json','node','event']	
});