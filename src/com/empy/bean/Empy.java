package com.empy.bean;

import com.depty.bean.Depty;

import java.io.Serializable;
import java.util.Date;

/**
 * t_empy
 *
 * @author
 */
public class Empy implements Serializable {
    private Integer empid;

    private Integer empno;

    private String ename;

    private String gender;

    private String job;

    private Integer mgr;

    private String hiredate;

    private Double sal;

    private Double comm;

    private Integer deptno;

    private String startdate;

    private String enddate;

    private String startsal;

    private String endsal;

    private Depty depty;

    private String msg;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    private static final long serialVersionUID = 1L;

    public Integer getEmpid() {
        return empid;
    }

    public void setEmpid(Integer empid) {
        this.empid = empid;
    }

    public Integer getEmpno() {
        return empno;
    }

    public void setEmpno(Integer empno) {
        this.empno = empno;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public Integer getMgr() {
        return mgr;
    }

    public void setMgr(Integer mgr) {
        this.mgr = mgr;
    }

    public String getHiredate() {
        return hiredate;
    }

    public void setHiredate(String hiredate) {
        this.hiredate = hiredate;
    }

    public Double getSal() {
        return sal;
    }

    public void setSal(Double sal) {
        this.sal = sal;
    }

    public Double getComm() {
        return comm;
    }

    public void setComm(Double comm) {
        this.comm = comm;
    }

    public Integer getDeptno() {
        return deptno;
    }

    public void setDeptno(Integer deptno) {
        this.deptno = deptno;
    }

    public String getStartdate() {
        return startdate;
    }

    public void setStartdate(String startdate) {
        this.startdate = startdate;
    }

    public String getEnddate() {
        return enddate;
    }

    public void setEnddate(String enddate) {
        this.enddate = enddate;
    }

    public String getStartsal() {
        return startsal;
    }

    public void setStartsal(String startsal) {
        this.startsal = startsal;
    }

    public String getEndsal() {
        return endsal;
    }

    public void setEndsal(String endsal) {
        this.endsal = endsal;
    }

    public Depty getDepty() {
        return depty;
    }

    public void setDepty(Depty depty) {
        this.depty = depty;
    }
}