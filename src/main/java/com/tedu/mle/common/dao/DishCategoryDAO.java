package com.tedu.mle.common.dao;

import com.tedu.mle.common.entity.DishCategory;
import org.springframework.stereotype.Repository;

@Repository
public interface DishCategoryDAO {
    int deleteByPrimaryKey(Long dishCategoryId);

    int insert(DishCategory record);

    int insertSelective(DishCategory record);

    DishCategory selectByPrimaryKey(Long dishCategoryId);

    int updateByPrimaryKeySelective(DishCategory record);

    int updateByPrimaryKey(DishCategory record);
}