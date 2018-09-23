package com.tedu.mle.common.dao;

import com.tedu.mle.BaseTest;
import com.tedu.mle.common.entity.FatherMenu;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class FatherMenuDAOTest extends BaseTest {
    @Autowired
    FatherMenuDAO fatherMenuDAO;

    @Test
    public void deleteByPrimaryKey() {
    }

    @Test
    public void insert() {
    }

    @Test
    public void selectByPrimaryKey() {
    }

    @Test
    public void selectSelective() {
        FatherMenu fatherMenu=new FatherMenu();
        fatherMenu.setShopIdF(1L);
        List<FatherMenu> fatherMenus = fatherMenuDAO.selectSelective(fatherMenu);
        System.out.println(fatherMenus);
    }

    @Test
    public void updateByPrimaryKeySelective() {
    }
}