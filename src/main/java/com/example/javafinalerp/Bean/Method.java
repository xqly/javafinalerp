package com.example.javafinalerp.Bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Method {
    @Id
    @GeneratedValue
    private Integer MeID;
    private Integer GID;
    private Integer MID;
    private Integer MNum;

    public Integer getMeID() {
        return MeID;
    }

    public void setMeID(Integer meID) {
        MeID = meID;
    }

    public Integer getGID() {
        return GID;
    }

    public void setGID(Integer GID) {
        this.GID = GID;
    }

    public Integer getMID() {
        return MID;
    }

    public void setMID(Integer MID) {
        this.MID = MID;
    }

    public Integer getMNum() {
        return MNum;
    }

    public void setMNum(Integer MNum) {
        this.MNum = MNum;
    }
}
