package com.tedu.mle.shopend.dao;

import com.tedu.mle.shopend.entity.DishEvaImage;
import org.springframework.stereotype.Repository;

@Repository
public interface DishEvaImageDAO {
    int deleteByPrimaryKey(Long dishEvaImageId);

    int insert(DishEvaImage record);

    int insertSelective(DishEvaImage record);

    DishEvaImage selectByPrimaryKey(Long dishEvaImageId);

    int updateByPrimaryKeySelective(DishEvaImage record);

    int updateByPrimaryKey(DishEvaImage record);
}