package com.tedu.mle.common.entity;

import java.io.Serializable;

/**
 * role
 * @author 
 */
public class Role implements Serializable {
    /**
     * 权限id
     */
    private Long roleId;

    /**
     * 权限名
     */
    private String roleName;

    /**
     * 权限描述
     */
    private String roleDesc;

    private static final long serialVersionUID = 1L;

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getRoleDesc() {
        return roleDesc;
    }

    public void setRoleDesc(String roleDesc) {
        this.roleDesc = roleDesc;
    }
}