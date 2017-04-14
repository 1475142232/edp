package com.edp.serviceI.columnRuleRef;

import com.edp.serviceI.dto.ColumnRuleRefDto;

public interface ColumnRuleRefServiceI {

	public ColumnRuleRefDto getAllColumnRuleRef(ColumnRuleRefDto dto);

	public ColumnRuleRefDto getColumnRuleRefDtoById(Integer id);

	public void updateColumnRuleRef(ColumnRuleRefDto dto);

	public void addColumnRuleRef(ColumnRuleRefDto dto);

	public void delColumnRuleRef(Integer id);
	
	public void delColumnRuleRefByColumnId(ColumnRuleRefDto dto);

}
