/**
 * 进度
 */
KISSY.add('common-module/src/percent',function(S,IO,Node){
	function Percent(){
		var _this = this;
		var current;
		var counter = 0;
		var si;
		this.start = function(message){
			_this.initPercent(message);
			si = setInterval(function(){
				new IO({
					url : "percentController/getPercent.action",
					type : "post",
					dataType:"json",
					success : function(data) {
						if(current === data){
							counter ++;
						}else{
							counter = 0;
						}
						if(counter >=10){
							_this.closePercent();
						}
						if(data>=current){
							current = data;
							_this.updateData(current);
							if(current>=100){
								_this.updateData(current);
								_this.closePercent();
							}
						}
					},
					error : function() {
						_this.closePercent();
					}
				});
			},1000);
		};
		this.showMessage = function() {
				Node.all("#percentZ").css("height",document.body.scrollHeight);
				Node.all("#percentZ").show();
				var dataperc = current;
				var barperc = Math.round(dataperc*5.56);
				Node.all("#pBar").css("width",barperc);
				Node.all("#pLabel").css('left', 0);
				Node.all("#pLabel").append('<div class="perc"></div>');
		};		
		this.updateData = function(data){
			var dataperc = data;
			var barperc = Math.round(dataperc*5.56);
			Node.all("#pBar").css("width",barperc);
			var length =Node.all("#pBar").css('width'),
			perc = Math.round(parseInt(length)/5.56),
			labelpos = (parseInt(length)-2);
			Node.all("#pLabel").css('left', labelpos);
			Node.all('#ppoint').text(perc+'%');
		};
		this.initPercent = function(){
			current = 0;
			_this.showMessage();
		};
		this.closePercent = function(){
			Node.all("#percentZ").hide();
			Node.all("#pLabel").css('left', 0);
			Node.all("#pBar").css("width",0);
			Node.all('#ppoint').text(0+'%');
			clearInterval(si);
			new IO({
				url : "percentController/clearPercent.action",
				type : "post",
				dataType:"json",
				success : function(){
				},
				error : function() {
					_this.closePercent();
				}
			});
		};
	}
	return Percent;
},{
	requires : ['io','node']
});