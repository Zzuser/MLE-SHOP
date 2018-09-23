package com.tedu.mle.shopend.dao;

import com.tedu.mle.shopend.entity.DishEvaluate;
import org.springframework.stereotype.Repository;

@Repository
public interface DishEvaluateDAO {
    int deleteByPrimaryKey(Long dishEvaluateId);

    int insert(DishEvaluate record);

    int insertSelective(DishEvaluate record);

    DishEvaluate selectByPrimaryKey(Long dishEvaluateId);

    int updateByPrimaryKeySelective(DishEvaluate record);

    int updateByPrimaryKey(DishEvaluate record);
}