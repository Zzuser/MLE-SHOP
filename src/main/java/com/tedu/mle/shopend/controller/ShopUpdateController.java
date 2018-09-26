package com.tedu.mle.shopend.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.tedu.mle.common.vo.JsonResult;
import com.tedu.mle.shopend.entity.Shop;
import com.tedu.mle.shopend.service.ShopService;

/**
 * 商户修改页面实现
 * @author 巷末
 *
 */
@RequestMapping("/shop/")
@Controller
public class ShopUpdateController {
	
	@Autowired
	private ShopService shopService;
	
	@RequestMapping("doShopUpdateUI")
	public String doMenuUpdateUI(){
		return "workbench/shop_edit";
	}
	
	
	@RequestMapping("doSelectByPrimaryKey")
	@ResponseBody
	public JsonResult doSelectByPrimaryKey(Long shopId){
		Shop shop = shopService.selectByPrimaryKey(shopId);
		return new JsonResult(shop);
	}
	@RequestMapping("doUpdateShopByPrimaryKey")
	@ResponseBody
	public JsonResult doUpdateShopByPrimaryKey(Shop record){
		int s = shopService.updateShopByPrimaryKey(record);
		return new JsonResult(s+"update ok");
	}
	
	@ResponseBody
	@RequestMapping("doUpdateShopState")
	public JsonResult doUpdateShopState(Shop record){
		int rows = shopService.updateShopState(record);
		return new JsonResult("state change ok");
	}
	
	

}
