package com.wy.bean;

import java.io.Serializable;

/**
 * ren_jiao_se
 * @author 
 */
public class RenJiaoSe implements Serializable {
    private Integer renJiaoseId;

    private Integer renId;

    private Integer jiaoseId;

    private static final long serialVersionUID = 1L;

    public Integer getRenJiaoseId() {
        return renJiaoseId;
    }

    public void setRenJiaoseId(Integer renJiaoseId) {
        this.renJiaoseId = renJiaoseId;
    }

    public Integer getRenId() {
        return renId;
    }

    public void setRenId(Integer renId) {
        this.renId = renId;
    }

    public Integer getJiaoseId() {
        return jiaoseId;
    }

    public void setJiaoseId(Integer jiaoseId) {
        this.jiaoseId = jiaoseId;
    }
}