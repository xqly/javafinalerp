package com.example.javafinalerp.tempclass;

import com.example.javafinalerp.Bean.ProducePlan;

public class Planandname extends ProducePlan {
    private String name;
    private Integer x;
    public Planandname(ProducePlan x){
        this.setGnum(x.getGnum());
        this.setGoodid(x.getGoodid());
        this.setPid(x.getPid());
        this.setPtime(x.getPtime());
        this.setPworkshop(x.getPworkshop());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getX() {
        return x;
    }

    public void setX(Integer x) {
        this.x = x;
    }
}
