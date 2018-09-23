package com.tedu.mle.common.entity;

import java.io.Serializable;

/**
 * user_extra
 * @author 
 */
public class UserExtra implements Serializable {
    /**
     * 补充信息id
     */
    private Long userExtraId;

    /**
     * 用户id
     */
    private Long userIdF;

    /**
     * 用户qq
     */
    private String qq;

    /**
     * 微信
     */
    private String weixin;

    /**
     * 真实姓名
     */
    private String realName;

    /**
     * 身份证号
     */
    private String idcardNum;

    private static final long serialVersionUID = 1L;

    public Long getUserExtraId() {
        return userExtraId;
    }

    public void setUserExtraId(Long userExtraId) {
        this.userExtraId = userExtraId;
    }

    public Long getUserIdF() {
        return userIdF;
    }

    public void setUserIdF(Long userIdF) {
        this.userIdF = userIdF;
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq;
    }

    public String getWeixin() {
        return weixin;
    }

    public void setWeixin(String weixin) {
        this.weixin = weixin;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getIdcardNum() {
        return idcardNum;
    }

    public void setIdcardNum(String idcardNum) {
        this.idcardNum = idcardNum;
    }
}