package com.tedu.mle.shopend.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tedu.mle.shopend.dao.DishDAO;
import com.tedu.mle.shopend.dao.DishWithChildMenuDAO;
import com.tedu.mle.shopend.entity.Dish;
import com.tedu.mle.shopend.entity.DishWithChildMenu;
import com.tedu.mle.common.exception.ServiceException;
import com.tedu.mle.shopend.service.DishService;
/**
 * 菜品信息增删改查
 * @author lizhe
 *
 */
@Service
public class DishServiceImpl implements DishService {
	@Autowired
     private DishDAO dishDao;
	@Autowired
     private DishWithChildMenuDAO dishWithChildMenuDao;
	@Override
	/**
	 * 菜品的添加
	 */
	public int InsertIntoDish(Dish dish) {
		//1.验证添加的菜品的信息是否为空
		if(dish==null){
			throw new ServiceException("输入对象为空");
		}
		//2.执行添加擦做
		int rows = dishDao.insert(dish);
	    int insert = dishWithChildMenuDao.insert(dish.getShopIdF(),dish.getDishId());
	    //3.验证执行操作
	    if(insert==0){
	    	throw new ServiceException("中间信息添加失败");
	    }
		if(rows==0){
			throw new ServiceException("添加菜品失败");
		}
		//4.返回结果
		return rows;
	}
    /**
     * 菜品的修改
     */
	@Override
	public int UpdateDish(Dish dish) {
		//1.验证菜品信息是否为空
		if(dish==null){
			throw new ServiceException("修改的数据为空");
		}
		//2.执行修改操作
		int updateDish = dishDao.updateByPrimaryKeySelective(dish);
		//3.验证操作是否成功
		if(updateDish==0){
			throw new ServiceException("修改失败");
		}
		//4.返回结果
		return updateDish;
	}
    /**
     * 菜品的删除
     */
	@Override
	public int doDeleteDish(Long dishId) {
		//1.验证删除的菜品id是否为空
		 if(dishId==null || dishId<=0){
			 throw new IllegalArgumentException("未选中");
		 }
		 //2.执行删除操作
		 int dish = dishDao.deleteByPrimaryKey(dishId);
		 int delete = dishWithChildMenuDao.deleteByPrimaryKey(dishId);
		 //3.验证操作是否成功
		 if(dish==0  || delete==0){
			 throw new ServiceException("删除失败");
		 }
		 //4.返回结果
		return dish;
	}
  
}
