package com.example.javafinalerp.tempfunc;

import com.example.javafinalerp.Bean.MHouse;
import com.example.javafinalerp.Bean.MP;
import com.example.javafinalerp.Bean.Materials;
import com.example.javafinalerp.Bean.User;
import com.example.javafinalerp.Resitory.MHouseResitory;
import com.example.javafinalerp.Resitory.MPResitory;
import com.example.javafinalerp.Resitory.MaterialsResitory;
import com.example.javafinalerp.Resitory.UserResitory;
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

    @Autowired
    UserResitory userResitory;

    @Autowired
    MPResitory mpResitory;

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

    public Map<Integer,String> usermap(){
        Map<Integer,String> m1 = new HashMap<>();
        List<User> li = userResitory.findAll();
        for(int i=0;i<li.size();i++){
            m1.put(li.get(i).getU_ID(),li.get(i).getUName());
        }
        return m1;
    }

    public Map<Integer,String>mpmap(){
        Map<Integer,String> m1 = new HashMap<>();
        Map<Integer,String> m2 = materialsmap();
        List<MP> list = mpResitory.findAll();
        for(int i=0;i<list.size();i++){
            m1.put(list.get(i).getMPID(),m2.get(list.get(i).getMID()));
        }
        return m1;
    }
}
