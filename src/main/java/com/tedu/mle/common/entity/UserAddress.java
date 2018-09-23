package com.tedu.mle.common.entity;

import java.io.Serializable;

/**
 * user_address
 * @author 
 */
public class UserAddress implements Serializable {
    /**
     * 用户地址id
     */
    private Long userAddressId;

    /**
     * 用户id
     */
    private Long userIdF;

    /**
     * 地址
     */
    private String address;

    private static final long serialVersionUID = 1L;

    public Long getUserAddressId() {
        return userAddressId;
    }

    public void setUserAddressId(Long userAddressId) {
        this.userAddressId = userAddressId;
    }

    public Long getUserIdF() {
        return userIdF;
    }

    public void setUserIdF(Long userIdF) {
        this.userIdF = userIdF;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}