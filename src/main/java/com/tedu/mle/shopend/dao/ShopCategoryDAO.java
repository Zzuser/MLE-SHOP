package com.tedu.mle.shopend.dao;

import com.tedu.mle.shopend.entity.ShopCategory;
import org.springframework.stereotype.Repository;

@Repository
public interface ShopCategoryDAO {
    int deleteByPrimaryKey(Long shopCategoryId);

    int insert(ShopCategory record);

    int insertSelective(ShopCategory record);

    ShopCategory selectByPrimaryKey(Long shopCategoryId);

    int updateByPrimaryKeySelective(ShopCategory record);

    int updateByPrimaryKey(ShopCategory record);
}