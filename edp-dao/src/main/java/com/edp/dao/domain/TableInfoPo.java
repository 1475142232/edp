package com.edp.dao.domain;

public class TableInfoPo {
    private String id;

    private String tableName;

    private String dataId;

    private String tableCreat;

    private String tableCreattime;

    private String tableDesc;

    private String modifyCreat;

    private String modifyCreattime;

    private String tableState;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName == null ? null : tableName.trim();
    }

    public String getDataId() {
        return dataId;
    }

    public void setDataId(String dataId) {
        this.dataId = dataId == null ? null : dataId.trim();
    }

    public String getTableCreat() {
        return tableCreat;
    }

    public void setTableCreat(String tableCreat) {
        this.tableCreat = tableCreat == null ? null : tableCreat.trim();
    }

    public String getTableCreattime() {
        return tableCreattime;
    }

    public void setTableCreattime(String tableCreattime) {
        this.tableCreattime = tableCreattime == null ? null : tableCreattime.trim();
    }

    public String getTableDesc() {
        return tableDesc;
    }

    public void setTableDesc(String tableDesc) {
        this.tableDesc = tableDesc == null ? null : tableDesc.trim();
    }

    public String getModifyCreat() {
        return modifyCreat;
    }

    public void setModifyCreat(String modifyCreat) {
        this.modifyCreat = modifyCreat == null ? null : modifyCreat.trim();
    }

    public String getModifyCreattime() {
        return modifyCreattime;
    }

    public void setModifyCreattime(String modifyCreattime) {
        this.modifyCreattime = modifyCreattime == null ? null : modifyCreattime.trim();
    }

    public String getTableState() {
        return tableState;
    }

    public void setTableState(String tableState) {
        this.tableState = tableState == null ? null : tableState.trim();
    }
}