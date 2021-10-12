package com.wy.bean;

import java.io.Serializable;

/**
 * jiao_se
 * @author 
 */
public class JiaoSe implements Serializable {
    private Integer jiaoSeId;

    private String jiaoSeName;

    private static final long serialVersionUID = 1L;

    public Integer getJiaoSeId() {
        return jiaoSeId;
    }

    public void setJiaoSeId(Integer jiaoSeId) {
        this.jiaoSeId = jiaoSeId;
    }

    public String getJiaoSeName() {
        return jiaoSeName;
    }

    public void setJiaoSeName(String jiaoSeName) {
        this.jiaoSeName = jiaoSeName;
    }
}