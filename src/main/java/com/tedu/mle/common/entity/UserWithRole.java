package com.tedu.mle.common.entity;

import java.io.Serializable;

/**
 * user_with_role
 * @author 
 */
public class UserWithRole implements Serializable {
    /**
     * 主键
     */
    private Long id;

    /**
     * 用户id
     */
    private Long userIdF;

    /**
     * 权限id
     */
    private Long roleIdF;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserIdF() {
        return userIdF;
    }

    public void setUserIdF(Long userIdF) {
        this.userIdF = userIdF;
    }

    public Long getRoleIdF() {
        return roleIdF;
    }

    public void setRoleIdF(Long roleIdF) {
        this.roleIdF = roleIdF;
    }
}