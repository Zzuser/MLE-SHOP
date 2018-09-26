package com.tedu.mle.shopend.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tedu.mle.common.exception.ServiceException;
import com.tedu.mle.shopend.dao.ShopDiscountDAO;
import com.tedu.mle.shopend.entity.ShopDiscount;
import com.tedu.mle.shopend.service.ShopDiscountService;
@Service
public class ShopDiscountServiceImpl implements ShopDiscountService{

	@Autowired
	private ShopDiscountDAO shopDiscountDAO;
	
	@Override
	public List<ShopDiscount> selectDiscountByShopId(Long shopId) {
		//验证参数合法性
		if (shopId==null || shopId < 1) {
			throw new ServiceException("参数不合法");
		}
		//获取打折信息数据
		List<ShopDiscount> list = shopDiscountDAO.selectDiscountByShopId(shopId);
		//返回结果
		return list;
	}

	@Override
	public int deleteDiscountsByPrimaryKey(Long... discountIds) {
		//验证参数有效性
		if (discountIds==null || discountIds.length==0) {
			throw new ServiceException("请先选择");
		}
		//执行删除操作
		int rows = shopDiscountDAO.deleteDiscountsByPrimaryKey(discountIds);
		if (rows==0) {
			throw new ServiceException("该记录可能已经不存在");
		}
		//返回结果
		return rows;
	}

	@Override
	public int saveDiscount(ShopDiscount record) {
		//参数有效性验证
		if (record==null) {
			throw new ServiceException("保存对象不能为空");
		}
		//将数据写入到数据库
		int rows = shopDiscountDAO.insertDiscount(record);
		
		return rows;
	}

	@Override
	public ShopDiscount selectByPrimaryKey(Long discountId) {
		//参数验证
		if (discountId==null || discountId<1) {
			throw new ServiceException("参数数据不合法");
		}
		//执行查询
		ShopDiscount shopDiscount = shopDiscountDAO.selectByPrimaryKey(discountId);
		//返回结果
		return shopDiscount;
	}

	@Override
	public int updateDiscountByPrimaryKey(ShopDiscount record) {
		//参数有效性验证
		if (record==null) {
			throw new ServiceException("折扣信息不能为空");
		}
		//更新数据
		int rows = shopDiscountDAO.updateDiscountByPrimaryKey(record);
		//返回结果
		return rows;
	}

	
	

}
