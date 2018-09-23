package com.tedu.mle.userend.controller;

import com.tedu.mle.common.vo.JsonResult;
import com.tedu.mle.common.entity.Shop;
import com.tedu.mle.shopend.service.ShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author zz
 */
@Controller
@RequestMapping("/shop/")
public class ShopController {
    @Autowired
    ShopService shopService;

    @RequestMapping("doGetShopsWithDiscount")
    @ResponseBody
    public JsonResult doGetShopsWithDiscount(Long shopId) {
        List<Shop> shopsWithDiscountList = shopService.findShopsWithDiscountListByCategoryId(shopId);
        return new JsonResult(shopsWithDiscountList);
    }

}
