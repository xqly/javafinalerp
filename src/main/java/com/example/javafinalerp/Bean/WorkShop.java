package com.example.javafinalerp.Bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class WorkShop {
    @Id
    @GeneratedValue
    private Integer WSID;
    private String WSName;
    private String WSSite;
    private Integer WSMan;

    public Integer getWSID() {
        return WSID;
    }

    public void setWSID(Integer WSID) {
        this.WSID = WSID;
    }

    public String getWSName() {
        return WSName;
    }

    public void setWSName(String WSName) {
        this.WSName = WSName;
    }

    public String getWSSite() {
        return WSSite;
    }

    public void setWSSite(String WSSite) {
        this.WSSite = WSSite;
    }

    public Integer getWSMan() {
        return WSMan;
    }

    public void setWSMan(Integer WSMan) {
        this.WSMan = WSMan;
    }
}
