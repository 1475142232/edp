package com.edp.dao.mapper;

import com.edp.dao.domain.RuleInfoPo;
import com.edp.dao.domain.RuleInfoPoCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RuleInfoPoMapper {
    int countByExample(RuleInfoPoCriteria example);

    int deleteByExample(RuleInfoPoCriteria example);

    int deleteByPrimaryKey(String id);

    int insert(RuleInfoPo record);

    int insertSelective(RuleInfoPo record);

    List<RuleInfoPo> selectByExample(RuleInfoPoCriteria example);

    RuleInfoPo selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") RuleInfoPo record, @Param("example") RuleInfoPoCriteria example);

    int updateByExample(@Param("record") RuleInfoPo record, @Param("example") RuleInfoPoCriteria example);

    int updateByPrimaryKeySelective(RuleInfoPo record);

    int updateByPrimaryKey(RuleInfoPo record);

	List<RuleInfoPo> findRuleByProduceId(String ruleProduct);
}