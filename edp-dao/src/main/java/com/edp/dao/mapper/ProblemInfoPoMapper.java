package com.edp.dao.mapper;

import com.edp.dao.domain.ProblemInfoPo;
import com.edp.dao.domain.ProblemInfoPoCriteria;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProblemInfoPoMapper {
    int countByExample(ProblemInfoPoCriteria example);

    int deleteByExample(ProblemInfoPoCriteria example);

    int deleteByPrimaryKey(Integer id);

    int insert(ProblemInfoPo record);

    int insertSelective(ProblemInfoPo record);

    List<ProblemInfoPo> selectByExampleWithBLOBs(ProblemInfoPoCriteria example);

    List<ProblemInfoPo> selectByExample(ProblemInfoPoCriteria example);

    ProblemInfoPo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ProblemInfoPo record, @Param("example") ProblemInfoPoCriteria example);

    int updateByExampleWithBLOBs(@Param("record") ProblemInfoPo record, @Param("example") ProblemInfoPoCriteria example);

    int updateByExample(@Param("record") ProblemInfoPo record, @Param("example") ProblemInfoPoCriteria example);

    int updateByPrimaryKeySelective(ProblemInfoPo record);

    int updateByPrimaryKeyWithBLOBs(ProblemInfoPo record);

    int updateByPrimaryKey(ProblemInfoPo record);

}