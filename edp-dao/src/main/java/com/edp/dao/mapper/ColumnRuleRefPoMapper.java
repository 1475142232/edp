package com.edp.dao.mapper;

import com.edp.dao.domain.ColumnInfoPo;
import com.edp.dao.domain.ColumnRuleRefPo;
import com.edp.dao.domain.ColumnRuleRefPoCriteria;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ColumnRuleRefPoMapper {
    int countByExample(ColumnRuleRefPoCriteria example);

    int deleteByExample(ColumnRuleRefPoCriteria example);

    int deleteByPrimaryKey(Integer id);

    int insert(ColumnRuleRefPo record);

    int insertSelective(ColumnRuleRefPo record);

    List<ColumnRuleRefPo> selectByExample(ColumnRuleRefPoCriteria example);

    ColumnRuleRefPo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ColumnRuleRefPo record, @Param("example") ColumnRuleRefPoCriteria example);

    int updateByExample(@Param("record") ColumnRuleRefPo record, @Param("example") ColumnRuleRefPoCriteria example);

    int updateByPrimaryKeySelective(ColumnRuleRefPo record);

    int updateByPrimaryKey(ColumnRuleRefPo record);

	List<ColumnInfoPo> findColumnByFunId(@Param("func_id")String funcId);
}