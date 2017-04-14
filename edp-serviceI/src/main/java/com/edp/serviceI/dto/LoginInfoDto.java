package com.edp.serviceI.dto;

import com.edp.serviceI.common.BaseDto;

public class LoginInfoDto extends BaseDto{
	   private Integer id;
	   
	   private String userId;
	   
	   private String userName;
	   
	   private String userPwd;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		 this.userId = userId == null ? null : userId.trim();
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName == null ? null : userName.trim();
	}

	public String getUserPwd() {
		return userPwd;
	}

	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}
	 
	
	   
}
