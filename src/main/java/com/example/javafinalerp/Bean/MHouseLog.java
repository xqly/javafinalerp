package com.example.javafinalerp.Bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class MHouseLog {
    @Id
    @GeneratedValue
    private Integer MHLID;
    private Integer MHID;
    private Integer Oper;
    private Integer MPID;
    private String MDate;
    private Integer MLNum;
    private Integer MLMan;
    private Integer MLWMan;

    public Integer getOper() {
        return Oper;
    }

    public void setOper(Integer oper) {
        Oper = oper;
    }

    public Integer getMLWMan() {
        return MLWMan;
    }

    public void setMLWMan(Integer MLWMan) {
        this.MLWMan = MLWMan;
    }

    public Integer getMHLID() {
        return MHLID;
    }

    public void setMHLID(Integer MHLID) {
        this.MHLID = MHLID;
    }

    public Integer getMHID() {
        return MHID;
    }

    public void setMHID(Integer MHID) {
        this.MHID = MHID;
    }

    public Integer getMPID() {
        return MPID;
    }

    public void setMPID(Integer MPID) {
        this.MPID = MPID;
    }

    public String getMDate() {
        return MDate;
    }

    public void setMDate(String MDate) {
        this.MDate = MDate;
    }

    public Integer getMLNum() {
        return MLNum;
    }

    public void setMLNum(Integer MLNum) {
        this.MLNum = MLNum;
    }

    public Integer getMLMan() {
        return MLMan;
    }

    public void setMLMan(Integer MLMan) {
        this.MLMan = MLMan;
    }
}
