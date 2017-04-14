function getCookie(name) {
	var arr = document.cookie
			.match(new RegExp("(^| )" + name + "=([^;]*)(;|$)"));
	if (arr != null) {
		
		return unescape(arr[2]);
	} else {
		return null;
	}
}
var lang = getCookie("clientlanguage");
var localeCode = "";
if(lang == null){
	lang = navigator.language || navigator.browserLanguage;
}
localeCode = lang;
lang = lang.toLowerCase();
//alert(localeCode+'localeCode');

var script = document.createElement('script');
script.setAttribute("type", "text/javascript");
if (lang == null || lang =='zh-cn') {
	script.setAttribute("src", "./src/i18n/validation_message.js");
} else {
	script.setAttribute("src","./src/i18n/validation_message_"
			+ lang + ".js");
}

document.getElementsByTagName('head')[0].appendChild(script); 