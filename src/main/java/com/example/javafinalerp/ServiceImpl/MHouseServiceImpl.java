package com.example.javafinalerp.ServiceImpl;

import com.example.javafinalerp.Bean.MHStatus;
import com.example.javafinalerp.Bean.MHouse;
import com.example.javafinalerp.Bean.MHouseLog;
import com.example.javafinalerp.Bean.Materials;
import com.example.javafinalerp.Resitory.MHStatusResitory;
import com.example.javafinalerp.Resitory.MHouseLogResitory;
import com.example.javafinalerp.Resitory.MHouseResitory;
import com.example.javafinalerp.Resitory.MaterialsResitory;
import com.example.javafinalerp.Service.MHouseService;
import com.example.javafinalerp.tempclass.Materialsandname;
import com.example.javafinalerp.tempfunc.Myfunc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class MHouseServiceImpl implements MHouseService {
    @Autowired
    private MHouseResitory mHouseResitroy;

    @Autowired
    private MaterialsResitory materialsResitory;

    @Autowired
    private MHStatusResitory mhStatusResitory;

    @Autowired
    private MHouseLogResitory mHouseLogResitory;

    @Override
    public  List<MHouse> getmhouse()
    {
        return mHouseResitroy.findAll();
//        return null;
    }


    @Override
    public void Destroybymhsid(Integer x) {
//        System.out.println(x);
        mhStatusResitory.deleteById(x);
    }

    @Override
    public List<MHouseLog> getinsertLog() {
//        return null;
        return mHouseLogResitory.getlistbystatus(1);
    }

    @Override
    public List<MHouseLog> findinsertbyid(Integer x) {
//        return null ;
        return mHouseLogResitory.getlistbystatusandid(1,x);
    }

    @Override
    public void addMaterialsbyjson(String s) {
        //xqly
        System.out.println(s);
    }

    @Override
    public List<Materialsandname> getoutdatedmaterials() {
        List<Materialsandname> lists = new ArrayList<>();
        List<MHStatus> mhs = mhStatusResitory.findAll();
        List<Materials> mater = materialsResitory.findAll();
        MHStatus temp;
        Materialsandname mhn;
        Map<Integer,String> m1 = new HashMap<>();
        Map<Integer,Integer> m2 = new HashMap<>();
        Iterator<Materials> iter = mater.iterator();
        Materials materials;
        while(iter.hasNext()){
            materials= (Materials) iter.next();
            m1.put(materials.getMID(),materials.getMName());
            m2.put(materials.getMID(),materials.getMExpDate());
        }
        Iterator<MHStatus> iter2 = mhs.iterator();
        System.out.println(mhs.size());
        while(iter2.hasNext()){
            temp = iter2.next();
            mhn = new Materialsandname(temp);
            mhn.setExpdate(m2.get(mhn.getMID()));
            mhn.setName(m1.get(mhn.getMID()));
            if(Myfunc.checkTime(mhn.getMHTime(),mhn.getExpdate()));
                lists.add(mhn);
        }
        return lists;
    }
}
