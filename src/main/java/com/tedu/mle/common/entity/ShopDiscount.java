package com.tedu.mle.common.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * shop_discount
 * @author 
 */
public class ShopDiscount implements Serializable {
    /**
     * 优惠类型id
     */
    private Long discountId;

    /**
     * 优惠名称
     */
    private String discountName;

    /**
     * 商户id
     */
    private Long shopIdF;

    /**
     * 优惠描述
     */
    private String desc;

    /**
     * 百分百减价
     */
    private Double percent;

    /**
     * 立减
     */
    private Double direct;

    /**
     * 最小金额
     */
    private Double minPrice;

    /**
     * 创建时间
     */
    private Date createtime;

    private static final long serialVersionUID = 1L;

    public Long getDiscountId() {
        return discountId;
    }

    public void setDiscountId(Long discountId) {
        this.discountId = discountId;
    }

    public String getDiscountName() {
        return discountName;
    }

    public void setDiscountName(String discountName) {
        this.discountName = discountName;
    }

    public Long getShopIdF() {
        return shopIdF;
    }

    public void setShopIdF(Long shopIdF) {
        this.shopIdF = shopIdF;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Double getPercent() {
        return percent;
    }

    public void setPercent(Double percent) {
        this.percent = percent;
    }

    public Double getDirect() {
        return direct;
    }

    public void setDirect(Double direct) {
        this.direct = direct;
    }

    public Double getMinPrice() {
        return minPrice;
    }

    public void setMinPrice(Double minPrice) {
        this.minPrice = minPrice;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }
}