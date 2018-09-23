package com.tedu.mle.common.dao;

import com.tedu.mle.BaseTest;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class ShopDAOTest extends BaseTest {
    @Autowired
    ShopDAO shopDAO;

    @Test
    public void selectWithDiscount() {

    }//selectWithDiscountByCategory

    @Test
    public void selectWithDiscountByCategory() {
        shopDAO.selectWithDiscountListByCategoryId(0L);
    }
}