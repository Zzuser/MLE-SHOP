package com.tedu.mle.common.entity;

import java.io.Serializable;

/**
 * shop_category
 * @author 
 */
public class ShopCategory implements Serializable {
    /**
     * 店铺分类id
     */
    private Long shopCategoryId;

    /**
     * 店铺分类名
     */
    private String shopCategoryName;

    /**
     * 描述
     */
    private String shopCategoryDesc;

    private static final long serialVersionUID = 1L;

    public Long getShopCategoryId() {
        return shopCategoryId;
    }

    public void setShopCategoryId(Long shopCategoryId) {
        this.shopCategoryId = shopCategoryId;
    }

    public String getShopCategoryName() {
        return shopCategoryName;
    }

    public void setShopCategoryName(String shopCategoryName) {
        this.shopCategoryName = shopCategoryName;
    }

    public String getShopCategoryDesc() {
        return shopCategoryDesc;
    }

    public void setShopCategoryDesc(String shopCategoryDesc) {
        this.shopCategoryDesc = shopCategoryDesc;
    }
}