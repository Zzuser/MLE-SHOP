package com.tedu.mle.shopend.dao;

import com.tedu.mle.shopend.entity.Shop;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 店铺有关dao
 *
 * @author zz
 */
@Repository
public interface ShopDAO {
	
	/**
	 * 根据用户的手机号查询记录
	 * @param phone
	 * @return
	 */
		Shop selectByPhoneNum(@Param("phone")String phone);
	
	
	
	/**
     * 更新店铺信息
     * @param record 要更新的信息
     * @return 影响行数
     * @author 巷末
     */
    int updateShopByPrimaryKey(Shop record);
    /**
	 * 基于店铺账户id查询店铺信息
	 * @param shopId
	 * @return
	 * @author 巷末
	 */
	List<Shop> findShopObject(Long shopId);
	
	/**
     * 根据主键删除店铺
     *
     * @param shopId 店铺id
     * @return 影响行数
     */
    int deleteByPrimaryKey(Long shopId);
	
    /**
     * 根据主键查询店铺
     *
     * @param shopId 店铺id
     * @return 查询结果
     */
    Shop selectByPrimaryKey(Long shopId);
    /**
     * 修改店铺营业状态
     * @param record
     * @return
     */
    int updateShopState(Shop record);
	
	
    

    /**
     * 根据手机号查询商店
     *
     * @param phone
     * @return
     */
    Shop selectByPhone(String phone);

    /**
     * 插入店铺
     *
     * @param record 要插入的店铺
     * @return 影响行数
     */
    int insert(Shop record);

    

    /**
     * 更新店铺信息
     *
     * @param record 要更新的信息
     * @return 影响行数
     */
    int updateByPrimaryKeySelective(Shop record);

    /**
     * 查询店铺附带店铺折扣信息
     *
     * @param shop 店铺id，名称，或电话
     * @return 查询结果
     */
    List<Shop> selectWithDiscountList(Shop shop);

    /**
     * 根据分类id查询店铺附带折扣信息
     *
     * @param shopCategoryId 店铺分类id
     * @return 查询结果
     */
    List<Shop> selectWithDiscountListByCategoryId(@Param("shopCategoryId") Long shopCategoryId);
}