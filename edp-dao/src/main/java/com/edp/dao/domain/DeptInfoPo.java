package com.edp.dao.domain;

public class DeptInfoPo {
    private Integer id;

    private String deptName;

    private String deptSpec;

    private String deptCreatetime;

    private String deptCreate;

    private String deptPhone;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName == null ? null : deptName.trim();
    }

    public String getDeptSpec() {
        return deptSpec;
    }

    public void setDeptSpec(String deptSpec) {
        this.deptSpec = deptSpec == null ? null : deptSpec.trim();
    }

    public String getDeptCreatetime() {
        return deptCreatetime;
    }

    public void setDeptCreatetime(String deptCreatetime) {
        this.deptCreatetime = deptCreatetime == null ? null : deptCreatetime.trim();
    }

    public String getDeptCreate() {
        return deptCreate;
    }

    public void setDeptCreate(String deptCreate) {
        this.deptCreate = deptCreate == null ? null : deptCreate.trim();
    }

    public String getDeptPhone() {
        return deptPhone;
    }

    public void setDeptPhone(String deptPhone) {
        this.deptPhone = deptPhone == null ? null : deptPhone.trim();
    }
}