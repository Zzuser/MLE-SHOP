package com.tedu.mle.common.dao;

import com.tedu.mle.common.entity.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDAO {
    int deleteByPrimaryKey(Long userId);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Long userId);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}