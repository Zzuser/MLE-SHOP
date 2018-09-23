package com.tedu.mle.common.dao;

import com.tedu.mle.common.entity.DishWithCategory;
import org.springframework.stereotype.Repository;

@Repository
public interface DishWithCategoryDAO {
    int deleteByPrimaryKey(Long id);

    int insert(DishWithCategory record);

    int insertSelective(DishWithCategory record);

    DishWithCategory selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(DishWithCategory record);

    int updateByPrimaryKey(DishWithCategory record);
}