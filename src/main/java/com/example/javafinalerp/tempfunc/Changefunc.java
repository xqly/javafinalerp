package com.example.javafinalerp.tempfunc;

import com.example.javafinalerp.Bean.MHStatus;
import com.example.javafinalerp.Bean.Materials;
import com.example.javafinalerp.Resitory.MaterialsResitory;
import com.example.javafinalerp.tempclass.Mhsname;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class Changefunc {
    @Autowired
    MaterialsResitory materialsResitory;


    public List<Mhsname> MHS(List<MHStatus> list){
        Map<Integer,String > m1 = new HashMap<>();
        List<Materials> mm = materialsResitory.findAll();
        for(int i=0;i<mm.size();i++){
            m1.put(mm.get(i).getMID(),mm.get(i).getMName());
        }
        List<Mhsname> answ = new ArrayList<>();
        for(int i=0;i<list.size();i++){
            Mhsname temp = new Mhsname(list.get(i));
            temp.setMname(m1.get(temp.getMID()));
            answ.add(temp);
        }
        return answ;
    }
}
