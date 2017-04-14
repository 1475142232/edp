package com.edp.dao.mapper;

import com.edp.dao.domain.PlanInfoPO;
import com.edp.dao.domain.PlanInfoPOCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PlanInfoPOMapper {
    int countByExample(PlanInfoPOCriteria example);

    int deleteByExample(PlanInfoPOCriteria example);

    int deleteByPrimaryKey(Integer id);

    int insert(PlanInfoPO record);

    int insertSelective(PlanInfoPO record);

    List<PlanInfoPO> selectByExample(PlanInfoPOCriteria example);

    PlanInfoPO selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PlanInfoPO record, @Param("example") PlanInfoPOCriteria example);

    int updateByExample(@Param("record") PlanInfoPO record, @Param("example") PlanInfoPOCriteria example);

    int updateByPrimaryKeySelective(PlanInfoPO record);

    int updateByPrimaryKey(PlanInfoPO record);
}