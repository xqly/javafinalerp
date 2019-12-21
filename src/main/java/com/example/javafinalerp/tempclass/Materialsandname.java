package com.example.javafinalerp.tempclass;

import com.example.javafinalerp.Bean.MHStatus;
import com.example.javafinalerp.Bean.Materials;

public class Materialsandname extends MHStatus {
    private String name;
    private Integer expdate;
    private Double MPrice;
    private String mhname;

    public Materialsandname(MHStatus x){
        this.setMHID(x.getMHID());
        this.setMHNum(x.getMHNum());
        this.setMHPID(x.getMHPID());
        this.setMHSID(x.getMHSID());
        this.setMHTime(x.getMHTime());
        this.setMID(x.getMID());
    }

    public String getMhname() {
        return mhname;
    }

    public void setMhname(String mhname) {
        this.mhname = mhname;
    }

    public Double getMPrice() {
        return MPrice;
    }

    public void setMPrice(Double MPrice) {
        this.MPrice = MPrice;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getExpdate() {
        return expdate;
    }

    public void setExpdate(Integer expdate) {
        this.expdate = expdate;
    }
}
