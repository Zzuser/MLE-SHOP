package com.tedu.mle.common.entity;

import java.io.Serializable;

/**
 * order_type
 * @author 
 */
public class OrderType implements Serializable {
    /**
     * 订单类型id
     */
    private Long orderTypeId;

    /**
     * 订单类型
     */
    private String orderTypeName;

    /**
     * 描述
     */
    private String desc;

    private static final long serialVersionUID = 1L;

    public Long getOrderTypeId() {
        return orderTypeId;
    }

    public void setOrderTypeId(Long orderTypeId) {
        this.orderTypeId = orderTypeId;
    }

    public String getOrderTypeName() {
        return orderTypeName;
    }

    public void setOrderTypeName(String orderTypeName) {
        this.orderTypeName = orderTypeName;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}