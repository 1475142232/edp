package com.edp.dao.mapper;

import com.edp.dao.domain.TreeInfoPo;
import com.edp.dao.domain.TreeInfoPoCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TreeInfoPoMapper {
    int countByExample(TreeInfoPoCriteria example);

    int deleteByExample(TreeInfoPoCriteria example);

    int deleteByPrimaryKey(String id);

    int insert(TreeInfoPo record);

    int insertSelective(TreeInfoPo record);

    List<TreeInfoPo> selectByExample(TreeInfoPoCriteria example);

    TreeInfoPo selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") TreeInfoPo record, @Param("example") TreeInfoPoCriteria example);

    int updateByExample(@Param("record") TreeInfoPo record, @Param("example") TreeInfoPoCriteria example);

    int updateByPrimaryKeySelective(TreeInfoPo record);

    int updateByPrimaryKey(TreeInfoPo record);

	Integer addFuncitonByScene(@Param("function_id")String functionId, @Param("scene_id")String sceneId,@Param("control_id")String controlId);

	Integer delFuncitonByScene( @Param("scene_id")String sceneId,@Param("control_id")String controlId);
}