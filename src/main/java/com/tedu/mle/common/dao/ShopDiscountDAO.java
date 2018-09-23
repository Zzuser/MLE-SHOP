package com.tedu.mle.common.dao;

import com.tedu.mle.common.entity.ShopDiscount;
import org.springframework.stereotype.Repository;

@Repository
public interface ShopDiscountDAO {
    int deleteByPrimaryKey(Long discountId);

    int insert(ShopDiscount record);

    int insertSelective(ShopDiscount record);

    ShopDiscount selectByPrimaryKey(Long discountId);

    int updateByPrimaryKeySelective(ShopDiscount record);

    int updateByPrimaryKey(ShopDiscount record);
}