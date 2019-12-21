package com.example.javafinalerp.Bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.sql.Time;

@Entity
public class User {
    @Id
    @GeneratedValue
    private Integer U_ID;
    private String UName;
    private String UTelephone;
    private String UStartTime;
    private Integer UDept;
    private Double USal;
    private String UMail;


    public Integer getU_ID() {
        return U_ID;
    }

    public void setU_ID(Integer u_ID) {
        U_ID = u_ID;
    }

    public String getUName() {
        return UName;
    }

    public void setUName(String UName) {
        this.UName = UName;
    }

    public String getUTelephone() {
        return UTelephone;
    }

    public void setUTelephone(String UTelephone) {
        this.UTelephone = UTelephone;
    }

    public String getUStartTime() {
        return UStartTime;
    }

    public void setUStartTime(String UStartTime) {
        this.UStartTime = UStartTime;
    }

    public Integer getUDept() {
        return UDept;
    }

    public void setUDept(Integer UDept) {
        this.UDept = UDept;
    }

    public Double getUSal() {
        return USal;
    }

    public void setUSal(Double USal) {
        this.USal = USal;
    }

    public String getUMail() {
        return UMail;
    }

    public void setUMail(String UMail) {
        this.UMail = UMail;
    }
}
