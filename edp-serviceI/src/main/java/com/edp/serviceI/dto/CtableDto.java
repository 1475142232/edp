package com.edp.serviceI.dto;

import java.util.List;

import com.edp.serviceI.common.BaseDto;

public class CtableDto extends BaseDto{
	private String $$hashKey;
	private String id;
	private String name;
	private List<CtableDto> children;
	public String get$$hashKey() {
		return $$hashKey;
	}
	public void set$$hashKey(String $$hashKey) {
		this.$$hashKey = $$hashKey;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<CtableDto> getChildren() {
		return children;
	}
	public void setChildren(List<CtableDto> children) {
		this.children = children;
	}
	

}
