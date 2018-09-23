package com.tedu.mle.shopend.dao;

import com.tedu.mle.shopend.entity.OrderWithDish;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderWithDishDAO {
    int deleteByPrimaryKey(Long id);

    int insert(OrderWithDish record);

    int insertSelective(OrderWithDish record);

    OrderWithDish selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(OrderWithDish record);

    int updateByPrimaryKey(OrderWithDish record);
}