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
    private String Oper;
    private Integer MID;
    private Integer MPID;
    private String MDate;
    private Integer MLNum;
    private Integer MLMan;

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

    public String getOper() {
        return Oper;
    }

    public void setOper(String oper) {
        Oper = oper;
    }

    public Integer getMID() {
        return MID;
    }

    public void setMID(Integer MID) {
        this.MID = MID;
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
