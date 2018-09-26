package com.tedu.mle.shopend.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.tedu.mle.common.vo.JsonResult;
import com.tedu.mle.shopend.entity.Shop;
import com.tedu.mle.shopend.service.ShopService;

@Controller
@RequestMapping("/register/")
public class shopRegisController {
	@Autowired
	ShopService  shopService;

	@RequestMapping("doshanghuzhuce")
    @ResponseBody
    public JsonResult  doshanghuzhuce(Shop shop){
		System.out.println(shop);
		shopService.shanghuzhuce(shop);
    	return new JsonResult("注册成功");
    }
	
}
