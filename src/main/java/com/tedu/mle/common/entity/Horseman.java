package com.tedu.mle.common.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * horseman
 * @author 
 */
public class Horseman implements Serializable {
    /**
     * 骑手id
     */
    private Long horsemanId;

    /**
     * 骑手电话
     */
    private String horsemanPhone;

    /**
     * 真实姓名
     */
    private String realName;

    /**
     * 身份证号
     */
    private String idcard;

    /**
     * 配送总量
     */
    private Integer totalShippingNum;

    /**
     * 准时数量
     */
    private Integer ontimeShippingNum;

    /**
     * 评分
     */
    private Double score;

    /**
     * 准时率
     */
    private Double ontimeRate;

    /**
     * 创建时间
     */
    private Date createtime;

    private static final long serialVersionUID = 1L;

    public Long getHorsemanId() {
        return horsemanId;
    }

    public void setHorsemanId(Long horsemanId) {
        this.horsemanId = horsemanId;
    }

    public String getHorsemanPhone() {
        return horsemanPhone;
    }

    public void setHorsemanPhone(String horsemanPhone) {
        this.horsemanPhone = horsemanPhone;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getIdcard() {
        return idcard;
    }

    public void setIdcard(String idcard) {
        this.idcard = idcard;
    }

    public Integer getTotalShippingNum() {
        return totalShippingNum;
    }

    public void setTotalShippingNum(Integer totalShippingNum) {
        this.totalShippingNum = totalShippingNum;
    }

    public Integer getOntimeShippingNum() {
        return ontimeShippingNum;
    }

    public void setOntimeShippingNum(Integer ontimeShippingNum) {
        this.ontimeShippingNum = ontimeShippingNum;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public Double getOntimeRate() {
        return ontimeRate;
    }

    public void setOntimeRate(Double ontimeRate) {
        this.ontimeRate = ontimeRate;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }
}