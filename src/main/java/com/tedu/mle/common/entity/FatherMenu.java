package com.tedu.mle.common.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * father_menu
 * @author 
 */
public class FatherMenu implements Serializable {
    /**
     * 总菜单id
     */
    private Long fatherMenuId;

    /**
     * 商铺id
     */
    private Long shopIdF;

    /**
     * 总菜单名
     */
    private String fatherMenuName;

    /**
     * 总菜单描述
     */
    private String desc;

    /**
     * 菜单状态
     */
    private Byte state;

    /**
     * 创建时间
     */
    private Date createtime;

    private static final long serialVersionUID = 1L;

    public Long getFatherMenuId() {
        return fatherMenuId;
    }

    public void setFatherMenuId(Long fatherMenuId) {
        this.fatherMenuId = fatherMenuId;
    }

    public Long getShopIdF() {
        return shopIdF;
    }

    public void setShopIdF(Long shopIdF) {
        this.shopIdF = shopIdF;
    }

    public String getFatherMenuName() {
        return fatherMenuName;
    }

    public void setFatherMenuName(String fatherMenuName) {
        this.fatherMenuName = fatherMenuName;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Byte getState() {
        return state;
    }

    public void setState(Byte state) {
        this.state = state;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }
}