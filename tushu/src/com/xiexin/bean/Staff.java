package com.xiexin.bean;

import java.io.Serializable;

/**
 * staff
 * @author 
 */
public class Staff extends StaffKey implements Serializable {
    private String empsex;

    private Integer deptnum;

    private static final long serialVersionUID = 1L;

    public String getEmpsex() {
        return empsex;
    }

    public void setEmpsex(String empsex) {
        this.empsex = empsex;
    }

    public Integer getDeptnum() {
        return deptnum;
    }

    public void setDeptnum(Integer deptnum) {
        this.deptnum = deptnum;
    }
}