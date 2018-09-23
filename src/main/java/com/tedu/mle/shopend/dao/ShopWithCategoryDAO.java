package com.tedu.mle.shopend.dao;

import com.tedu.mle.shopend.entity.ShopWithCategory;
import org.springframework.stereotype.Repository;

@Repository
public interface ShopWithCategoryDAO {
    int deleteByPrimaryKey(Long id);

    int insert(ShopWithCategory record);

    int insertSelective(ShopWithCategory record);

    ShopWithCategory selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(ShopWithCategory record);

    int updateByPrimaryKey(ShopWithCategory record);
}