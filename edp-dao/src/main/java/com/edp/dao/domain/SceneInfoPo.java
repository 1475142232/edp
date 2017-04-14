package com.edp.dao.domain;

public class SceneInfoPo {
    private String id;

    private String sceneName;

    private String sceneSpec;

    private String sceneType;

    private String sceneCreateTime;

    private String sceneCreater;

    private String sceneModifiedTime;

    private String sceneModifiedPerson;

    private Byte version;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getSceneName() {
        return sceneName;
    }

    public void setSceneName(String sceneName) {
        this.sceneName = sceneName == null ? null : sceneName.trim();
    }

    public String getSceneSpec() {
        return sceneSpec;
    }

    public void setSceneSpec(String sceneSpec) {
        this.sceneSpec = sceneSpec == null ? null : sceneSpec.trim();
    }

    public String getSceneType() {
        return sceneType;
    }

    public void setSceneType(String sceneType) {
        this.sceneType = sceneType == null ? null : sceneType.trim();
    }

    public String getSceneCreateTime() {
        return sceneCreateTime;
    }

    public void setSceneCreateTime(String sceneCreateTime) {
        this.sceneCreateTime = sceneCreateTime == null ? null : sceneCreateTime.trim();
    }

    public String getSceneCreater() {
        return sceneCreater;
    }

    public void setSceneCreater(String sceneCreater) {
        this.sceneCreater = sceneCreater == null ? null : sceneCreater.trim();
    }

    public String getSceneModifiedTime() {
        return sceneModifiedTime;
    }

    public void setSceneModifiedTime(String sceneModifiedTime) {
        this.sceneModifiedTime = sceneModifiedTime == null ? null : sceneModifiedTime.trim();
    }

    public String getSceneModifiedPerson() {
        return sceneModifiedPerson;
    }

    public void setSceneModifiedPerson(String sceneModifiedPerson) {
        this.sceneModifiedPerson = sceneModifiedPerson == null ? null : sceneModifiedPerson.trim();
    }

    public Byte getVersion() {
        return version;
    }

    public void setVersion(Byte version) {
        this.version = version;
    }
}