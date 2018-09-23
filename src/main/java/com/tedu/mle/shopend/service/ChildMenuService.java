package com.tedu.mle.shopend.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestParam;

import com.tedu.mle.common.entity.ChildMenu;

public interface ChildMenuService {

	/**
	 * 向菜单添加子菜单
	 * @param childMenus 子菜单的数量
	 * @return 返回添加菜单的数量
	 */
	 int InsertIntoChildMenu(@RequestParam List<ChildMenu>  childMenus);
	 /**
	  * 根据id删除子菜单
	  * @param childMenuId 子菜单id
	  * @return 返回删除的数量
	  */
	 int deleteByPrimaryKey(Long childMenuId);
	 /**
	  * 修改菜单信息
	  * @param childMenus 菜单的信息
	  * @return 修改的数量
	  */
	 int updateByPrimaryKeySelective(List<ChildMenu>  childMenus);
}
