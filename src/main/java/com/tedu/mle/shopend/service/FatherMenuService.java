package com.tedu.mle.shopend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tedu.mle.common.dao.FatherMenuDAO;
import com.tedu.mle.common.entity.FatherMenu;


public interface FatherMenuService {
    /**
     * 添加子菜单 
     * @param shopIdF 商店id
     * @param fatherMenuName 总菜单名字
     * @param desc  菜单简介
     * @return 返回数量
     */
	int insertChildMenuObject(Long shopIdF, String fatherMenuName, String desc);
	/**
	 * 根据父类id删除总菜单
	 * @param FatherMenuId 父类id
	 * @return 删除数量
	 */
	int deleteByMenuId(Integer FatherMenuId);
	/**
	 * 修改菜的信息
	 * @param records
	 * @return
	 */
	int updateByPrimaryKeySelective (Long fatherMenuId,String fatherMenuName, String desc);
	
}
