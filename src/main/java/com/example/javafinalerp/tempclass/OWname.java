package com.example.javafinalerp.tempclass;

import com.example.javafinalerp.Bean.OW;

public class OWname extends OW {
    String name;
    Double Price;
    Double DoublePrice;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return Price;
    }

    public void setPrice(Double price) {
        Price = price;
    }

    public Double getDoublePrice() {
        return DoublePrice;
    }

    public void setDoublePrice(Double doublePrice) {
        DoublePrice = doublePrice;
    }


    public OWname(OW x){

    }

}
