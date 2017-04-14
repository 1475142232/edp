package com.edp.serviceI.columnInfo;


import com.edp.serviceI.dto.ColumnInfoDto;

public interface ColumnInfoServiceI {

	ColumnInfoDto getColumnList(ColumnInfoDto dto);

	Integer addColumn(ColumnInfoDto dto);

	Integer editColumn(ColumnInfoDto dto);

	ColumnInfoDto findColumnById(ColumnInfoDto dto);
	

}
