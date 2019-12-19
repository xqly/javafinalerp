package com.example.javafinalerp.Bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class OW  //订单-商品
{
    public Integer getOWID() {
        return OWID;
    }

    public void setOWID(Integer OWID) {
        this.OWID = OWID;
    }

    @Id
    @GeneratedValue
    private Integer OWID;
    private Integer OID;  //订货号
    private Integer GID;  //商品号
    private Integer num; //商品数量
    private Integer state ;
    private Integer tnum;

    public Integer getOID() {
        return OID;
    }

    public void setOID(Integer OID) {
        this.OID = OID;
    }

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

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Integer getTnum() {
        return tnum;
    }

    public void setTnum(Integer tnum) {
        this.tnum = tnum;
    }
}
