package com.edp.dao.mapper;

import com.edp.dao.domain.ColumnPicPo;
import com.edp.dao.domain.ColumnPicPoCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ColumnPicPoMapper {
    int countByExample(ColumnPicPoCriteria example);

    int deleteByExample(ColumnPicPoCriteria example);

    int deleteByPrimaryKey(Integer id);

    int insert(ColumnPicPo record);

    int insertSelective(ColumnPicPo record);

    List<ColumnPicPo> selectByExample(ColumnPicPoCriteria example);

    ColumnPicPo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ColumnPicPo record, @Param("example") ColumnPicPoCriteria example);

    int updateByExample(@Param("record") ColumnPicPo record, @Param("example") ColumnPicPoCriteria example);

    int updateByPrimaryKeySelective(ColumnPicPo record);

    int updateByPrimaryKey(ColumnPicPo record);
}