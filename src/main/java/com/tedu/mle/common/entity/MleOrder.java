package com.tedu.mle.common.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * mle_order
 * @author 
 */
public class MleOrder implements Serializable {
    /**
     * 订单id
     */
    private Long orderId;

    /**
     * 商铺id
     */
    private Long shopIdF;

    /**
     * 用户id
     */
    private Long userIdF;

    /**
     * 骑手id
     */
    private Long hoursemanIdF;

    /**
     * 配送地址id
     */
    private Long userAddressIdF;

    /**
     * 订单状态
     */
    private Integer state;

    /**
     * 创建时间
     */
    private Date createtime;

    /**
     * 完成时间
     */
    private Date finishtime;

    /**
     * 预计送达时间
     */
    private Date expTime;

    /**
     * 订单总价
     */
    private Double totalPrice;

    /**
     * 配送费
     */
    private Double shippingFee;

    /**
     * 支付类型id
     */
    private Long payTypeIdF;

    /**
     * 订单类型id
     */
    private Long orderTypeIdF;

    private static final long serialVersionUID = 1L;

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Long getShopIdF() {
        return shopIdF;
    }

    public void setShopIdF(Long shopIdF) {
        this.shopIdF = shopIdF;
    }

    public Long getUserIdF() {
        return userIdF;
    }

    public void setUserIdF(Long userIdF) {
        this.userIdF = userIdF;
    }

    public Long getHoursemanIdF() {
        return hoursemanIdF;
    }

    public void setHoursemanIdF(Long hoursemanIdF) {
        this.hoursemanIdF = hoursemanIdF;
    }

    public Long getUserAddressIdF() {
        return userAddressIdF;
    }

    public void setUserAddressIdF(Long userAddressIdF) {
        this.userAddressIdF = userAddressIdF;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Date getFinishtime() {
        return finishtime;
    }

    public void setFinishtime(Date finishtime) {
        this.finishtime = finishtime;
    }

    public Date getExpTime() {
        return expTime;
    }

    public void setExpTime(Date expTime) {
        this.expTime = expTime;
    }

    public Double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Double getShippingFee() {
        return shippingFee;
    }

    public void setShippingFee(Double shippingFee) {
        this.shippingFee = shippingFee;
    }

    public Long getPayTypeIdF() {
        return payTypeIdF;
    }

    public void setPayTypeIdF(Long payTypeIdF) {
        this.payTypeIdF = payTypeIdF;
    }

    public Long getOrderTypeIdF() {
        return orderTypeIdF;
    }

    public void setOrderTypeIdF(Long orderTypeIdF) {
        this.orderTypeIdF = orderTypeIdF;
    }
}