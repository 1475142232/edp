package com.edp.dao.mapper;

import com.edp.dao.domain.FunctionInfoPo;
import com.edp.dao.domain.FunctionInfoPoCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FunctionInfoPoMapper {
    int countByExample(FunctionInfoPoCriteria example);

    int deleteByExample(FunctionInfoPoCriteria example);

    int deleteByPrimaryKey(String id);

    int insert(FunctionInfoPo record);

    int insertSelective(FunctionInfoPo record);

    List<FunctionInfoPo> selectByExample(FunctionInfoPoCriteria example);

    FunctionInfoPo selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") FunctionInfoPo record, @Param("example") FunctionInfoPoCriteria example);

    int updateByExample(@Param("record") FunctionInfoPo record, @Param("example") FunctionInfoPoCriteria example);

    int updateByPrimaryKeySelective(FunctionInfoPo record);

    int updateByPrimaryKey(FunctionInfoPo record);
}