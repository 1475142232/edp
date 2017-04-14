package com.edp.serviceI.dto;

import com.edp.serviceI.common.BaseDto;

public class DictionaryDto extends BaseDto{
private int	id;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}

private String	dName;
private int	dType;
public String getdName() {
	return dName;
}
public void setdName(String dName) {
	this.dName = dName;
}
public int getdType() {
	return dType;
}
public void setdType(int dType) {
	this.dType = dType;
}
public String getdValue() {
	return dValue;
}
public void setdValue(String dValue) {
	this.dValue = dValue;
}

private String	dValue;

}
