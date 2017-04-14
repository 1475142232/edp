package com.edp.dao.domain;

public class PicInfoPo {
    private String id;

    private String picName;

    private byte[] picHtml;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getPicName() {
        return picName;
    }

    public void setPicName(String picName) {
        this.picName = picName == null ? null : picName.trim();
    }

    public byte[] getPicHtml() {
        return picHtml;
    }

    public void setPicHtml(byte[] picHtml) {
        this.picHtml = picHtml;
    }
}