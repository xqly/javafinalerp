package com.example.javafinalerp.Bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Ordergoods {
    @Id
    @GeneratedValue
    private Integer OID;  //订货号



    private Integer CID;  //客户账号
    private String OTime;  //订单时间
    private Integer OMID; //负责人id
    private String remark;  //备注
    private String OLTime;  //取货时间
    private Integer type;
    private double discount;


    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getOID() {
        return OID;
    }

    public void setOID(Integer OID) {
        this.OID = OID;
    }


    public Integer getCID() {
        return CID;
    }

    public void setCID(Integer CID) {
        this.CID = CID;
    }


    public String getOTime() {
        return OTime;
    }

    public void setOTime(String OTime) {
        this.OTime = OTime;
    }

    public Integer getOMID() {
        return OMID;
    }

    public void setOMID(Integer OMID) {
        this.OMID = OMID;
    }


    public String getremark() {
        return remark;
    }

    public void setremark(String remark) {
        this.remark = remark;
    }

    public String getOLTime() {
        return OLTime;
    }

    public void setOLTime(String OLTime) {
        this.OLTime = OLTime;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }
}
