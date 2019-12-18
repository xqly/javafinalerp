package com.example.javafinalerp.Bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class ProducePlan {
    @Id
    @GeneratedValue
    private Integer pid;
    private  String ptime;
    private Integer goodid;
    private Integer gnum;
    private Integer pworkshop;
    private Integer pstate;

    public Integer getPstate() {
        return pstate;
    }

    public void setPstate(Integer pstate) {
        this.pstate = pstate;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getPtime() {
        return ptime;
    }

    public void setPtime(String ptime) {
        this.ptime = ptime;
    }

    public Integer getGoodid() {
        return goodid;
    }

    public void setGoodid(Integer goodid) {
        this.goodid = goodid;
    }

    public Integer getGnum() {
        return gnum;
    }

    public void setGnum(Integer gnum) {
        this.gnum = gnum;
    }

    public Integer getPworkshop() {
        return pworkshop;
    }

    public void setPworkshop(Integer pworkshop) {
        this.pworkshop = pworkshop;
    }
}
