package com.example.javafinalerp.tempclass;

import com.example.javafinalerp.Bean.MHouseLog;

public class Mhlandname extends MHouseLog {
    String nameoper;
    String namewh;
    String namem;
    String nameman1;


    public Mhlandname(MHouseLog x){
        this.setMLWMan(x.getMLWMan());
        this.setMHLID(x.getMHLID());
        this.setMLMan(x.getMLMan());
        this.setOper(x.getOper());
        this.setMPID(x.getMPID());
        this.setMLNum(x.getMLNum());
        this.setMHID(x.getMHID());
        this.setMDate(x.getMDate());
    }

    public String getNameoper() {
        return nameoper;
    }

    public void setNameoper(String nameoper) {
        this.nameoper = nameoper;
    }

    public String getNamewh() {
        return namewh;
    }

    public void setNamewh(String namewh) {
        this.namewh = namewh;
    }

    public String getNamem() {
        return namem;
    }

    public void setNamem(String namem) {
        this.namem = namem;
    }

    public String getNameman1() {
        return nameman1;
    }

    public void setNameman1(String nameman) {
        this.nameman1 = nameman;
    }
}
