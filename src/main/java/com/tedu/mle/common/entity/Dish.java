package com.tedu.mle.common.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * dish
 * @author 
 */
public class Dish implements Serializable {
    /**
     * 菜品id
     */
    private Long dishId;

    /**
     * 菜品名称
     */
    private String dishName;

    /**
     * 店家id
     */
    private Long shopIdF;

    /**
     * 菜品图片
     */
    private String image;

    /**
     * 创建时间
     */
    private Date createtime;

    /**
     * 评分
     */
    private Double grade;

    /**
     * 菜品描述
     */
    private String dishDesc;

    /**
     * 菜品折扣
     */
    private Double dishDiscount;

    /**
     * 菜品状态
     */
    private Boolean state;

    /**
     * 菜品价格
     */
    private Double price;

    /**
     * 菜品数量
     */
    private Integer num;

    /**
     * 销售总量
     */
    private Integer saledNum;

    private static final long serialVersionUID = 1L;

    public Long getDishId() {
        return dishId;
    }

    public void setDishId(Long dishId) {
        this.dishId = dishId;
    }

    public String getDishName() {
        return dishName;
    }

    public void setDishName(String dishName) {
        this.dishName = dishName;
    }

    public Long getShopIdF() {
        return shopIdF;
    }

    public void setShopIdF(Long shopIdF) {
        this.shopIdF = shopIdF;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Double getGrade() {
        return grade;
    }

    public void setGrade(Double grade) {
        this.grade = grade;
    }

    public String getDishDesc() {
        return dishDesc;
    }

    public void setDishDesc(String dishDesc) {
        this.dishDesc = dishDesc;
    }

    public Double getDishDiscount() {
        return dishDiscount;
    }

    public void setDishDiscount(Double dishDiscount) {
        this.dishDiscount = dishDiscount;
    }

    public Boolean getState() {
        return state;
    }

    public void setState(Boolean state) {
        this.state = state;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public Integer getSaledNum() {
        return saledNum;
    }

    public void setSaledNum(Integer saledNum) {
        this.saledNum = saledNum;
    }

    @Override
    public String toString() {
        return "Dish{" +
                "dishId=" + dishId +
                ", dishName='" + dishName + '\'' +
                ", shopIdF=" + shopIdF +
                ", image='" + image + '\'' +
                ", createtime=" + createtime +
                ", grade=" + grade +
                ", dishDesc='" + dishDesc + '\'' +
                ", dishDiscount=" + dishDiscount +
                ", state=" + state +
                ", price=" + price +
                ", num=" + num +
                ", saledNum=" + saledNum +
                '}';
    }
}