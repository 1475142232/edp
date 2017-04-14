package com.edp.dao.mapper;

import com.edp.dao.domain.MenuInfoPo;
import com.edp.dao.domain.MenuInfoPoCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MenuInfoPoMapper {
    int countByExample(MenuInfoPoCriteria example);

    int deleteByExample(MenuInfoPoCriteria example);

    int deleteByPrimaryKey(Integer id);

    int insert(MenuInfoPo record);

    int insertSelective(MenuInfoPo record);

    List<MenuInfoPo> selectByExample(MenuInfoPoCriteria example);

    MenuInfoPo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MenuInfoPo record, @Param("example") MenuInfoPoCriteria example);

    int updateByExample(@Param("record") MenuInfoPo record, @Param("example") MenuInfoPoCriteria example);

    int updateByPrimaryKeySelective(MenuInfoPo record);

    int updateByPrimaryKey(MenuInfoPo record);

	Integer countMenuByRoleId(@Param("roleId")Integer roleId, @Param("menuId")Integer menuId);

	Integer delMenuByRoleId(@Param("roleId")Integer roleId);

	Integer addMenuByRoleId(@Param("roleId")Integer roleId, @Param("menuId")Integer menuId);
}