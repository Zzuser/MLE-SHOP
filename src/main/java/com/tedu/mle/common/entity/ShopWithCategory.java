package com.tedu.mle.common.entity;

import java.io.Serializable;

/**
 * shop_with_category
 * @author 
 */
public class ShopWithCategory implements Serializable {
    /**
     * 主键
     */
    private Long id;

    /**
     * 店铺id
     */
    private Long shopIdF;

    /**
     * 分类id
     */
    private Long shopCategoryIdF;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getShopIdF() {
        return shopIdF;
    }

    public void setShopIdF(Long shopIdF) {
        this.shopIdF = shopIdF;
    }

    public Long getShopCategoryIdF() {
        return shopCategoryIdF;
    }

    public void setShopCategoryIdF(Long shopCategoryIdF) {
        this.shopCategoryIdF = shopCategoryIdF;
    }
}