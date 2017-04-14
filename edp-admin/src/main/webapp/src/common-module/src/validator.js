/**
 * 校验特殊字符
 */
KISSY.add('common-module/src/validator',function(S, Node){
    /**
     * 
     */
    /**
     * 
     */
    function Validator(){
	     this.validateInvalid=function(message){
	      var rule = /\<|\>|\%3E|\%3C/;
	      if(rule.test(message)){
	        return false;
	      }
	      return true;
	     };
	     
	     this.validateInvalidSpaceil=function(message){
	      var rule = /[\&|\$]/;
	      if(rule.test(message)){
	        return false;
	      }
	      return true;
	     };
	  
	     this.validateInvalidFinspcell=function(message){
	      var rule = /[\+|\-|\#|\$|\!|\(|\)|\_|\.|\/|\\]/;
	      if(rule.test(message)){
	       return false;
	      }
	      return true;
	     };
	     
	     /**
	      * 验证正则规则
	      * data 输入数据
	      * rule 正则表达式
	      */
	     this.validateReg = function(data, rule) {
	    	 if (!rule.test(data)) {
	    		 return false;
	    	 }
	    	 return true;
	     };
	     
	     /**
	      * 【用户名】校验
	      * @returns {Boolean}
	      */
	     this.validateUserName = function(userNameId, userNameValId) {
	     	var username = $("#" + userNameId).val();
	     	var pattern1 = /[A-Z]/;
	     	var pattern2 = /[a-z]/;
	     	var num_reg = /^[0-9]*$/;
//	     	var str_reg = /^[A-Za-z]*$/;
	     	var subline_reg = /^[_]*$/;
	     	var num_str_subline_reg = /^[0-9a-zA-Z_]*$/;
	     	var chinese_reg = /[\u4E00-\u9FA5]/;
	     	var specialCharacters = RegExp(/[(\ )(\~)(\!)(\@)(\#)(\$)(\%)(\^)(\&)(\*)(\()(\))(\-)(\+)(\=)(\[)(\])(\{)(\})(\|)(\\)(\;)(\:)(\')(\")(\,)(\.)(\/)(\<)(\>)(\?)(\)]+/);

	     	if(chinese_reg.test(username)){
	     		Node.all("#" + userNameValId).remove();
	 			Node.all("#" + userNameId).parent().append(newErrorMsg(userNameValId,'用户名只能由字母、数字和\"_\"组成'));
	     		$("#" + userNameId).val('');
	     		return false;
	     	} else if(specialCharacters.test(username)){
	     		Node.all("#" + userNameValId).remove();
	 			Node.all("#" + userNameId).parent().append(newErrorMsg(userNameValId,'用户名只能由字母、数字和\"_\"组成'));
	     		$("#" + userNameId).val('');
	     		return false;
	     	} else if(6 > username.length || 20 < username.length) {
	     		Node.all("#" + userNameValId).remove();
	 			Node.all("#" + userNameId).parent().append(newErrorMsg(userNameValId,'用户名的长度为6~20个字符'));
	     		$("#" + userNameId).val('');
	     		return false;
	     	} else if(num_reg.test(username)) {
	     		Node.all("#" + userNameValId).remove();
	 			Node.all("#" + userNameId).parent().append(newErrorMsg(userNameValId,'用户名不能全为数字'));
	     		$("#" + userNameId).val('');
	     		return false;
	     	} 
	     	else if(subline_reg.test(username)) {
	     		Node.all("#" + userNameValId).remove();
	 			Node.all("#" + userNameId).parent().append(newErrorMsg(userNameValId,'用户名不能全是下划线'));
	     		$("#" + userNameId).val('');
	     		return false;
	     	} else if(!num_str_subline_reg.test(username)) {
	     		Node.all("#" + userNameValId).remove();
	 			Node.all("#" + userNameId).parent().append(newErrorMsg(userNameValId,'用户名只能由字母、数字和\"_\"组成'));
	     		$("#" + userNameId).val('');
	     		return false;
	     	} else if(!pattern1.test(username) && !pattern2.test(username)){
	     		Node.all("#" + userNameValId).remove();
	 			Node.all("#" + userNameId).parent().append(newErrorMsg(userNameValId,'用户名至少包含一个字母'));
	     		$("#" + userNameId).val('');
	     		return false;
	     	} else {
	     		return true;
	     	}
	     };
	     
	     this.validatePhone = function(phoneNumId, phoneNumValId) {
	    	 var pattern1 = /^1\d{10}$/;
	    	 var phoneNum = Node.all("#" + phoneNumId).val();
	    	 if (phoneNum != null && phoneNum != "") {
	    		 if (!pattern1.test(phoneNum)) {
		    		 Node.all("#" + phoneNumValId).remove();
		 			 Node.all("#" + phoneNumId).parent().append(newErrorMsg(phoneNumValId,'手机号码输入错误'));
		     		 return false;
		    	 } else {
		    		 return true;
		    	 }
	    	 }
	     };
	     
	     this.validateNum = function(val) {
	    	 var pattern1 = /^\d+$/;
	    	 if (val != null && val != "") {
	    		 if (!pattern1.test(val)) {
		     		 return false;
		    	 } else {
		    		 return true;
		    	 }
	    	 }else{
	    		 return false;
	    	 }
	     };
	     
	     this.validateTime = function(val){
	    	 var pattern1 = /^([0-1]?[0-9]|2[0-3]):([0-5][0-9]):([0-5][0-9])$/;
	    	 if (val != null && val != "") {
	    		 if (!pattern1.test(val)) {
		     		 return false;
		    	 } else {
		    		 return true;
		    	 }
	    	 }else{
	    		 return false;
	    	 }
	     };
	     
	     
    }
    return Validator;
}, {
	requires : ['node']
});