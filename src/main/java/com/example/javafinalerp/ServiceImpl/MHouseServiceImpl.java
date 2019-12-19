package com.example.javafinalerp.ServiceImpl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
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
import com.example.javafinalerp.tempfunc.Materfunc;
import com.example.javafinalerp.tempfunc.Myfunc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
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

    @Resource
    Materfunc materfunc;

    @Override
    public  List<MHouse> getmhouse()
    {
        return mHouseResitroy.findAll();
//        return null;
    }


    @Override
    public void Destroybymhsid(Integer x) {
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
        System.out.println(s);
        JSONArray jsonArray = JSON.parseArray(s);
        List<Materials> lists = materialsResitory.findAll();
        Map<String,Integer> m1 = new HashMap<>();
        for(int i=0;i<lists.size();i++){
            m1.put(lists.get(i).getMName(),lists.get(i).getMID());
        }
        for(int i=0;i<jsonArray.size();i++){
            JSONObject object = jsonArray.getJSONObject(i);
            String mname = object.getString("mname");
            Integer mhid = object.getInteger("MHID");
            Integer Mhnum = object.getInteger("MHNum");
            String mhtime = object.getString("MHTime");
            Integer mid = m1.get(mname);
            materfunc.InMaterialsbyiqdandnum(mid,Mhnum,mhtime,mhid);
        }
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
        while(iter2.hasNext()){
            temp = iter2.next();
            mhn = new Materialsandname(temp);
            mhn.setExpdate(m2.get(mhn.getMID()));
            mhn.setName(m1.get(mhn.getMID()));
            if(!Myfunc.checkTime(mhn.getMHTime(),mhn.getExpdate()))
                lists.add(mhn);
        }
        return lists;
    }
}
