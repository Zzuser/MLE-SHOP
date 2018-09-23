package com.tedu.mle.shopend.dao;

import com.tedu.mle.shopend.entity.Dish;

import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 菜品相关dao操作
 *
 * @author zz
 */
@Repository
public interface DishDAO {
    /**
     * 根据主键删除菜品
     *
     * @param dishId 菜品id
     * @return 影响行数
     */
    int deleteByPrimaryKey(Long dishId);

    /**
     * 增加菜品
     *
     * @param record 要增加的菜品
     * @return 影响行数
     */
    int insert(Dish record);

    /**
     * 根据主键查询菜品
     *
     * @param dishId 菜品id
     * @return 查询菜品结果
     */
     Long [] selectByPrimaryKey(Long shopIdF);

    /**
     * 根据菜品名称模糊查询
     *
     * @param dishName 查询条件
     * @return 查询菜品结果
     */
    List<Dish> selectLikeName(String dishName);

    /**
     * 根据主键跟新菜品
     *
     * @param record 要跟新的的菜品信息
     * @return 影响行数
     */
    int updateByPrimaryKeySelective(Dish record);
    /**
     * 根据子菜单的id初始化菜品的信息
     * @param ChildId
     * @return
     */
    List<Dish> selectByChildId(Long...ChildId);

}