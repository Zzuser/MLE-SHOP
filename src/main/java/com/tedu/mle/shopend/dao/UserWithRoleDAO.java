package com.tedu.mle.shopend.dao;

import com.tedu.mle.shopend.entity.UserWithRole;
import org.springframework.stereotype.Repository;

@Repository
public interface UserWithRoleDAO {
    int deleteByPrimaryKey(Long id);

    int insert(UserWithRole record);

    int insertSelective(UserWithRole record);

    UserWithRole selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UserWithRole record);

    int updateByPrimaryKey(UserWithRole record);
}