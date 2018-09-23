package com.tedu.mle.common.entity;

import java.io.Serializable;

/**
 * dish_category
 * @author 
 */
public class DishCategory implements Serializable {
    /**
     * 菜品分类id
     */
    private Long dishCategoryId;

    /**
     * 分类名称
     */
    private String dishCategoryName;

    /**
     * 描述
     */
    private String desc;



    private static final long serialVersionUID = 1L;

    public Long getDishCategoryId() {
        return dishCategoryId;
    }

    public void setDishCategoryId(Long dishCategoryId) {
        this.dishCategoryId = dishCategoryId;
    }

    public String getDishCategoryName() {
        return dishCategoryName;
    }

    public void setDishCategoryName(String dishCategoryName) {
        this.dishCategoryName = dishCategoryName;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
    public String toString() {
        return "DishCategory{" +
                "dishCategoryId=" + dishCategoryId +
                ", dishCategoryName='" + dishCategoryName + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }
}