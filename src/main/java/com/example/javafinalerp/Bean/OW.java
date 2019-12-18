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
    private Integer GID;  //商品号
    private Integer num; //商品数量
    private Integer state ;
    private Integer tnum;

    public Integer getGID() {
        return GID;
    }

    public void setGID(Integer GID) {
        this.GID = GID;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public Integer getOID() {
        return OID;
    }

    public void setOID(Integer OID) {
        this.OID = OID;
    }


    public Integer getnum() {
        return num;
    }

    public void setnum(Integer num) {
        this.num = num;
    }
}
