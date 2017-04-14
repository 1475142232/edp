package com.edp.dao.mapper;

import com.edp.dao.domain.SceneInfoPo;
import com.edp.dao.domain.SceneInfoPoCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SceneInfoPoMapper {
    int countByExample(SceneInfoPoCriteria example);

    int deleteByExample(SceneInfoPoCriteria example);

    int deleteByPrimaryKey(String id);

    int insert(SceneInfoPo record);

    int insertSelective(SceneInfoPo record);

    List<SceneInfoPo> selectByExample(SceneInfoPoCriteria example);

    SceneInfoPo selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") SceneInfoPo record, @Param("example") SceneInfoPoCriteria example);

    int updateByExample(@Param("record") SceneInfoPo record, @Param("example") SceneInfoPoCriteria example);

    int updateByPrimaryKeySelective(SceneInfoPo record);

    int updateByPrimaryKey(SceneInfoPo record);

	List<SceneInfoPo> findSceneByFuncId(@Param("funcId") String funcId);

	List<String> findControlIdById(@Param("id")String id);

	List<String> findFunctionIdById(@Param("id")String id);

	Integer updateScencById(@Param("scene_id")String oldId, @Param("newId")String id);

}