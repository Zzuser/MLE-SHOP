package com.tedu.mle.shopend.service.impl;

import com.tedu.mle.BaseTest;
import com.tedu.mle.shopend.controller.ShopUpdateController;
import com.tedu.mle.shopend.entity.Shop;
import com.tedu.mle.shopend.service.ShopService;
import com.tedu.mle.common.vo.ShopVo;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class ShopServiceImplTest extends BaseTest {
    @Autowired
    ShopService shopService;
    @Autowired
    ShopUpdateController shopUpdateController;

    @Test
    public void findShopVoByShopId() {
        ShopVo shopVo = shopService.findShopVoByShopId(1L);
        System.out.println(shopVo);
    }
    
    
}