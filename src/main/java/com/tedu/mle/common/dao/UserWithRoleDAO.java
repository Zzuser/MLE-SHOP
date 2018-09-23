package com.tedu.mle.common.dao;

import com.tedu.mle.common.entity.UserWithRole;
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