package com.xiexin.bean;

import java.io.Serializable;

/**
 * unit
 * @author 
 */
public class Unit implements Serializable {
    private Integer deptnum;

    private String deptname;

    private String deptaddr;

    private Integer parentnum;

    private String status;

    private static final long serialVersionUID = 1L;

    public Integer getDeptnum() {
        return deptnum;
    }

    public void setDeptnum(Integer deptnum) {
        this.deptnum = deptnum;
    }

    public String getDeptname() {
        return deptname;
    }

    public void setDeptname(String deptname) {
        this.deptname = deptname;
    }

    public String getDeptaddr() {
        return deptaddr;
    }

    public void setDeptaddr(String deptaddr) {
        this.deptaddr = deptaddr;
    }

    public Integer getParentnum() {
        return parentnum;
    }

    public void setParentnum(Integer parentnum) {
        this.parentnum = parentnum;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}