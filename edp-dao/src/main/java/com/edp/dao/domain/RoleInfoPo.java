package com.edp.dao.domain;

public class RoleInfoPo {
    private Integer id;

    private String roleName;

    private String roleSpec;

    private String roleDept;

    private String roleType;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName == null ? null : roleName.trim();
    }

    public String getRoleSpec() {
        return roleSpec;
    }

    public void setRoleSpec(String roleSpec) {
        this.roleSpec = roleSpec == null ? null : roleSpec.trim();
    }

    public String getRoleDept() {
        return roleDept;
    }

    public void setRoleDept(String roleDept) {
        this.roleDept = roleDept == null ? null : roleDept.trim();
    }

    public String getRoleType() {
        return roleType;
    }

    public void setRoleType(String roleType) {
        this.roleType = roleType == null ? null : roleType.trim();
    }
    
    
}