package com.example.javafinalerp.tempclass;
import com.example.javafinalerp.Bean.Method;


public class Methodname extends Method {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;
    public Methodname()
    {

    }
    public Methodname(Method m)
    {
        this.setMeID(m.getMeID());
        this.setGID(m.getGID());
        this.setMID(m.getMID());
        this.setMNum(m.getMNum());

    }

}