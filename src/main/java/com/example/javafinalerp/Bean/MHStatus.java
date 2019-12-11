package com.example.javafinalerp.Bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class MHStatus {
    @Id
    @GeneratedValue
    private Integer MHSID;
    private Integer MHID;
    private Integer MID;
    private Integer MHPID;
    private String MHTime;
    private Integer MHNum;

    public Integer getMHSID() {
        return MHSID;
    }

    public void setMHSID(Integer MHSID) {
        this.MHSID = MHSID;
    }

    public Integer getMHID() {
        return MHID;
    }

    public void setMHID(Integer MHID) {
        this.MHID = MHID;
    }

    public Integer getMID() {
        return MID;
    }

    public void setMID(Integer MID) {
        this.MID = MID;
    }

    public Integer getMHPID() {
        return MHPID;
    }

    public void setMHPID(Integer MHPID) {
        this.MHPID = MHPID;
    }

    public String getMHTime() {
        return MHTime;
    }

    public void setMHTime(String MHTime) {
        this.MHTime = MHTime;
    }

    public Integer getMHNum() {
        return MHNum;
    }

    public void setMHNum(Integer MHNum) {
        this.MHNum = MHNum;
    }
}
