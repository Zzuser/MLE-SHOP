package com.tedu.mle.shopend.dao;

import com.tedu.mle.shopend.entity.DishWithChildMenu;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface DishWithChildMenuDAO {
    int deleteByPrimaryKey(Long id);
    /**
     * 像数据库中的插入childId和
     * @param record DishWithChildMenu
     * @return
     */
    int insert(@Param("childMenuIdF")Long childMenuIdF, @Param("dishIdF")Long dishIdF);

    int insertSelective(DishWithChildMenu record);
    
    List<Long> selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(DishWithChildMenu record);

    int updateByPrimaryKey(DishWithChildMenu record);
    
}