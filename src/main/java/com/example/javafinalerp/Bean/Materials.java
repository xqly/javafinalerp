package com.example.javafinalerp.Bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Materials {
    @Id
    @GeneratedValue
    private Integer MID;
    private String MName;
    private Double MPrice;
    private Integer MExpDate;
    private String MRemark;


    public String getMRemark() {
        return MRemark;
    }

    public void setMRemark(String MRemark) {
        this.MRemark = MRemark;
    }

    public Integer getMID() {
        return MID;
    }

    public void setMID(Integer MID) {
        this.MID = MID;
    }

    public String getMName() {
        return MName;
    }

    public void setMName(String MName) {
        this.MName = MName;
    }

    public Double getMPrice() {
        return MPrice;
    }

    public void setMPrice(Double MPrice) {
        this.MPrice = MPrice;
    }

    public Integer getMExpDate() {
        return MExpDate;
    }

    public void setMExpDate(Integer MExpDate) {
        this.MExpDate = MExpDate;
    }
}
