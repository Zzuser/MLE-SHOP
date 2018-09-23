package com.tedu.mle.common.dao;

import com.tedu.mle.common.entity.ChildMenu;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 子菜单相关dao
 *
 * @author zz
 */
@Repository
public interface ChildMenuDAO {
    /**
     * 根据主键删除子菜单
     *
     * @param childMenuId 子菜单id
     * @return 影响行数
     */
    int deleteByPrimaryKey(Long childMenuId);

    /**
     * 新建子菜单
     *
     * @param record 新子菜单
     * @return 影响行数
     */
    int insert(ChildMenu record);

    /**
     * 根据主键查询子菜单
     *
     * @param childMenuId 子菜单id
     * @return 查询结果
     */
    ChildMenu selectByPrimaryKey(Long childMenuId);

    /**
     * 跟新子菜单
     *
     * @param record 更新信息
     * @return 影响行数
     */
    int updateByPrimaryKeySelective(ChildMenu record);

    /**
     * 查询子菜单附加菜品列表
     *
     * @param childMenu 子菜单id，主菜单id，商铺id，子菜单名称
     * @return 查询结果
     */
    List<ChildMenu> selectWithDishList(ChildMenu childMenu);
}