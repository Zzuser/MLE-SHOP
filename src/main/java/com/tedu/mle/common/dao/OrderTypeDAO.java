package com.tedu.mle.common.dao;

import com.tedu.mle.common.entity.OrderType;
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