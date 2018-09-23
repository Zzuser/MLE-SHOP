package com.tedu.mle.common.dao;

import com.tedu.mle.BaseTest;
import com.tedu.mle.common.entity.ChildMenu;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ChildMenuDAOTest extends BaseTest {
    @Autowired
    ChildMenuDAO childMenuDAO;

    @Test
    public void selectWithDishList() {
        ChildMenu childMenu = new ChildMenu();
        childMenu.setFatherMenuIdF(5L);
        childMenu.setChildMenuName("chide");
        childMenu.setShooIdF(1L);
        int childMenus = childMenuDAO.insert(childMenu);
        System.out.println(childMenus);
    }
}