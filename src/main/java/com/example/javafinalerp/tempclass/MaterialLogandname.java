package com.example.javafinalerp.tempclass;

import com.example.javafinalerp.Bean.MHouseLog;

public class MaterialLogandname extends MHouseLog {
    String name;
    Integer mid;
    public MaterialLogandname(MHouseLog x){
        this.setMDate(x.getMDate());
        this.setMHID(x.getMHID());
        this.setMLMan(x.getMLMan());
        this.setMLNum(x.getMLNum());
        this.setMPID(x.getMPID());
        this.setOper(x.getOper());
        this.setMHLID(x.getMHLID());
        this.setMLWMan(x.getMLWMan());
    }

    public Integer getMid() {
        return mid;
    }

    public void setMid(Integer mid) {
        this.mid = mid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
