package com.edp.dao.domain;

public class FunConTrolPo {
    private Integer id;

    private String funcId;

    private String controlId;

    private String fcState;

    private Byte fcVersion;

    private String fcName;

    private String sceneId;

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

    public String getControlId() {
        return controlId;
    }

    public void setControlId(String controlId) {
        this.controlId = controlId == null ? null : controlId.trim();
    }

    public String getFcState() {
        return fcState;
    }

    public void setFcState(String fcState) {
        this.fcState = fcState == null ? null : fcState.trim();
    }

    public Byte getFcVersion() {
        return fcVersion;
    }

    public void setFcVersion(Byte fcVersion) {
        this.fcVersion = fcVersion;
    }

    public String getFcName() {
        return fcName;
    }

    public void setFcName(String fcName) {
        this.fcName = fcName == null ? null : fcName.trim();
    }

    public String getSceneId() {
        return sceneId;
    }

    public void setSceneId(String sceneId) {
        this.sceneId = sceneId == null ? null : sceneId.trim();
    }
}