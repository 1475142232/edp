package com.edp.serviceI.dto;

public class TreeInfoDto extends TreeBaseDto{
	 private String id;

	    private String treeName;

	    private String treeType;

	    private String treeState;

	    private String treeParent;

	    private String treeLeaf;

	    private String treeId;

	    private String taskId;

	    private Integer treeCreat;

	    private String treeCreattime;

	    private String treeDesc;

	    public String getId() {
	        return id;
	    }

	    public void setId(String id) {
	        this.id = id == null ? null : id.trim();
	    }

	    public String getTreeName() {
	        return treeName;
	    }

	    public void setTreeName(String treeName) {
	        this.treeName = treeName == null ? null : treeName.trim();
	    }

	    public String getTreeType() {
	        return treeType;
	    }

	    public void setTreeType(String treeType) {
	        this.treeType = treeType == null ? null : treeType.trim();
	    }

	    public String getTreeState() {
	        return treeState;
	    }

	    public void setTreeState(String treeState) {
	        this.treeState = treeState == null ? null : treeState.trim();
	    }

	    public String getTreeParent() {
	        return treeParent;
	    }

	    public void setTreeParent(String treeParent) {
	        this.treeParent = treeParent == null ? null : treeParent.trim();
	    }

	    public String getTreeLeaf() {
	        return treeLeaf;
	    }

	    public void setTreeLeaf(String treeLeaf) {
	        this.treeLeaf = treeLeaf == null ? null : treeLeaf.trim();
	    }

	    public String getTreeId() {
	        return treeId;
	    }

	    public void setTreeId(String treeId) {
	        this.treeId = treeId == null ? null : treeId.trim();
	    }

	    public String getTaskId() {
	        return taskId;
	    }

	    public void setTaskId(String taskId) {
	        this.taskId = taskId == null ? null : taskId.trim();
	    }

	    public Integer getTreeCreat() {
	        return treeCreat;
	    }

	    public void setTreeCreat(Integer treeCreat) {
	        this.treeCreat = treeCreat;
	    }

	    public String getTreeCreattime() {
	        return treeCreattime;
	    }

	    public void setTreeCreattime(String treeCreattime) {
	        this.treeCreattime = treeCreattime == null ? null : treeCreattime.trim();
	    }

	    public String getTreeDesc() {
	        return treeDesc;
	    }

	    public void setTreeDesc(String treeDesc) {
	        this.treeDesc = treeDesc == null ? null : treeDesc.trim();
	    }
}