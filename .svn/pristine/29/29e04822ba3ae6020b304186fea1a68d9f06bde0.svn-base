package com.edp.dao.mapper;

import com.edp.dao.domain.ColumnInfoPo;
import com.edp.dao.domain.ColumnInfoPoCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ColumnInfoPoMapper {
    int countByExample(ColumnInfoPoCriteria example);

    int deleteByExample(ColumnInfoPoCriteria example);

    int deleteByPrimaryKey(String id);

    int insert(ColumnInfoPo record);

    int insertSelective(ColumnInfoPo record);

    List<ColumnInfoPo> selectByExample(ColumnInfoPoCriteria example);

    ColumnInfoPo selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") ColumnInfoPo record, @Param("example") ColumnInfoPoCriteria example);

    int updateByExample(@Param("record") ColumnInfoPo record, @Param("example") ColumnInfoPoCriteria example);

    int updateByPrimaryKeySelective(ColumnInfoPo record);

    int updateByPrimaryKey(ColumnInfoPo record);
}