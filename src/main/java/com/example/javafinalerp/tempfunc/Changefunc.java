package com.example.javafinalerp.tempfunc;

import com.example.javafinalerp.Bean.MHStatus;
import com.example.javafinalerp.Bean.MHouse;
import com.example.javafinalerp.Bean.MHouseLog;
import com.example.javafinalerp.Bean.Materials;
import com.example.javafinalerp.Resitory.MHouseResitory;
import com.example.javafinalerp.Resitory.MaterialsResitory;
import com.example.javafinalerp.tempclass.Mhlandname;
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

    public List<Mhlandname> MHL(List<MHouseLog> list){
        Map<Integer,String> m1 = mapfunc.mpmap();
        Map<Integer,String> m2 = mapfunc.mhousesmap();
        Map<Integer,String> m3 = mapfunc.usermap();
        Map<Integer,String> m4= new HashMap<>();
        m4.put(1,"入库");
        m4.put(2,"出库");
        m4.put(3,"销毁");
        List<Mhlandname> answ = new ArrayList<>();
        for(int i=0;i<list.size();i++){
            Mhlandname temp = new Mhlandname(list.get(i));
            temp.setNameman1(m3.get(temp.getMLMan()));
            temp.setNamem(m1.get(temp.getMPID()));
            temp.setNameoper(m4.get(temp.getOper()));
            temp.setNamewh(m2.get(temp.getMHID()));
            answ.add(temp);
        }
        return answ;
    }
}
