package com.tedu.mle.shopend.service;

import com.tedu.mle.shopend.entity.Dish;

public interface DishService {
    /**
     * 向数据库中菜品信息
     * @param dish 菜品
     * @return 返回添加的数量
     */
	int InsertIntoDish(Dish dish);
	/**
	 * 修改数据库中的菜品的信息
	 * @param dish 修改的数据
	 * @return 返回修改的数据数量
	 */
	int UpdateDish(Dish dish);
	/**
	 * 根据菜品的id删除菜品
	 * @param dishId 菜品的id
	 * @return 返回伤处的数量
	 */
	int doDeleteDish(Long dishId);
}
