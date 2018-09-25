package com.tedu.mle.shopend.dao;

import com.tedu.mle.shopend.entity.ShopDiscount;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ShopDiscountDAO {
	
	/**
	 * 根据折扣信息id 查询折扣信息
	 * @param discountId
	 * @return
	 * @author 巷末
	 */
	ShopDiscount selectByPrimaryKey(Long discountId);
	/**
	 * 基于折扣id修改折扣信息
	 * @param record
	 * @return
	 * @author 巷末
	 */
	int updateDiscountByPrimaryKey(ShopDiscount record);
	/**
	 * 查询并获取表中打折信息数据，
	 * @param discountId 查询条件
	 * @return 返回打折信息
	 * @author 巷末
	 */
	List<ShopDiscount> selectDiscountByShopId(Long shopId);
	/**
	 * 根据打折项id值删除打折信息
	 * @param discountIds
	 * @return
	 * @author 巷末
	 */
	int deleteDiscountsByPrimaryKey(@Param("discountIds")Long... discountIds);
	/**
	 * 负责将折扣信息写入到数据库
	 * @param record
	 * @return
	 * @author 巷末
	 */
	int insertDiscount(ShopDiscount record);
	
	
	
	
    int deleteByPrimaryKey(Long discountId);

    int insert(ShopDiscount record);

    int insertSelective(ShopDiscount record);

    int updateByPrimaryKeySelective(ShopDiscount record);

    int updateByPrimaryKey(ShopDiscount record);
}