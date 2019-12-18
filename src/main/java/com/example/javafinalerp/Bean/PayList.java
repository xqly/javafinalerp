package com.example.javafinalerp.Bean;

import com.sun.javafx.beans.IDProperty;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class PayList {
    @Id
    @GeneratedValue
    private Integer PID;
    private Integer OID;
    private Double Money;
    private String Time;
    private Integer PMan;
    private String Remark;
    private Integer state;
    private Integer stateout;
    private String bankname;
    private String banknum;

    public Integer getPID() {
        return PID;
    }

    public void setPID(Integer PID) {
        this.PID = PID;
    }

    public Integer getOID() {
        return OID;
    }

    public void setOID(Integer OID) {
        this.OID = OID;
    }

    public Double getMoney() {
        return Money;
    }

    public void setMoney(Double money) {
        Money = money;
    }

    public String getTime() {
        return Time;
    }

    public void setTime(String time) {
        Time = time;
    }

    public Integer getPMan() {
        return PMan;
    }

    public void setPMan(Integer PMan) {
        this.PMan = PMan;
    }

    public String getRemark() {
        return Remark;
    }

    public void setRemark(String remark) {
        Remark = remark;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Integer getStateout() {
        return stateout;
    }

    public void setStateout(Integer stateout) {
        this.stateout = stateout;
    }

    public String getBankname() {
        return bankname;
    }

    public void setBankname(String bankname) {
        this.bankname = bankname;
    }

    public String getBanknum() {
        return banknum;
    }

    public void setBanknum(String banknum) {
        this.banknum = banknum;
    }
}
