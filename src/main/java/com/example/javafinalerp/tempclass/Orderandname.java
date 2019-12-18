package com.example.javafinalerp.tempclass;

import com.example.javafinalerp.Bean.OW;
import com.example.javafinalerp.Bean.Ordergoods;

import java.util.List;

public class Orderandname extends Ordergoods {
    List<OWname> oWnames;
    double price1;
    double price2;
    public Orderandname(Ordergoods x){
        this.setCID(x.getCID());
        this.setDiscount(x.getDiscount());
        this.setOID(x.getOID());
        this.setOLTime(x.getOLTime());
        this.setOMID(x.getOMID());
        this.setOTime(x.getOTime());
        this.setRemark(x.getRemark());
        this.setremark(x.getRemark());
        this.setType(x.getType());
    }

    public List<OWname> getoWnames() {
        return oWnames;
    }

    public void setoWnames(List<OWname> oWnames) {
        this.oWnames = oWnames;
    }

    public double getPrice1() {
        return price1;
    }

    public void setPrice1(double price1) {
        this.price1 = price1;
    }

    public double getPrice2() {
        return price2;
    }

    public void setPrice2(double price2) {
        this.price2 = price2;
    }
}
