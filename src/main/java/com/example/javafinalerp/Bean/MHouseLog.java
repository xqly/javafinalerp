package com.example.javafinalerp.Bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class MHouseLog {
    @Id
    @GeneratedValue
    private Integer MHLID;    //日志编号
    private Integer MHID;  // 原料库id
    private String Oper;   //操作
    private Integer MID;  //原料id
    private Integer MPID;   // 车间id
    private String MDate;  //时间
    private Integer MLNum;  //数量
    private Integer MLMan;  //负责人id

    public Integer getMHLID() {
        return MHLID;
    }

    public void setMHLID(Integer MHLID) {
        this.MHLID = MHLID;
    }

    public Integer getMHID() {
        return MHID;
    }

    public void setMHID(Integer MHID) {
        this.MHID = MHID;
    }

    public String getOper() {
        return Oper;
    }

    public void setOper(String oper) {
        Oper = oper;
    }

    public Integer getMID() {
        return MID;
    }

    public void setMID(Integer MID) {
        this.MID = MID;
    }

    public Integer getMPID() {
        return MPID;
    }

    public void setMPID(Integer MPID) {
        this.MPID = MPID;
    }

    public String getMDate() {
        return MDate;
    }

    public void setMDate(String MDate) {
        this.MDate = MDate;
    }

    public Integer getMLNum() {
        return MLNum;
    }

    public void setMLNum(Integer MLNum) {
        this.MLNum = MLNum;
    }

    public Integer getMLMan() {
        return MLMan;
    }

    public void setMLMan(Integer MLMan) {
        this.MLMan = MLMan;
    }
}
