package com.tedu.mle.common.entity;

import java.io.Serializable;

/**
 * dish_with_category
 * @author 
 */
public class DishWithCategory implements Serializable {
    /**
     * 主键
     */
    private Long id;

    /**
     * 菜品id
     */
    private Long dishIdF;

    /**
     * 分类id
     */
    private Long categoryIdF;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getDishIdF() {
        return dishIdF;
    }

    public void setDishIdF(Long dishIdF) {
        this.dishIdF = dishIdF;
    }

    public Long getCategoryIdF() {
        return categoryIdF;
    }

    public void setCategoryIdF(Long categoryIdF) {
        this.categoryIdF = categoryIdF;
    }
}