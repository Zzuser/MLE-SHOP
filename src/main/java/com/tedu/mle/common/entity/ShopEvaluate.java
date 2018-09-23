package com.tedu.mle.common.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * shop_evaluate
 * @author 
 */
public class ShopEvaluate implements Serializable {
    /**
     * 评价id
     */
    private Long evaluateId;

    /**
     * 用户id
     */
    private Long userIdF;

    /**
     * 店家id
     */
    private Long shopIdF;

    /**
     * 味觉分
     */
    private Double tasteScore;

    /**
     * 包装分
     */
    private Double packageScore;

    /**
     * 总分
     */
    private Double mainScore;

    /**
     * 评价内容
     */
    private String desc;

    /**
     * 店家回复
     */
    private String shopReply;

    /**
     * 有图？
     */
    private Boolean hasImage;

    /**
     * 创建时间
     */
    private Date createtime;

    private static final long serialVersionUID = 1L;

    public Long getEvaluateId() {
        return evaluateId;
    }

    public void setEvaluateId(Long evaluateId) {
        this.evaluateId = evaluateId;
    }

    public Long getUserIdF() {
        return userIdF;
    }

    public void setUserIdF(Long userIdF) {
        this.userIdF = userIdF;
    }

    public Long getShopIdF() {
        return shopIdF;
    }

    public void setShopIdF(Long shopIdF) {
        this.shopIdF = shopIdF;
    }

    public Double getTasteScore() {
        return tasteScore;
    }

    public void setTasteScore(Double tasteScore) {
        this.tasteScore = tasteScore;
    }

    public Double getPackageScore() {
        return packageScore;
    }

    public void setPackageScore(Double packageScore) {
        this.packageScore = packageScore;
    }

    public Double getMainScore() {
        return mainScore;
    }

    public void setMainScore(Double mainScore) {
        this.mainScore = mainScore;
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

    public Boolean getHasImage() {
        return hasImage;
    }

    public void setHasImage(Boolean hasImage) {
        this.hasImage = hasImage;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }
}