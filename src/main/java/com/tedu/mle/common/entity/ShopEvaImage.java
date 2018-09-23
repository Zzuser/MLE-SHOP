package com.tedu.mle.common.entity;

import java.io.Serializable;

/**
 * shop_eva_image
 * @author 
 */
public class ShopEvaImage implements Serializable {
    /**
     * id
     */
    private Long shopEvaImageId;

    /**
     * 评价id
     */
    private Long shopEvaIdF;

    /**
     * 资源路径
     */
    private String url;

    /**
     * 图片描述
     */
    private String desc;

    private static final long serialVersionUID = 1L;

    public Long getShopEvaImageId() {
        return shopEvaImageId;
    }

    public void setShopEvaImageId(Long shopEvaImageId) {
        this.shopEvaImageId = shopEvaImageId;
    }

    public Long getShopEvaIdF() {
        return shopEvaIdF;
    }

    public void setShopEvaIdF(Long shopEvaIdF) {
        this.shopEvaIdF = shopEvaIdF;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}