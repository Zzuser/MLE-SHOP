package com.tedu.mle.common.entity;

import java.io.Serializable;

/**
 * dish_eva_image
 * @author 
 */
public class DishEvaImage implements Serializable {
    /**
     * 图片id
     */
    private Long dishEvaImageId;

    /**
     * 菜品评价id
     */
    private Long dishEvaIdF;

    /**
     * 图片地址
     */
    private String url;

    /**
     * 描述
     */
    private String desc;

    private static final long serialVersionUID = 1L;

    public Long getDishEvaImageId() {
        return dishEvaImageId;
    }

    public void setDishEvaImageId(Long dishEvaImageId) {
        this.dishEvaImageId = dishEvaImageId;
    }

    public Long getDishEvaIdF() {
        return dishEvaIdF;
    }

    public void setDishEvaIdF(Long dishEvaIdF) {
        this.dishEvaIdF = dishEvaIdF;
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