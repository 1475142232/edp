package com.edp.serviceI.dto;

import java.util.List;

import com.edp.serviceI.common.BaseDto;

public class StencilDto extends BaseDto{
	private String id;

    private String treeNodeName;

    private String treeNodeType;

    private String treeNodeDesc;

    private String treeNodeState;

    private String treeNodeParent;

    private String treeNodeIfLeaf;

    private String treeNodeCreatetime;

    private String treeNodeCreateperson;

    private String treeNodeModifiedtime;

    private Integer treeNodeLevels;

    private String treeNodeModifiedperson;

    private String treeNodeId;
    
    private String text;
    
    private boolean expanded;
    
    private List<StencilDto> children;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getTreeNodeName() {
        return treeNodeName;
    }

    public void setTreeNodeName(String treeNodeName) {
        this.treeNodeName = treeNodeName == null ? null : treeNodeName.trim();
        this.text = treeNodeName == null ? null : treeNodeName.trim();
    }

    public String getTreeNodeType() {
        return treeNodeType;
    }

    public void setTreeNodeType(String treeNodeType) {
        this.treeNodeType = treeNodeType == null ? null : treeNodeType.trim();
    }

    public String getTreeNodeDesc() {
        return treeNodeDesc;
    }

    public void setTreeNodeDesc(String treeNodeDesc) {
        this.treeNodeDesc = treeNodeDesc == null ? null : treeNodeDesc.trim();
    }

    public String getTreeNodeState() {
        return treeNodeState;
    }

    public void setTreeNodeState(String treeNodeState) {
        this.treeNodeState = treeNodeState == null ? null : treeNodeState.trim();
    }

    public String getTreeNodeParent() {
        return treeNodeParent;
    }

    public void setTreeNodeParent(String treeNodeParent) {
        this.treeNodeParent = treeNodeParent == null ? null : treeNodeParent.trim();
    }

    public String getTreeNodeIfLeaf() {
        return treeNodeIfLeaf;
    }

    public void setTreeNodeIfLeaf(String treeNodeIfLeaf) {
        this.treeNodeIfLeaf = treeNodeIfLeaf == null ? null : treeNodeIfLeaf.trim();
    }

    public String getTreeNodeCreatetime() {
        return treeNodeCreatetime;
    }

    public void setTreeNodeCreatetime(String treeNodeCreatetime) {
        this.treeNodeCreatetime = treeNodeCreatetime == null ? null : treeNodeCreatetime.trim();
    }

    public String getTreeNodeCreateperson() {
        return treeNodeCreateperson;
    }

    public void setTreeNodeCreateperson(String treeNodeCreateperson) {
        this.treeNodeCreateperson = treeNodeCreateperson == null ? null : treeNodeCreateperson.trim();
    }

    public String getTreeNodeModifiedtime() {
        return treeNodeModifiedtime;
    }

    public void setTreeNodeModifiedtime(String treeNodeModifiedtime) {
        this.treeNodeModifiedtime = treeNodeModifiedtime == null ? null : treeNodeModifiedtime.trim();
    }

    public Integer getTreeNodeLevels() {
        return treeNodeLevels;
    }

    public void setTreeNodeLevels(Integer treeNodeLevels) {
        this.treeNodeLevels = treeNodeLevels;
        if(treeNodeLevels<5){
        	expanded=true;
        }else{
        	expanded=false;
        }
    }

    public String getTreeNodeModifiedperson() {
        return treeNodeModifiedperson;
    }

    public void setTreeNodeModifiedperson(String treeNodeModifiedperson) {
        this.treeNodeModifiedperson = treeNodeModifiedperson == null ? null : treeNodeModifiedperson.trim();
    }

    public String getTreeNodeId() {
        return treeNodeId;
    }

    public void setTreeNodeId(String treeNodeId) {
        this.treeNodeId = treeNodeId == null ? null : treeNodeId.trim();
    }

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public List<StencilDto> getChildren() {
		return children;
	}

	public void setChildren(List<StencilDto> children) {
		this.children = children;
	}

	public boolean isExpanded() {
		return expanded;
	}

	public void setExpanded(boolean expanded) {
		this.expanded = expanded;
	}
    
    

}
