package com.tedu.mle.common.dao;

import com.tedu.mle.common.entity.Horseman;
import org.springframework.stereotype.Repository;

@Repository
public interface HorsemanDAO {
    int deleteByPrimaryKey(Long horsemanId);

    int insert(Horseman record);

    int insertSelective(Horseman record);

    Horseman selectByPrimaryKey(Long horsemanId);

    int updateByPrimaryKeySelective(Horseman record);

    int updateByPrimaryKey(Horseman record);
}