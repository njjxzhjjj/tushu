package com.xiexin.bean;

import java.io.Serializable;

/**
 * address
 * @author 
 */
public class Address implements Serializable {
    private Integer aid;

    private String addressname;

    private String parentid;

    private String state;

    private static final long serialVersionUID = 1L;

    public Integer getAid() {
        return aid;
    }

    public void setAid(Integer aid) {
        this.aid = aid;
    }

    public String getAddressname() {
        return addressname;
    }

    public void setAddressname(String addressname) {
        this.addressname = addressname;
    }

    public String getParentid() {
        return parentid;
    }

    public void setParentid(String parentid) {
        this.parentid = parentid;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}