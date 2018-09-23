package com.tedu.mle.common.dao;

import com.tedu.mle.common.entity.Role;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleDAO {
    int deleteByPrimaryKey(Long roleId);

    int insert(Role record);

    int insertSelective(Role record);

    Role selectByPrimaryKey(Long roleId);

    int updateByPrimaryKeySelective(Role record);

    int updateByPrimaryKey(Role record);
}