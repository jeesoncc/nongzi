package com.nongzi.pojo;

import java.io.Serializable;

/**
 * @author saykuray
 * @date 2020/5/3 16:04
 */
public class OrderDetailDO implements Serializable {

    private int dId;

    private Integer oNum;

    private Double oMoney;

    private String picUrl;

    private String sName;

    public int getdId() {
        return dId;
    }

    public void setdId(int dId) {
        this.dId = dId;
    }

    public Integer getoNum() {
        return oNum;
    }

    public void setoNum(Integer oNum) {
        this.oNum = oNum;
    }

    public Double getoMoney() {
        return oMoney;
    }

    public void setoMoney(Double oMoney) {
        this.oMoney = oMoney;
    }

    public String getPicUrl() {
        return picUrl;
    }

    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }
}
