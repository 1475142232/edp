package com.edp.serviceI.dto;


import com.edp.serviceI.common.BaseDto;

public class TreeDto extends BaseDto{
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
    
    private Integer treeNodeVersion;
    
    private String text;
    
    private Boolean leaf;
    
    private String node_desc;
    
    private String levels;
    
    private String treeNodeModifiedperson;

    private String treeNodeId;
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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
        this.node_desc = treeNodeDesc == null ? null : treeNodeDesc.trim();
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
        this.treeNodeParent = treeNodeParent;
    }

    public Integer getTreeNodeVersion() {
		return treeNodeVersion;
	}

	public void setTreeNodeVersion(Integer treeNodeVersion) {
		this.treeNodeVersion = treeNodeVersion;
	}

	public String getTreeNodeIfLeaf() {
        return treeNodeIfLeaf;
    }

    public void setTreeNodeIfLeaf(String treeNodeIfLeaf) {
        this.treeNodeIfLeaf = treeNodeIfLeaf == null ? null : treeNodeIfLeaf.trim();
        if(treeNodeIfLeaf.equals("0")){
        	this.leaf=false;
        }else if(treeNodeIfLeaf.equals("1")){
        	this.leaf=true;
        }
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
        this.levels = treeNodeLevels+"";
    }

    

	public String getLevels() {
		return levels;
	}

	public void setLevels(String levels) {
		this.levels = levels;
	}

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

	public String getNode_desc() {
		return node_desc;
	}

	public void setNode_desc(String node_desc) {
		this.node_desc = node_desc;
	}

	public String getTreeNodeModifiedperson() {
		return treeNodeModifiedperson;
	}

	public void setTreeNodeModifiedperson(String treeNodeModifiedperson) {
		this.treeNodeModifiedperson = treeNodeModifiedperson;
	}

	public String getTreeNodeId() {
		return treeNodeId;
	}

	public void setTreeNodeId(String treeNodeId) {
		this.treeNodeId = treeNodeId;
	}
    
	
	
}
