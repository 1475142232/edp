package com.edp.dao.mapper;

import com.edp.dao.domain.ModuleInfoPo;
import com.edp.dao.domain.ModuleInfoPoCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ModuleInfoPoMapper {
    int countByExample(ModuleInfoPoCriteria example);

    int deleteByExample(ModuleInfoPoCriteria example);

    int deleteByPrimaryKey(String id);

    int insert(ModuleInfoPo record);

    int insertSelective(ModuleInfoPo record);

    List<ModuleInfoPo> selectByExample(ModuleInfoPoCriteria example);

    ModuleInfoPo selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") ModuleInfoPo record, @Param("example") ModuleInfoPoCriteria example);

    int updateByExample(@Param("record") ModuleInfoPo record, @Param("example") ModuleInfoPoCriteria example);

    int updateByPrimaryKeySelective(ModuleInfoPo record);

    int updateByPrimaryKey(ModuleInfoPo record);
}