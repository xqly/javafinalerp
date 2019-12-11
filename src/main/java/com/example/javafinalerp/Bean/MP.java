package com.example.javafinalerp.Bean;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class MP {
    @Id
    @GeneratedValue
    private Integer MPID;
    private Integer MID;
    private String MTime;

    public Integer getMPID() {
        return MPID;
    }

    public void setMPID(Integer MPID) {
        this.MPID = MPID;
    }

    public Integer getMID() {
        return MID;
    }

    public void setMID(Integer MID) {
        this.MID = MID;
    }

    public String getMTime() {
        return MTime;
    }

    public void setMTime(String MTime) {
        this.MTime = MTime;
    }
}
