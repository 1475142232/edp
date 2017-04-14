package com.edp.serviceI.dto;

import com.edp.serviceI.common.BaseDto;

public class ColumnRuleRefDto extends BaseDto{
	private Integer id;

	private String ruleValue;

	private String columnId;

	private String ruleId;
	
	private String ruleName;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getRuleValue() {
		return ruleValue;
	}

	public void setRuleValue(String ruleValue) {
		this.ruleValue = ruleValue == null ? null : ruleValue.trim();
	}

	public String getColumnId() {
		return columnId;
	}

	public void setColumnId(String columnId) {
		this.columnId = columnId == null ? null : columnId.trim();
	}

	public String getRuleId() {
		return ruleId;
	}

	public void setRuleId(String ruleId) {
		this.ruleId = ruleId == null ? null : ruleId.trim();
	}

	public String getRuleName() {
		return ruleName;
	}

	public void setRuleName(String ruleName) {
		this.ruleName = ruleName;
	}
	
	

}
