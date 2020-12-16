package com.depty.bean;

import java.io.Serializable;

/**
 * t_depty
 * @author 
 */
public class Depty implements Serializable {
    private Integer deptno;

    private String dname;

    private String loc;

    private static final long serialVersionUID = 1L;

    public Integer getDeptno() {
        return deptno;
    }

    public void setDeptno(Integer deptno) {
        this.deptno = deptno;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public String getLoc() {
        return loc;
    }

    public void setLoc(String loc) {
        this.loc = loc;
    }


}