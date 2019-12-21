package com.example.javafinalerp.tempfunc;

import com.example.javafinalerp.Bean.MHStatus;
import com.example.javafinalerp.Bean.MHouse;
import com.example.javafinalerp.Bean.Materials;
import com.example.javafinalerp.Resitory.MHouseResitory;
import com.example.javafinalerp.Resitory.MaterialsResitory;
import com.example.javafinalerp.tempclass.Mhsname;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class Changefunc {
    @Autowired
    MaterialsResitory materialsResitory;

    @Autowired
    MHouseResitory mHouseResitory;

    @Resource
    Mapfunc mapfunc;

    public List<Mhsname> MHS(List<MHStatus> list){
        Map<Integer,String > m1 = mapfunc.materialsmap();
        Map<Integer,String> m2 = mapfunc.mhousesmap();
        List<Mhsname> answ = new ArrayList<>();
        for(int i=0;i<list.size();i++){
            Mhsname temp = new Mhsname(list.get(i));
            temp.setMname(m1.get(temp.getMID()));
            temp.setNhname(m2.get(temp.getMHID()));
            answ.add(temp);
        }
        return answ;
    }
}
