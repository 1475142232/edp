package com.edp.dao.domain;

public class ProblemInfoPo {
    private Integer id;

    private String problemName;

    private String problemType;

    private String problemLv;

    private Integer problemStarteUser;

    private String problemStarteTime;

    private String problemStarteName;

    private Integer problemEndUser;

    private String problemEndTime;

    private String problemEndName;

    private String problemState;

    private String productId;

    private String problemDesc;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProblemName() {
        return problemName;
    }

    public void setProblemName(String problemName) {
        this.problemName = problemName == null ? null : problemName.trim();
    }

    public String getProblemType() {
        return problemType;
    }

    public void setProblemType(String problemType) {
        this.problemType = problemType == null ? null : problemType.trim();
    }

    public String getProblemLv() {
        return problemLv;
    }

    public void setProblemLv(String problemLv) {
        this.problemLv = problemLv == null ? null : problemLv.trim();
    }

    public Integer getProblemStarteUser() {
        return problemStarteUser;
    }

    public void setProblemStarteUser(Integer problemStarteUser) {
        this.problemStarteUser = problemStarteUser;
    }

    public String getProblemStarteTime() {
        return problemStarteTime;
    }

    public void setProblemStarteTime(String problemStarteTime) {
        this.problemStarteTime = problemStarteTime == null ? null : problemStarteTime.trim();
    }

    public String getProblemStarteName() {
        return problemStarteName;
    }

    public void setProblemStarteName(String problemStarteName) {
        this.problemStarteName = problemStarteName == null ? null : problemStarteName.trim();
    }

    public Integer getProblemEndUser() {
        return problemEndUser;
    }

    public void setProblemEndUser(Integer problemEndUser) {
        this.problemEndUser = problemEndUser;
    }

    public String getProblemEndTime() {
        return problemEndTime;
    }

    public void setProblemEndTime(String problemEndTime) {
        this.problemEndTime = problemEndTime == null ? null : problemEndTime.trim();
    }

    public String getProblemEndName() {
        return problemEndName;
    }

    public void setProblemEndName(String problemEndName) {
        this.problemEndName = problemEndName == null ? null : problemEndName.trim();
    }

    public String getProblemState() {
        return problemState;
    }

    public void setProblemState(String problemState) {
        this.problemState = problemState == null ? null : problemState.trim();
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId == null ? null : productId.trim();
    }

    public String getProblemDesc() {
        return problemDesc;
    }

    public void setProblemDesc(String problemDesc) {
        this.problemDesc = problemDesc == null ? null : problemDesc.trim();
    }
}