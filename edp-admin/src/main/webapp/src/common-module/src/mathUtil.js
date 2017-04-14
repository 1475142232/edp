KISSY.add('common-module/src/mathUtil',function(S){
	function MathUtil(){
		var _this = this;
		// n1 *n2  防止js精度丢失
		this.accMul = function(n1,n2){
			var m = 0;
			var s1 = n1.toString();
			var s2 = n2.toString();
			if(s1.indexOf(".")>=0){
				m += s1.split(".")[1].length;
			}
			if(s2.indexOf(".")>=0){
				m += s2.split(".")[1].length;
			}
			return Number(s1.replace(".",""))*Number(s2.replace(".",""))/Math.pow(10,m);
		};
		// n1/n2 防止js精度丢失
		this.accDiv = function(n1,n2){
			var t1 = 0;
			var t2 = 0;
			if(n1.indexOf(".")>=0){
				t1 = n1.toString().split(".")[1].length;
			}
			if(n2.indexOf(".")>=0){
				t2 = n2.toString().split(".")[1].length;
			}
			
			return Number(n1.toString().replace(".","")/n2.toString().replace(".",""))*Math.pow(10,t2-t1);
		};
		
		// n1/n2 防止js精度丢失
		this.accAdd = function(n1,n2){
			var m = 0;
			var s1 = n1.toString();
			var s2 = n2.toString();
			var t1 = 0;
			var t2 = 0;
			if(s1.indexOf(".")>=0){
				t1 = s1.toString().split(".")[1].length;
			}
			if(s2.indexOf(".")>=0){
				t2 = s2.toString().split(".")[1].length;
			}
			m = Math.pow(10,Math.max(t1,t2));
			return Math.round(n1*m +n2*m)/m;
		};
		
		this.accSub = function(n1,n2){
			_this.accAdd(n1,-n2);
		};
	}
	return MathUtil;
}); 