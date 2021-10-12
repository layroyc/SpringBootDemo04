package com.wy.bean;

import java.io.Serializable;

/**
 * jiaose_quanxian
 * @author 
 */
public class JiaoseQuanxian implements Serializable {
    private Integer jiaoseQuanxianId;

    private Integer jiaoseId;

    private Integer quanxianId;

    private static final long serialVersionUID = 1L;

    public Integer getJiaoseQuanxianId() {
        return jiaoseQuanxianId;
    }

    public void setJiaoseQuanxianId(Integer jiaoseQuanxianId) {
        this.jiaoseQuanxianId = jiaoseQuanxianId;
    }

    public Integer getJiaoseId() {
        return jiaoseId;
    }

    public void setJiaoseId(Integer jiaoseId) {
        this.jiaoseId = jiaoseId;
    }

    public Integer getQuanxianId() {
        return quanxianId;
    }

    public void setQuanxianId(Integer quanxianId) {
        this.quanxianId = quanxianId;
    }
}