package com.tedu.mle.shopend.service;

import java.util.List;

import com.tedu.mle.shopend.entity.ShopDiscount;


/**
 * 商铺打折信息service
 * @author 巷末
 *
 */
public interface ShopDiscountService {

	
	/**
	 * 查询并获取表中打折信息数据
	 * @param shopId
	 * @return
	 */
	List<ShopDiscount> selectDiscountByShopId(Long shopId);
	
	/**
	 * 根据打折项id值删除打折信息
	 * @param discountIds
	 * @return
	 */
	int deleteDiscountsByPrimaryKey(Long... discountIds);
	
	/**
	 * 负责将折扣信息写入到数据库
	 * @param record
	 * @return
	 */
	int saveDiscount(ShopDiscount record);
	
	/**
	 * 根据折扣信息id 查询折扣信息
	 * @param discountId
	 * @return
	 */
	ShopDiscount selectByPrimaryKey(Long discountId);
	
	/**
	 * 基于折扣id修改折扣信息
	 * @param record
	 * @return
	 */
	int updateDiscountByPrimaryKey(ShopDiscount record);
}
