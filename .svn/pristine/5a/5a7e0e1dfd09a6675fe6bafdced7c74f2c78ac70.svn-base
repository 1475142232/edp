package com.edp.dao.mapper;

import com.edp.dao.domain.RoleInfoPo;
import com.edp.dao.domain.RoleInfoPoCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RoleInfoPoMapper {
    int countByExample(RoleInfoPoCriteria example);

    int deleteByExample(RoleInfoPoCriteria example);

    int deleteByPrimaryKey(Integer id);

    int insert(RoleInfoPo record);

    int insertSelective(RoleInfoPo record);

    List<RoleInfoPo> selectByExample(RoleInfoPoCriteria example);

    RoleInfoPo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") RoleInfoPo record, @Param("example") RoleInfoPoCriteria example);

    int updateByExample(@Param("record") RoleInfoPo record, @Param("example") RoleInfoPoCriteria example);

    int updateByPrimaryKeySelective(RoleInfoPo record);

    int updateByPrimaryKey(RoleInfoPo record);
    
    Integer deleteByUserId(@Param("role_id")Integer id);

	Integer addUserInfo(@Param("role_id")Integer id, @Param("user_id")Integer parseInt);

	List<Integer> findRoleByUserId(@Param("user_id")Integer id);

	List<String> findRoleTypeByUserId(@Param("user_id")Integer id);
}