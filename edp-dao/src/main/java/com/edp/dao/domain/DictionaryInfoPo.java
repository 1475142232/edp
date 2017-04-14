package com.edp.dao.domain;

public class DictionaryInfoPo {
    private int id;

    private String dName;

    private int dType;

    private String dValue;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getdName() {
        return dName;
    }

    public void setdName(String dName) {
        this.dName = dName == null ? null : dName.trim();
    }

    public int getdType() {
        return dType;
    }

    public void setdType(int dType) {
        this.dType = dType;
    }

    public String getdValue() {
        return dValue;
    }

    public void setdValue(String dValue) {
        this.dValue = dValue == null ? null : dValue.trim();
    }
}