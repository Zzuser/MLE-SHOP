package com.tedu.mle.common.entity;

import java.io.Serializable;

/**
 * pay_type
 * @author 
 */
public class PayType implements Serializable {
    /**
     * 支付类型id
     */
    private Long payTypeId;

    /**
     * 支付类型
     */
    private String payName;

    /**
     * 描述
     */
    private String desc;

    private static final long serialVersionUID = 1L;

    public Long getPayTypeId() {
        return payTypeId;
    }

    public void setPayTypeId(Long payTypeId) {
        this.payTypeId = payTypeId;
    }

    public String getPayName() {
        return payName;
    }

    public void setPayName(String payName) {
        this.payName = payName;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}