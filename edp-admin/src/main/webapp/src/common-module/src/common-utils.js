/**
 * 日期比较
 */
function checkDate(startDate,endDate)
{
	if(startDate!==""&&endDate!==""){
		var temp1= startDate.replace(new RegExp('-','gm'),'/');
		var temp2= endDate.replace(new RegExp('-','gm'),'/');
		var start=new Date(temp1).getTime();
		var end=new Date(temp2).getTime();
		if(start>end){
			return false;
		} else {
			return true;
		}
	} else {
		return true;
	}
	
}
/**
 * 日期格式化
 */
this.dateFormat = function(value){
	if(value !== null && value !== "" && value !== undefined){
    	return value.substring(0,10);
	} else {
		return null;
	}
};

/**
 * 日期格式化
 * 原格式：201504150000
 * 转换后：2015-04-15
 */
this.dateFormat1 = function(value){
	if(value !== null && value !== "" && value !== undefined){
    	return value.substring(0,4) + "-" + value.substring(4,6) + "-" + value.substring(6,8);
	} else {
		return null;
	}
};

/**
	 * 金额小数点控制及金额千分位
	 * vId 文本框ID 
	 * @author cgr
	 */
	var _format_rmb = function(vId){
		var num=$(vId).val();
    	num=num.replace(/\,/g,"");
		var arr=new Array();
		arr=num.split('.');
		var l=arr[0].split('').reverse();
		var t="";
		for (var  i= 0;  i< l.length;i++) {
			t+=l[i]+((i+1)%3===0&&(i+1)!==l.length?",":"");
		}
		t=t.split("").reverse().join("");
		if (arr.length===1&&arr[0]!=="") {
			var number=t+".00";
			$(vId).val(number);
		} else if(arr.length===2){
			var number=arr[1];
			if (number.length===1) {
				var numb=t+"."+number+"0";
				$(vId).val(numb);
			}else{
				var numb=t+"."+number;
				$(vId).val(numb);
			}
			
		}
	};
	
	/**
	 * 金额小数点控制及金额千分位
	 * num 金额数 
	 * @author xsf
	 */
	var _format_rmb_1 = function(num){
		if(parseFloat(num) === 0){
			return '0.00';
		}
		if(num!==null && num!=="" && num!==undefined){
			num=num.toString().replace(/\,/g,"");
			var arr=new Array();
			arr=num.toString().split('.');
			var l=arr[0].split('').reverse();
			var t="";
			for (var  i= 0;  i< l.length;i++) {
				t+=l[i]+((i+1)%3==0&&(i+1)!=l.length?",":"");
			}
			t=t.split("").reverse().join("");
			if (arr.length===1&&arr[0]!=="") {
				var number=t+".00";
				return number;
			} else if(arr.length===2){
				var number=arr[1];
				if (number.length===1) {
					var numb=t+"."+number+"0";
					
					return numb;
				}else{
					var numb=t+"."+number.substring(0,2);
					return numb;
				}
			}
		}
    
	};
	
	/**
	 * 毫秒转日期
	 * @returns {Date}
		var d = new Date();
	 	d.setTime(obj);
		var s = d.getFullYear()+"-"+(d.getMonth()+1)+'-'+d.getDate();
		return s;
	 */
	var longToDate = function (obj){
		if(obj!==null && obj!==""){
			var d = new Date();
		 	d.setTime(obj);
			var s = d.getFullYear()+"-"+(d.getMonth()+1)+'-'+d.getDate();
			return s;
		}
	};

/**
 * 文本域验证长度LN
 */
var validateArea=function(domId,maxLength){
	$("#"+domId).keydown(function(event){
		var id=$(this).val();
		var reg=new RegExp(" ","g");
		id=id.replace(reg,"");
		if(id.length>maxLength ){
			$(this).val(id.substring(0,maxLength-1));
		}
	}); 
	
	$("#"+domId).blur(function(event){
		var id=$(this).val();
		if(id.length>maxLength ){
			$(this).val(id.substring(0,maxLength));
		}
	});
};
	
/**
 * 公共错误信息LN
 */
var newErrorMsg=function(domId,msg){
	return "<span id='"+domId+"' name='"+domId+"' style='color:red; font-size:12px;' class='tipStyle'><em>"+msg+"</em></span>";
};	

/**
 * 公共错误信息LN
 */
var newMsg=function(domId,msg){
	return "<span id='"+domId+"'  name='"+domId+"' class='tipStyle'><em>"+msg+"</em></span>";
};	
	
	
/**
 * 中文书写格式转换
 * inputBoxId:输入框的id
 */
this.numChange = function(currencyDigits){
	var CN_ZERO = "零";
	var CN_ONE = "壹";
	var CN_TWO = "贰";
	var CN_THREE = "叁";
	var CN_FOUR = "肆";
	var CN_FIVE = "伍";
	var CN_SIX = "陆";
	var CN_SEVEN = "柒";
	var CN_EIGHT = "捌";
	var CN_NINE = "玖";
	var CN_TEN = "拾";
	var CN_HUNDER = "佰";
	var CN_THOUSAND = "仟";
	var CN_TEN_THOUSAND = "万";
	var CN_HUNDER_MILLION = "亿";
	var CN_SYMBOL = "";
	var CN_DOLLAR = "元";
	var CN_TEN_CENT = "角";
	var CN_CENT = "分";
	var CN_INTEGER = "整";
	
	var integral;
	var decimal;
	var outputCharacters;
	var parts;
	var digits,radices,bigRadices,decimals;//基数
	var zeroCount;
	var i,p,d;
	var quotient,modulus;//商,系数
	currencyDigits = currencyDigits.toString();
	currencyDigits = currencyDigits.replace(/,/g,"");//删除逗号和其他符号
	currencyDigits = currencyDigits.replace(/^0+/,"");//格式化尾部的0
	parts = currencyDigits.split(".");
	if(parts.length > 1){
		integral = parts[0];
		decimal = parts[1];
		decimal = decimal.substr(0,2);
	}
	digits = new Array(CN_ZERO,CN_ONE,CN_TWO,CN_THREE,CN_FOUR,CN_FIVE,CN_SIX,CN_SEVEN,CN_EIGHT,CN_NINE);
	radices = new Array("",CN_TEN,CN_HUNDER,CN_THOUSAND);
	bigRadices = new Array("",CN_TEN_THOUSAND,CN_HUNDER_MILLION);
	decimals = new Array(CN_TEN_CENT,CN_CENT);
	
	outputCharacters = "";
	if(Number(integral)>0){
		zeroCount = 0;
		for(i=0;i<integral.length;i++){
			p = integral.length-i-1;
			d = integral.substr(i,1);
			quotient = p/4;
			modulus = p%4;
			if(d === "0"){
				zeroCount++;
			}else{
				if(zeroCount>0){
					outputCharacters += digits[0];
				}
				zeroCount = 0;
				outputCharacters += digits[Number(d)]+radices[modulus];
			}
			if(modulus === 0 && zeroCount<4){
				outputCharacters += bigRadices[quotient];
			}
		}
		outputCharacters += CN_DOLLAR;
	}
	if(decimal !== ""){
		for(i=0;i<decimal.length;i++){
			d = decimal.substr(i,1);
			if(d !== "0"){
				outputCharacters += digits[Number(d)]+decimals[i];
			}
		}
	}
	if(outputCharacters === ""){
		outputCharacters = CN_ZERO+CN_DOLLAR;
	}
	if(decimal === "00"){
		outputCharacters += CN_INTEGER;
	}
	outputCharacters = CN_SYMBOL+outputCharacters;
	return outputCharacters;
 };	
	
	
	
	
//n1 *n2  防止js精度丢失
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
	
	/**
	 * 禁止退格键页面后退
	 * @param e
	 * @returns {Boolean}
	 */
	function bankBackSpace(e){
	    var ev=e||window.event;
	    //获取event对象
	    var obj=ev.target||ev.srcElement;
	    //获取事件源
	    var t=obj.type||obj.getAttribute('type');
	    var vReadOnly=obj.getAttribute('readonly');
	    var vEnabled=obj.getAttribute('enabled');
	    vReadOnly=(vReadOnly==null)?false:vReadOnly;
	    vEnabled=(vEnabled==null)?true:vEnabled;
	    var flag1=(ev.keyCode==8&&(t=="password"||t=="text"||t=="textarea")&&
	        (vReadOnly==true||vEnabled!=true||vReadOnly=='readonly'))?true:false;
	    var flag2=(ev.keyCode==8&&t!="password"&&t!="text"&&t!="textarea")?true:false;
	    if(flag2){
	    	window.event.keyCode=0;
	    	if(e&&e!='undefined'){
	    		ev.preventDefault();
	        	ev.stopPropagation();
	    	}

	        return false;
	    }
	    if(flag1){
	    	window.event.keyCode=0;
	    	if(e&&e!='undefined'){
	    		ev.preventDefault();
	        	ev.stopPropagation();
	    	}
	        return false;
	    }
	    // 禁止后退( alt + <- )
	    if (ev.altKey && ev.keyCode == 37) {
	        ev.keyCode = 0;
	        ev.cancelBulle = true;
	        return false;
	    }
	    // 禁止前进( alt + -> )
	    if (ev.altKey && ev.keyCode == 39) {
	        ev.keyCode = 0;
	        ev.cancelBulle = true;
	        return false;
	    }
	    // 禁止回车键
	    if (ev.keyCode == 13) {
	        ev.keyCode = 0;
	        ev.cancelBulle = true;
	        return false;
	    }
	    // 禁止空格键
	    if (ev.keyCode == 32) {
	        ev.keyCode = 0;
	        ev.cancelBulle = true;
	        return false;
	    }
	} 	
	
	//全角转半角
	this.ctoH=function(obj){
		var str=obj.val();
		var result="";
		for (var i = 0; i < str.length; i++){
			if (str.charCodeAt(i)===12288){
				result+= String.fromCharCode(str.charCodeAt(i)-12256);
				continue;
				}
			if (str.charCodeAt(i)>65280 && str.charCodeAt(i)<65375) result+= String.fromCharCode(str.charCodeAt(i)-65248);
			else result+= String.fromCharCode(str.charCodeAt(i));
			}
		obj.val(result);
	}; 	
	//币别转换
	this.ccyTransition=function(obj,ccyFlag){
		var result = "";
		if(null!==obj && ""!==obj && ''!==obj && undefined!==obj){
			if(null!==ccyFlag && ""!==ccyFlag && ''!==ccyFlag && undefined!==ccyFlag){
				if(obj==="DKK" || obj==="NOK" || obj==="SEK"){
					result="kr";
				}
				if(obj==="EUR"){
					result="€";
				}
				if(obj==="THB"){
					result="฿";
				}
				if(obj==="KRW"){
					result="₩";
				}
				if(obj==="SGD"){
					result="S$";
				}
				if(obj==="HKD"){
					result="HK＄";
				}
				if(obj==="CHF"){
					result="SF.;SFR.";
				}
				if(obj==="CNY"){
					result="¥";
				}
				if(obj==="PHP"){
					result="₱";
				}
				if(obj==="MOP"){
					result="PAT.;P.";
				}
				if(obj==="GBP"){
					result="£";
				}
				if(obj==="CAD"){
					result="Can.＄";
				}
				if(obj==="USD"){
					result="$";
				}
				if(obj==="JPY"){
					result="J￥";
				}
				if(obj==="AUD"){
					result="＄A.";
				}
				if(obj==="NZD"){
					result="＄NZ.";
				}
				if(obj==="CLF"){
					result="P.";
				}
				if(obj==="RUB"){
					result="руб";
				}
			}else{
				if(obj==="DKK"){
					result="丹麦克朗";
				}
				if(obj==="EUR"){
					result="欧元";
				}
				if(obj==="THB"){
					result="泰国铢";
				}
				if(obj==="KRW"){
					result="韩元";
				}
				if(obj==="SGD"){
					result="新加坡元";
				}
				if(obj==="HKD"){
					result="港币";
				}
				if(obj==="CHF"){
					result="瑞士法郎";
				}
				if(obj==="CNY"){
					result="人民币";
				}
				if(obj==="PHP"){
					result="菲律宾比索";
				}
				if(obj==="MOP"){
					result="澳门元";
				}
				if(obj==="GBP"){
					result="英镑";
				}
				if(obj==="CAD"){
					result="加拿大元";
				}
				if(obj==="USD"){
					result="美元";
				}
				if(obj==="JPY"){
					result="日元";
				}
				if(obj==="AUD"){
					result="澳大利亚元";
				}
				if(obj==="NZD"){
					result="新西兰元";
				}
				if(obj==="CLF"){
					result="智利比索";
				}
				if(obj==="RUB"){
					result="俄罗斯卢布";
				}
				if(obj==="NOK"){
					result="挪威克朗";
				}
				if(obj==="SEK"){
					result="瑞典克朗";
				}
			}
		}
		return result;
	}; 	
	/**
	 * 截取格式化后的金额，去除小数点后边位数(传递的参数必须是格式化后的)
	 * 根据业务需求韩元和日元金额没有小数点
	 * 此方法只适用于金额为韩元或日元小数点截取
	 */
	var subAmt=function(amt,ccy){
		var result="";
		if(ccy==="KRW" || ccy ==="JPY"){
			var amtSize=amt.indexOf(".");
			result = amt.substring(0,amtSize);
		}else{
			result = amt;
		}
		return result;
	};

	