package com.example.javafinalerp.Bean;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class GP {
    @Id
    @GeneratedValue
    private Integer GPID;
    private Integer GID;
    private String GTime;
    private Integer GShop;

    public Integer getGPID() {
        return GPID;
    }

    public void setGPID(Integer GPID) {
        this.GPID = GPID;
    }

    public Integer getGID() {
        return GID;
    }

    public void setGID(Integer GID) {
        this.GID = GID;
    }

    public String getGTime() {
        return GTime;
    }

    public void setGTime(String GTime) {
        this.GTime = GTime;
    }

    public Integer getGShop() {
        return GShop;
    }

    public void setGShop(Integer GShop) {
        this.GShop = GShop;
    }
}
