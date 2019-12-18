package com.example.javafinalerp.tempclass;

import com.example.javafinalerp.Bean.ProducePlan;

public class Planandname extends ProducePlan {
    private String name;
    private Integer x;
    private Integer pid;
    private  String ptime;
    private Integer goodid;
    private Integer gnum;
    private Integer pworkshop;
    private Integer pstate;


    public Planandname(ProducePlan x){
        this.setGnum(x.getGnum());
        this.setGoodid(x.getGoodid());
        this.setPid(x.getPid());
        this.setPtime(x.getPtime());
        this.setPworkshop(x.getPworkshop());
        this.setPstate(x.getPstate());
    }

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getX() {
        return x;
    }

    public void setX(Integer x) {
        this.x = x;
    }
}
