package com.xiexin.bean;

import java.io.Serializable;

/**
 * staff
 * @author 
 */
public class StaffKey implements Serializable {
    private Integer empnum;

    private String empname;

    private static final long serialVersionUID = 1L;

    public Integer getEmpnum() {
        return empnum;
    }

    public void setEmpnum(Integer empnum) {
        this.empnum = empnum;
    }

    public String getEmpname() {
        return empname;
    }

    public void setEmpname(String empname) {
        this.empname = empname;
    }
}