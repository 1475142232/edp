package com.edp.serviceI.ruleinfo;

import java.util.List;

import com.edp.serviceI.dto.RuleInfoDto;
/**
 * 
 * @author wu_jianxing(吴建行)
 * 时间：2016.4.25
 */
public interface RuleInfoServiceI {
	public RuleInfoDto getAllRules(RuleInfoDto dto);
	public RuleInfoDto getRuleById(String Id);
	public void addRule(RuleInfoDto dto);
	public void updateRule(RuleInfoDto dto);
	public void delRule(String Id);
	public List<RuleInfoDto> findRuleByProduceId(String ruleProduct);
}
