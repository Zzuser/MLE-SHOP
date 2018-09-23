package com.tedu.mle.common.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * child_menu
 * @author 
 */
public class ChildMenu implements Serializable {
    /**
     * 子菜单id
     */
    private Long childMenuId;

    /**
     * 商铺id
     */
    private Long shopIdF;

    /**
     * 总菜单id
     */
    private Long fatherMenuIdF;

    /**
     * 子菜单名称
     */
    private String childMenuName;

    /**
     * 子菜单描述
     */
    private String childMenuDesc;

    /**
     * 子菜单创建时间
     */
    private Date createtime;

    /**
     * 菜品列表
     */
    private List<Dish> dishList;

    private static final long serialVersionUID = 1L;

    public Long getChildMenuId() {
        return childMenuId;
    }

    public void setChildMenuId(Long childMenuId) {
        this.childMenuId = childMenuId;
    }

    public Long getShooIdF() {
        return shopIdF;
    }

    public void setShooIdF(Long shooIdF) {
        this.shopIdF = shooIdF;
    }

    public Long getFatherMenuIdF() {
        return fatherMenuIdF;
    }

    public void setFatherMenuIdF(Long fatherMenuIdF) {
        this.fatherMenuIdF = fatherMenuIdF;
    }

    public String getChildMenuName() {
        return childMenuName;
    }

    public void setChildMenuName(String childMenuName) {
        this.childMenuName = childMenuName;
    }

    public String getChildMenuDesc() {
        return childMenuDesc;
    }

    public void setChildMenuDesc(String childMenuDesc) {
        this.childMenuDesc = childMenuDesc;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public List<Dish> getDishList() {
        return dishList;
    }

    public void setDishList(List<Dish> dishList) {
        this.dishList = dishList;
    }

    @Override
    public String toString() {
        return "ChildMenu{" +
                "childMenuId=" + childMenuId +
                ", shooIdF=" + shopIdF +
                ", fatherMenuIdF=" + fatherMenuIdF +
                ", childMenuName='" + childMenuName + '\'' +
                ", childMenuDesc='" + childMenuDesc + '\'' +
                ", createtime=" + createtime +
                ", dishList=" + dishList +
                '}';
    }
}