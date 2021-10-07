package com.xiexin.bean;

import java.io.Serializable;

/**
 * book
 * @author 
 */
public class Book implements Serializable {
    private Integer bid;

    private String bname;

    private static final long serialVersionUID = 1L;

    public Integer getBid() {
        return bid;
    }

    public void setBid(Integer bid) {
        this.bid = bid;
    }

    public String getBname() {
        return bname;
    }

    public void setBname(String bname) {
        this.bname = bname;
    }
}