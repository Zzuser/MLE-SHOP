package com.tedu.mle.shopend.dao;

import com.tedu.mle.shopend.entity.PayType;
import org.springframework.stereotype.Repository;

@Repository
public interface PayTypeDAO {
    int deleteByPrimaryKey(Long payTypeId);

    int insert(PayType record);

    int insertSelective(PayType record);

    PayType selectByPrimaryKey(Long payTypeId);

    int updateByPrimaryKeySelective(PayType record);

    int updateByPrimaryKey(PayType record);
}