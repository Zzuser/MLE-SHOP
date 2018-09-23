package com.tedu.mle.shopend.entity;

import java.io.Serializable;

/**
 * dish_with_child_menu
 * @author 
 */
public class DishWithChildMenu implements Serializable {
    /**
     * 主键
     */
    private Long id;

    /**
     * 菜品id

     */
    private Long dishIdF;

    /**
     * 子菜单id
     */
    private Long childMenuIdF;

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

    public Long getChildMenuIdF() {
        return childMenuIdF;
    }

    public void setChildMenuIdF(Long childMenuIdF) {
        this.childMenuIdF = childMenuIdF;
    }

	@Override
	public String toString() {
		return "DishWithChildMenu [id=" + id + ", dishIdF=" + dishIdF + ", childMenuIdF=" + childMenuIdF + "]";
	}
    
}