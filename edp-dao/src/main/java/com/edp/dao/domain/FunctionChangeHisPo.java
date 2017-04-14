package com.edp.dao.domain;

public class FunctionChangeHisPo {
    private Integer id;

    private String funcId;

    private String funcName;

    private String funcEnName;

    private String funcSpec;

    private String funcCreateTime;

    private String funcCreater;

    private String funcModifiedTime;

    private String funcModifiedPerson;

    private String funcPic;

    private Byte version;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFuncId() {
        return funcId;
    }

    public void setFuncId(String funcId) {
        this.funcId = funcId == null ? null : funcId.trim();
    }

    public String getFuncName() {
        return funcName;
    }

    public void setFuncName(String funcName) {
        this.funcName = funcName == null ? null : funcName.trim();
    }

    public String getFuncEnName() {
        return funcEnName;
    }

    public void setFuncEnName(String funcEnName) {
        this.funcEnName = funcEnName == null ? null : funcEnName.trim();
    }

    public String getFuncSpec() {
        return funcSpec;
    }

    public void setFuncSpec(String funcSpec) {
        this.funcSpec = funcSpec == null ? null : funcSpec.trim();
    }

    public String getFuncCreateTime() {
        return funcCreateTime;
    }

    public void setFuncCreateTime(String funcCreateTime) {
        this.funcCreateTime = funcCreateTime == null ? null : funcCreateTime.trim();
    }

    public String getFuncCreater() {
        return funcCreater;
    }

    public void setFuncCreater(String funcCreater) {
        this.funcCreater = funcCreater == null ? null : funcCreater.trim();
    }

    public String getFuncModifiedTime() {
        return funcModifiedTime;
    }

    public void setFuncModifiedTime(String funcModifiedTime) {
        this.funcModifiedTime = funcModifiedTime == null ? null : funcModifiedTime.trim();
    }

    public String getFuncModifiedPerson() {
        return funcModifiedPerson;
    }

    public void setFuncModifiedPerson(String funcModifiedPerson) {
        this.funcModifiedPerson = funcModifiedPerson == null ? null : funcModifiedPerson.trim();
    }

    public String getFuncPic() {
        return funcPic;
    }

    public void setFuncPic(String funcPic) {
        this.funcPic = funcPic == null ? null : funcPic.trim();
    }

    public Byte getVersion() {
        return version;
    }

    public void setVersion(Byte version) {
        this.version = version;
    }
}