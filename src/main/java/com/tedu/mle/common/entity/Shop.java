package com.tedu.mle.common.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * shop
 *
 * @author
 */
public class Shop implements Serializable {
    /**
     * 店家id
     */
    private Long shopId;

    /**
     * 店家名
     */
    private String shopName;

    /**
     * 联系电话
     */
    private String phone;

    /**
     * 管理员名称
     */
    @JsonIgnore
    private String managerName;

    /**
     * 管理员身份证号码
     */
    @JsonIgnore
    private String managerIdcard;

    /**
     * 管理员密码
     */
    @JsonIgnore
    private String password;

    /**
     * 密码盐
     */
    @JsonIgnore
    private String salt;

    /**
     * 店家地址
     */
    private String address;

    /**
     * 店家公告
     */
    private String proclamation;

    /**
     * 店家图片
     */
    private String profile;

    /**
     * 营业时间
     */
    private String shopHours;

    /**
     * 商店状态
     */
    private Boolean state;

    /**
     * 总分
     */
    private Double mainScore;

    /**
     * 创建时间
     */
    private Date createtime;

    /**
     * 配送分
     */
    private Double distributionScore;

    /**
     * 包装分
     */
    private Double packageScore;

    /**
     * 味道分
     */
    private Double tasteScore;

    /**
     * 起送价
     */
    private Double minPrice;

    /**
     * 配送费
     */
    private Double shippingFee;
    /**
     * 折扣列表
     */
    private List<ShopDiscount> shopDiscountList;
    
    
    private static final long serialVersionUID = 1L;

    public Long getShopId() {
        return shopId;
    }

    public void setShopId(Long shopId) {
        this.shopId = shopId;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getManagerName() {
        return managerName;
    }

    public void setManagerName(String managerName) {
        this.managerName = managerName;
    }

    public String getManagerIdcard() {
        return managerIdcard;
    }

    public void setManagerIdcard(String managerIdcard) {
        this.managerIdcard = managerIdcard;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getProclamation() {
        return proclamation;
    }

    public void setProclamation(String proclamation) {
        this.proclamation = proclamation;
    }

    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }

    public String getShopHours() {
        return shopHours;
    }

    public void setShopHours(String shopHours) {
        this.shopHours = shopHours;
    }

    public Boolean getState() {
        return state;
    }

    public void setState(Boolean state) {
        this.state = state;
    }

    public Double getMainScore() {
        return mainScore;
    }

    public void setMainScore(Double mainScore) {
        this.mainScore = mainScore;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Double getDistributionScore() {
        return distributionScore;
    }

    public void setDistributionScore(Double distributionScore) {
        this.distributionScore = distributionScore;
    }

    public Double getPackageScore() {
        return packageScore;
    }

    public void setPackageScore(Double packageScore) {
        this.packageScore = packageScore;
    }

    public Double getTasteScore() {
        return tasteScore;
    }

    public void setTasteScore(Double tasteScore) {
        this.tasteScore = tasteScore;
    }

    public Double getMinPrice() {
        return minPrice;
    }

    public void setMinPrice(Double minPrice) {
        this.minPrice = minPrice;
    }

    public Double getShippingFee() {
        return shippingFee;
    }

    public void setShippingFee(Double shippingFee) {
        this.shippingFee = shippingFee;
    }

    public List<ShopDiscount> getShopDiscountList() {
        return shopDiscountList;
    }

    public void setShopDiscountList(List<ShopDiscount> shopDiscountList) {
        this.shopDiscountList = shopDiscountList;
    }


    @Override
    public String toString() {
        return "Shop{" +
                "shopId=" + shopId +
                ", shopName='" + shopName + '\'' +
                ", phone='" + phone + '\'' +
                ", managerName='" + managerName + '\'' +
                ", managerIdcard='" + managerIdcard + '\'' +
                ", password='" + password + '\'' +
                ", salt='" + salt + '\'' +
                ", address='" + address + '\'' +
                ", proclamation='" + proclamation + '\'' +
                ", profile='" + profile + '\'' +
                ", shopHours='" + shopHours + '\'' +
                ", state=" + state +
                ", mainScore=" + mainScore +
                ", createtime=" + createtime +
                ", distributionScore=" + distributionScore +
                ", packageScore=" + packageScore +
                ", tasteScore=" + tasteScore +
                ", minPrice=" + minPrice +
                ", shippingFee=" + shippingFee +
                ", shopDiscountList=" + shopDiscountList +
                '}';
    }
}