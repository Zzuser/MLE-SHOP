package com.tedu.mle.common.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * dish_evaluate
 * @author 
 */
public class DishEvaluate implements Serializable {
    /**
     * 菜品评价id
     */
    private Long dishEvaluateId;

    /**
     * 用户id
     */
    private Long userIdF;

    /**
     * 菜品id
     */
    private Long dishIdF;

    /**
     * 评价内容
     */
    private String desc;

    /**
     * 店家回复
     */
    private String shopReply;

    /**
     * 赞？
     */
    private Boolean praise;

    /**
     * 创建时间
     */
    private Date createtime;

    /**
     * 有图？
     */
    private Boolean hasImage;

    private static final long serialVersionUID = 1L;

    public Long getDishEvaluateId() {
        return dishEvaluateId;
    }

    public void setDishEvaluateId(Long dishEvaluateId) {
        this.dishEvaluateId = dishEvaluateId;
    }

    public Long getUserIdF() {
        return userIdF;
    }

    public void setUserIdF(Long userIdF) {
        this.userIdF = userIdF;
    }

    public Long getDishIdF() {
        return dishIdF;
    }

    public void setDishIdF(Long dishIdF) {
        this.dishIdF = dishIdF;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getShopReply() {
        return shopReply;
    }

    public void setShopReply(String shopReply) {
        this.shopReply = shopReply;
    }

    public Boolean getPraise() {
        return praise;
    }

    public void setPraise(Boolean praise) {
        this.praise = praise;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Boolean getHasImage() {
        return hasImage;
    }

    public void setHasImage(Boolean hasImage) {
        this.hasImage = hasImage;
    }
}