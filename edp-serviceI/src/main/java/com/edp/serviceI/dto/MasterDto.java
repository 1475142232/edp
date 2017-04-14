package com.edp.serviceI.dto;

public class MasterDto extends TreeBaseDto{
	
	private String id;
	
	private String treeNodeName;

    private String treeNodeType;
    
    private String treeNodeState;
    
    private String treeNodeParent;
    
    private String treeNodeId;
    
    private String treeId; 
    
    public MasterDto(){
    	
    }
    
    public MasterDto(String id,String name){
    	this.id = id;
    	this.text = name;
    	this.treeNodeName=name;
    	this.expanded = true;
    }

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
		this.treeNodeName = treeNodeName;
	}

	public String getTreeNodeType() {
		return treeNodeType;
	}

	public void setTreeNodeType(String treeNodeType) {
		this.treeNodeType = treeNodeType;
	}

	public String getTreeNodeState() {
		return treeNodeState;
	}

	public void setTreeNodeState(String treeNodeState) {
		this.treeNodeState = treeNodeState;
	}


	public String getTreeNodeId() {
		return treeNodeId;
	}

	public void setTreeNodeId(String treeNodeId) {
		this.treeNodeId = treeNodeId;
	}

	public String getTreeNodeParent() {
		return treeNodeParent;
	}

	public void setTreeNodeParent(String treeNodeParent) {
		this.treeNodeParent = treeNodeParent;
	}

	public String getTreeId() {
		return treeId;
	}

	public void setTreeId(String treeId) {
		this.treeId = treeId;
	}

	
    
}
