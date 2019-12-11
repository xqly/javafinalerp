package com.example.javafinalerp.Bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.criteria.CriteriaBuilder;

@Entity
public class WHStatus {
    @Id
    @GeneratedValue
    private Integer WHSID;
    private Integer WHID;
    private Integer GID;
    private Integer GPID;
    private String WHTime;
    private Integer GNum;

    public String getWHTime() {
        return WHTime;
    }

    public void setWHTime(String WHTime) {
        this.WHTime = WHTime;
    }

    public Integer getWHSID() {
        return WHSID;
    }

    public void setWHSID(Integer WHSID) {
        this.WHSID = WHSID;
    }

    public Integer getWHID() {
        return WHID;
    }

    public void setWHID(Integer WHID) {
        this.WHID = WHID;
    }

    public Integer getGID() {
        return GID;
    }

    public void setGID(Integer GID) {
        this.GID = GID;
    }

    public Integer getGPID() {
        return GPID;
    }

    public void setGPID(Integer GPID) {
        this.GPID = GPID;
    }

    public Integer getGNum() {
        return GNum;
    }

    public void setGNum(Integer GNum) {
        this.GNum = GNum;
    }
}
