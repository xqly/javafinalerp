package com.example.javafinalerp.Bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class OW  //订单-商品
{
    @Id
    @GeneratedValue
    private Integer OID;  //订货号
    private Integer WID;  //商品号
    private Integer num; //商品数量


    public Integer getOID() {
        return OID;
    }

    public void setOID(Integer OID) {
        this.OID = OID;
    }


    public Integer getWID() {
        return WID;
    }

    public void setWID(Integer WID) {
        this.WID = WID;
    }


    public Integer getnum() {
        return num;
    }

    public void setnum(Integer num) {
        this.num = num;
    }
}
