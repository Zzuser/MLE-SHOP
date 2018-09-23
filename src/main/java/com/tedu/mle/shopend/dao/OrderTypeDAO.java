package com.tedu.mle.shopend.dao;

import com.tedu.mle.shopend.entity.OrderType;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderTypeDAO {
    int deleteByPrimaryKey(Long orderTypeId);

    int insert(OrderType record);

    int insertSelective(OrderType record);

    OrderType selectByPrimaryKey(Long orderTypeId);

    int updateByPrimaryKeySelective(OrderType record);

    int updateByPrimaryKey(OrderType record);
}