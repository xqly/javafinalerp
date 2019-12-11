package com.example.javafinalerp.Bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class WHouseLog {
    @Id
    @GeneratedValue
    private Integer LID;
    private Integer WID;
    private String LOper;
    private Integer LFID;
    private Integer LMan;
    private String LTime;
    private Integer LGId;
    private Integer GPID;
    private Integer LNum;

    public Integer getLID() {
        return LID;
    }

    public void setLID(Integer LID) {
        this.LID = LID;
    }

    public Integer getWID() {
        return WID;
    }

    public void setWID(Integer WID) {
        this.WID = WID;
    }

    public String getLOper() {
        return LOper;
    }

    public void setLOper(String LOper) {
        this.LOper = LOper;
    }

    public Integer getLFID() {
        return LFID;
    }

    public void setLFID(Integer LFID) {
        this.LFID = LFID;
    }

    public Integer getLMan() {
        return LMan;
    }

    public void setLMan(Integer LMan) {
        this.LMan = LMan;
    }

    public String getLTime() {
        return LTime;
    }

    public void setLTime(String LTime) {
        this.LTime = LTime;
    }

    public Integer getLGId() {
        return LGId;
    }

    public void setLGId(Integer LGId) {
        this.LGId = LGId;
    }

    public Integer getGPID() {
        return GPID;
    }

    public void setGPID(Integer GPID) {
        this.GPID = GPID;
    }

    public Integer getLNum() {
        return LNum;
    }

    public void setLNum(Integer LNum) {
        this.LNum = LNum;
    }
}
