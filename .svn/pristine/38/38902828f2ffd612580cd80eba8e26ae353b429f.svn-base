package com.edp.dao.mapper;

import com.edp.dao.domain.PlanTasksPO;
import com.edp.dao.domain.PlanTasksPOCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PlanTasksPOMapper {
    int countByExample(PlanTasksPOCriteria example);

    int deleteByExample(PlanTasksPOCriteria example);

    int deleteByPrimaryKey(Integer id);

    int insert(PlanTasksPO record);

    int insertSelective(PlanTasksPO record);

    List<PlanTasksPO> selectByExampleWithBLOBs(PlanTasksPOCriteria example);

    List<PlanTasksPO> selectByExample(PlanTasksPOCriteria example);

    PlanTasksPO selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PlanTasksPO record, @Param("example") PlanTasksPOCriteria example);

    int updateByExampleWithBLOBs(@Param("record") PlanTasksPO record, @Param("example") PlanTasksPOCriteria example);

    int updateByExample(@Param("record") PlanTasksPO record, @Param("example") PlanTasksPOCriteria example);

    int updateByPrimaryKeySelective(PlanTasksPO record);

    int updateByPrimaryKeyWithBLOBs(PlanTasksPO record);

    int updateByPrimaryKey(PlanTasksPO record);

    int patchInsert(List<PlanTasksPO> planTasksPOs);
}