package com.example.javafinalerp.Bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.criteria.CriteriaBuilder;

@Entity
public class WHouse {
    @Id
    @GeneratedValue
    private Integer WID;
    private String WName;
    private String WAdr;
    private Integer WMID;
    private String WRemark;

    public Integer getWID() {
        return WID;
    }

    public void setWID(Integer WID) {
        this.WID = WID;
    }

    public String getWName() {
        return WName;
    }

    public void setWName(String WName) {
        this.WName = WName;
    }

    public String getWAdr() {
        return WAdr;
    }

    public void setWAdr(String WAdr) {
        this.WAdr = WAdr;
    }

    public Integer getWMID() {
        return WMID;
    }

    public void setWMID(Integer WMID) {
        this.WMID = WMID;
    }

    public String getWRemark() {
        return WRemark;
    }

    public void setWRemark(String WRemark) {
        this.WRemark = WRemark;
    }
}
