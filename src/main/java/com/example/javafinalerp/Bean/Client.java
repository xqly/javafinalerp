package com.example.javafinalerp.Bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Client {
    @Id
    @GeneratedValue
    private Integer C_ID;
    private String CName;
    private String CTele;
    private String CMail;
    private Integer CCost;
    private String CReamrk;

    public Integer getC_ID() {
        return C_ID;
    }

    public void setC_ID(Integer c_ID) {
        C_ID = c_ID;
    }

    public String getCName() {
        return CName;
    }

    public void setCName(String CName) {
        this.CName = CName;
    }

    public String getCTele() {
        return CTele;
    }

    public void setCTele(String CTele) {
        this.CTele = CTele;
    }

    public String getCMail() {
        return CMail;
    }

    public void setCMail(String CMail) {
        this.CMail = CMail;
    }

    public Integer getCCost() {
        return CCost;
    }

    public void setCCost(Integer CCost) {
        this.CCost = CCost;
    }

    public String getCReamrk() {
        return CReamrk;
    }

    public void setCReamrk(String CReamrk) {
        this.CReamrk = CReamrk;
    }
}
