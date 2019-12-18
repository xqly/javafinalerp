package com.example.javafinalerp.Bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class MHouse {
    @Id
    @GeneratedValue
    private Integer MHID;
    private String MHName;
    private String MHSite;
    private Integer MHMan;

    public Integer getMHID() {
        return MHID;
    }

    public void setMHID(Integer MHID) {
        this.MHID = MHID;
    }

    public String getMHName() {
        return MHName;
    }

    public void setMHName(String MHName) {
        this.MHName = MHName;
    }

    public String getMHSite() {
        return MHSite;
    }

    public void setMHSite(String MHSite) {
        this.MHSite = MHSite;
    }

    public Integer getMHMan() {
        return MHMan;
    }

    public void setMHMan(Integer MHMan) {
        this.MHMan = MHMan;
    }
}
