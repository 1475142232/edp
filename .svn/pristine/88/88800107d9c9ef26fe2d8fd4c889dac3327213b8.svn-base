package com.edp.serviceI.user;

import java.util.List;

import com.edp.serviceI.dto.UserInfoDto;

public interface UserServiceI {
    
	/**
	 * 登录验证
	 * @param UserInfoDto
	 * @return List<UserInfoDto>
	 */
	List<UserInfoDto> LoginUser(UserInfoDto dto,String teamId);

	Integer registerUser(UserInfoDto dto, String teamId);

	List<UserInfoDto> findUserByProductId(String productId);

	List<UserInfoDto> findUserByTeamId(String teamId);

	Integer delUserByTeamId(String teamId, Integer id);

	List<UserInfoDto> findAllUser(UserInfoDto userMail);

	Integer delUserByProductId(String productId, Integer userId);

	List<UserInfoDto> selectUserByTeamId(String teamId, String userIds);

	Integer editUserById(UserInfoDto user);

	String findRoleById(String teamId, Integer id);

	Integer editUserRoleById(UserInfoDto user,String teamId);

	String findUserById(String taskOwner);


}
