package com.tedu.mle.shopend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.tedu.mle.common.vo.JsonResult;
import com.tedu.mle.shopend.entity.ShopDiscount;
import com.tedu.mle.shopend.service.ShopDiscountService;

/**
 * 商家折扣信息
 * @author 巷末
 *
 */
@Controller
@RequestMapping("/disc/")
public class ShopDiscountController {
	
	@Autowired
	private ShopDiscountService shopDiscountService;
	
	/**
	 * 加载商户打折页面
	 * @return
	 */
	@RequestMapping("doDiscountListUI")
	public String doDiscountListUI(){
		return "workbench/discount_list";
	}
	
	/**
	 * 加载折扣信息修改页面
	 * @return
	 */
	@RequestMapping("doDiscountEditUI")
	public String doDiscountEditUI(){
		return "workbench/discount_edit";
	}
	
	/**
	 * 查询打折信息
	 * @param shopId
	 * @return
	 */
	@RequestMapping("doSelectDiscountByShopId")
	@ResponseBody
	public JsonResult doSelectDiscountByShopId(Long shopId){
		List<ShopDiscount> shopDiscounts =
				shopDiscountService.selectDiscountByShopId(shopId);
		return new JsonResult(shopDiscounts);
	}
	
	/**
	 * 删除折扣信息
	 * @param discountIds
	 * @return
	 */
	@RequestMapping("doDeleteDiscountsByPrimaryKey")
	@ResponseBody
	public JsonResult doDeleteDiscountsByPrimaryKey(Long... discountIds){
		int rows = shopDiscountService.deleteDiscountsByPrimaryKey(discountIds);
		return new JsonResult(rows + "dalete ok");
	}
	
	/**
	 * 添加折扣信息
	 * @param record
	 * @return
	 */
	@ResponseBody
	@RequestMapping("doSaveDiscount")
	public JsonResult doSaveDiscount(ShopDiscount record){
		int rows = shopDiscountService.saveDiscount(record);
		return new JsonResult(rows+"save ok");
	}
	
	/**
	 * 根基id查询单挑折扣信息
	 * @param discountId
	 * @return
	 */
	@RequestMapping("doSelectByPrimaryKey")
	@ResponseBody
	public JsonResult doSelectByPrimaryKey(Long discountId){
		ShopDiscount shopDiscount =
				shopDiscountService.selectByPrimaryKey(discountId);
		return new JsonResult(shopDiscount);
	}
	
	/**
	 * 修改折扣信息
	 * @param record
	 * @return
	 */
	@RequestMapping("doUpdateDiscountByPrimaryKey")
	@ResponseBody
	public JsonResult doUpdateDiscountByPrimaryKey(ShopDiscount record){
		int rows = 
				shopDiscountService.updateDiscountByPrimaryKey(record);
		return new JsonResult(rows+"update ok");
	}
	

}
