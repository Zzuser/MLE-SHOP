package com.tedu.mle.common.dao;

import com.tedu.mle.common.entity.ShopEvaluate;
import org.springframework.stereotype.Repository;

@Repository
public interface ShopEvaluateDAO {
    int deleteByPrimaryKey(Long evaluateId);

    int insert(ShopEvaluate record);

    int insertSelective(ShopEvaluate record);

    ShopEvaluate selectByPrimaryKey(Long evaluateId);

    int updateByPrimaryKeySelective(ShopEvaluate record);

    int updateByPrimaryKey(ShopEvaluate record);
}