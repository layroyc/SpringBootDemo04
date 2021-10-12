package com.wy.bean;

import java.io.Serializable;

/**
 * quan_xian
 * @author 
 */
public class QuanXian implements Serializable {
    private Integer quanXianId;

    /**
     * 菜单权限编码
     */
    private String quanXianCode;

    /**
     * 菜单权限名称
     */
    private String quanXianName;

    /**
     * 授权(如：sys:user:add)
     */
    private String quanXianPerms;

    private String quanXianUrl;

    private String quanXianMethod;

    private Integer quanXianPid;

    private Integer quanXianOrder;

    private Integer quanXianType;

    private Integer quanXianStatus;

    private static final long serialVersionUID = 1L;

    public Integer getQuanXianId() {
        return quanXianId;
    }

    public void setQuanXianId(Integer quanXianId) {
        this.quanXianId = quanXianId;
    }

    public String getQuanXianCode() {
        return quanXianCode;
    }

    public void setQuanXianCode(String quanXianCode) {
        this.quanXianCode = quanXianCode;
    }

    public String getQuanXianName() {
        return quanXianName;
    }

    public void setQuanXianName(String quanXianName) {
        this.quanXianName = quanXianName;
    }

    public String getQuanXianPerms() {
        return quanXianPerms;
    }

    public void setQuanXianPerms(String quanXianPerms) {
        this.quanXianPerms = quanXianPerms;
    }

    public String getQuanXianUrl() {
        return quanXianUrl;
    }

    public void setQuanXianUrl(String quanXianUrl) {
        this.quanXianUrl = quanXianUrl;
    }

    public String getQuanXianMethod() {
        return quanXianMethod;
    }

    public void setQuanXianMethod(String quanXianMethod) {
        this.quanXianMethod = quanXianMethod;
    }

    public Integer getQuanXianPid() {
        return quanXianPid;
    }

    public void setQuanXianPid(Integer quanXianPid) {
        this.quanXianPid = quanXianPid;
    }

    public Integer getQuanXianOrder() {
        return quanXianOrder;
    }

    public void setQuanXianOrder(Integer quanXianOrder) {
        this.quanXianOrder = quanXianOrder;
    }

    public Integer getQuanXianType() {
        return quanXianType;
    }

    public void setQuanXianType(Integer quanXianType) {
        this.quanXianType = quanXianType;
    }

    public Integer getQuanXianStatus() {
        return quanXianStatus;
    }

    public void setQuanXianStatus(Integer quanXianStatus) {
        this.quanXianStatus = quanXianStatus;
    }
}