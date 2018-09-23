package com.tedu.mle.common.entity;

import java.io.Serializable;

/**
 * order_with_dish
 * @author 
 */
public class OrderWithDish implements Serializable {
    /**
     * 主键
     */
    private Long id;

    /**
     * 订单id
     */
    private Long orderIdF;

    /**
     * 菜品数量
     */
    private Long dishIdF;

    /**
     * 份数
     */
    private Integer dishNum;

    /**
     * 条目总价
     */
    private Double totalPrice;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getOrderIdF() {
        return orderIdF;
    }

    public void setOrderIdF(Long orderIdF) {
        this.orderIdF = orderIdF;
    }

    public Long getDishIdF() {
        return dishIdF;
    }

    public void setDishIdF(Long dishIdF) {
        this.dishIdF = dishIdF;
    }

    public Integer getDishNum() {
        return dishNum;
    }

    public void setDishNum(Integer dishNum) {
        this.dishNum = dishNum;
    }

    public Double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Double totalPrice) {
        this.totalPrice = totalPrice;
    }
}