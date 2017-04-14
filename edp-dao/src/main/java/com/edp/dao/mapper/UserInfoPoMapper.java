package com.edp.dao.mapper;

import com.edp.dao.domain.UserInfoPo;
import com.edp.dao.domain.UserInfoPoCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserInfoPoMapper {
    int countByExample(UserInfoPoCriteria example);

    int deleteByExample(UserInfoPoCriteria example);

    int deleteByPrimaryKey(Integer id);

    int insert(UserInfoPo record);

    int insertSelective(UserInfoPo record);

    List<UserInfoPo> selectByExample(UserInfoPoCriteria example);

    UserInfoPo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") UserInfoPo record, @Param("example") UserInfoPoCriteria example);

    int updateByExample(@Param("record") UserInfoPo record, @Param("example") UserInfoPoCriteria example);

    int updateByPrimaryKeySelective(UserInfoPo record);

    int updateByPrimaryKey(UserInfoPo record);

	List<UserInfoPo> findUserByProductId(@Param("product_id") String productId,@Param("user_id")String user_id);

	List<UserInfoPo> findUserByTeamId(@Param("team_id")String teamId);

	String findRoleById(@Param("team_id")String teamId, @Param("user_id")Integer id);

	Integer delUserByTeamId(@Param("team_id")String teamId, @Param("user_id")Integer id);

	Integer delUserByProductId(@Param("product_id")String productId, @Param("user_id")Integer userId);

	List<UserInfoPo> selectUserByTeamId(@Param("team_id")String teamId, @Param("userIds")String userIds);

	Integer editUserRoleById(@Param("user_id")Integer id, @Param("team_id")String teamId, @Param("role_type")String userRole);
}