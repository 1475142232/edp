package com.edp.serviceI.dto;

import java.util.List;

import com.edp.serviceI.common.BaseDto;

public class TreeBaseDto extends BaseDto {
	
	protected String text;
	
	protected Boolean leaf;

	protected List children;
	
	protected Boolean expanded; 
	
	protected Boolean checked; 
	
	protected String Parents;

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public Boolean getLeaf() {
		return leaf;
	}

	public void setLeaf(Boolean leaf) {
		this.leaf = leaf;
	}

	public List getChildren() {
		return children;
	}

	public void setChildren(List children) {
		this.children = children;
	}

	public Boolean getExpanded() {
		return expanded;
	}

	public void setExpanded(Boolean expanded) {
		this.expanded = expanded;
	}

	public Boolean getChecked() {
		return checked;
	}

	public void setChecked(Boolean checked) {
		this.checked = checked;
	}

	public String getParents() {
		return Parents;
	}

	public void setParents(String parents) {
		Parents = parents;
	}
	
	
	

}
