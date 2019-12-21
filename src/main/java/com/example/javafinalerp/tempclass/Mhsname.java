package com.example.javafinalerp.tempclass;

import com.example.javafinalerp.Bean.MHStatus;

public class Mhsname extends MHStatus {
    String mname;
    public Mhsname(MHStatus x){
        this.setMHNum(x.getMHNum());
        this.setMHID(x.getMHID());
        this.setMHPID(x.getMHPID());
        this.setMHSID(x.getMHSID());
        this.setMID(x.getMID());
        this.setMHTime(x.getMHTime());
    }

    public String getMname() {
        return mname;
    }

    public void setMname(String mname) {
        this.mname = mname;
    }
}
