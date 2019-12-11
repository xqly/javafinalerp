package com.example.javafinalerp.Bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Goods {
    @Id
    @GeneratedValue
    private Integer G_ID;
    private String GName;
    private Integer GType;
    private Integer GExpDate;
    private String GRemark;

    public Integer getG_ID() {
        return G_ID;
    }

    public void setG_ID(Integer g_ID) {
        G_ID = g_ID;
    }

    public String getGName() {
        return GName;
    }

    public void setGName(String GName) {
        this.GName = GName;
    }

    public Integer getGType() {
        return GType;
    }

    public void setGType(Integer GType) {
        this.GType = GType;
    }

    public Integer getGExpDate() {
        return GExpDate;
    }

    public void setGExpDate(Integer GExpDate) {
        this.GExpDate = GExpDate;
    }

    public String getGRemark() {
        return GRemark;
    }

    public void setGRemark(String GRemark) {
        this.GRemark = GRemark;
    }
}
