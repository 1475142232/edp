KISSY.add('common-module/src/cookie',function(S, Node, IO) {
	function Cookie(){
		/*
		 * 设置cookie
		 * c_name 名称
		 * value  之
		 * expiredays 
		 */
		this.setCookie = function(c_name,value,expiredays){
			var exdate=new Date()
			exdate.setDate(exdate.getDate()+expiredays)
			document.cookie=c_name+ "=" +escape(value)+
			((expiredays==null) ? "" : ";expires="+exdate.toGMTString())
		};
		
		/*
		 * 获取cookie
		 */
		this.getCookie = function(c_name){
			if (document.cookie.length>0) {
			  c_start=document.cookie.indexOf(c_name + "=")
			  if (c_start!=-1){ 
			    c_start=c_start + c_name.length+1 
			    c_end=document.cookie.indexOf(";",c_start)
			    if (c_end==-1) c_end=document.cookie.length
			    	return unescape(document.cookie.substring(c_start,c_end))
			    } 
			}
			return ""
		};
		
		/**
		 * 删除cookie
		 */
		this.delCookie = function(name){
			var exp = new Date();
			exp.setTime(exp.getTime() - 1);
			var cval=getCookie(name);
			if(cval!=null)
			document.cookie= name + "="+cval+";expires="+exp.toGMTString();
		}
	};
	
	return Cookie;
},{
	requires : []
});