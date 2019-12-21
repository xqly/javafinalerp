package com.example.javafinalerp.tempfunc;

import com.example.javafinalerp.Bean.MHouse;
import com.example.javafinalerp.Bean.Materials;
import com.example.javafinalerp.Resitory.MHouseResitory;
import com.example.javafinalerp.Resitory.MaterialsResitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class Mapfunc {
    @Autowired
    MaterialsResitory materialsResitory;

    @Autowired
    MHouseResitory mHouseResitory;

    public Map<Integer,String> materialsmap(){
        Map<Integer,String > m1 = new HashMap<>();
        List<Materials> mm = materialsResitory.findAll();
        for(int i=0;i<mm.size();i++){
            m1.put(mm.get(i).getMID(),mm.get(i).getMName());
        }
        return m1;
    }

    public Map<Integer,String> mhousesmap(){
        Map<Integer,String > m1 = new HashMap<>();
        List<MHouse> mm = mHouseResitory.findAll();
        for(int i=0;i<mm.size();i++){
            m1.put(mm.get(i).getMHID(),mm.get(i).getMHName());
        }
        return m1;
    }
}
