package com.tedu.mle.common.dao;

import com.tedu.mle.common.entity.UserAddress;
import org.springframework.stereotype.Repository;

@Repository
public interface UserAddressDAO {
    int deleteByPrimaryKey(Long userAddressId);

    int insert(UserAddress record);

    int insertSelective(UserAddress record);

    UserAddress selectByPrimaryKey(Long userAddressId);

    int updateByPrimaryKeySelective(UserAddress record);

    int updateByPrimaryKey(UserAddress record);
}