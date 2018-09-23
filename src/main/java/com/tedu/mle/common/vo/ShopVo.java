package com.tedu.mle.common.vo;

import com.tedu.mle.common.entity.ChildMenu;
import com.tedu.mle.common.entity.FatherMenu;
import com.tedu.mle.common.entity.Shop;

import java.util.List;

/**
 * 包含一个商铺的所有信息
 * ==================
 * 商铺信息
 * ->总菜单
 * ->所有子菜单
 * ->所有菜品
 * ==================
 *
 * @author zz
 */
public class ShopVo {
    /**
     * 店铺信息
     */
    private Shop shop;
    /**
     * 总菜单信息
     */
    private FatherMenu fatherMenu;
    /**
     * 子菜单信息，子菜单中包含菜品表
     */

    private List<ChildMenu> childMenuList;

    public Shop getShop() {
        return shop;
    }

    public void setShop(Shop shop) {
        this.shop = shop;
    }

    public FatherMenu getFatherMenu() {
        return fatherMenu;
    }

    public void setFatherMenu(FatherMenu fatherMenu) {
        this.fatherMenu = fatherMenu;
    }

    public List<ChildMenu> getChildMenuList() {
        return childMenuList;
    }

    public void setChildMenuList(List<ChildMenu> childMenuList) {
        this.childMenuList = childMenuList;
    }

    @Override
    public String toString() {
        return "ShopVo{" +
                "shop=" + shop +
                ", fatherMenu=" + fatherMenu +
                ", childMenuList=" + childMenuList +
                '}';
    }
}
