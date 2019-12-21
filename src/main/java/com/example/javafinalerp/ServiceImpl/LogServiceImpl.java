package com.example.javafinalerp.ServiceImpl;

import com.example.javafinalerp.Bean.MHouseLog;
import com.example.javafinalerp.Bean.MP;
import com.example.javafinalerp.Bean.WHouseLog;
import com.example.javafinalerp.Resitory.MHouseLogResitory;
import com.example.javafinalerp.Resitory.MPResitory;
import com.example.javafinalerp.Resitory.WHouseLogResitory;
import com.example.javafinalerp.Service.LogService;
import com.example.javafinalerp.tempclass.MaterialLogandname;
import com.example.javafinalerp.tempclass.Materialsandname;
import com.example.javafinalerp.tempclass.Mhlandname;
import com.example.javafinalerp.tempfunc.Changefunc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class LogServiceImpl implements LogService {

    @Autowired
    MHouseLogResitory mHouseLogResitory;

    @Autowired
    WHouseLogResitory wHouseLogResitory;

    @Autowired
    MPResitory mpResitory;

    @Resource
    Changefunc changefunc;

    @Override
    public List<WHouseLog> getWHLList() {
        return wHouseLogResitory.findAll();
    }

    @Override
    public List<Mhlandname> getMHLListandname() {
        List<MHouseLog> lists = mHouseLogResitory.findAll();

        List<Mhlandname> logs = changefunc.MHL(lists);
        return logs;
    }

    @Override
    public List<WHouseLog> getWHLListByHID(Integer x) {
        return wHouseLogResitory.getlistByWID(x);
    }

    @Override
    public List<MaterialLogandname> getMHLListByHID(Integer x) {
        List<MHouseLog> lists = mHouseLogResitory.getlistByMHID(x);;
        List<MaterialLogandname> logs = new ArrayList<>();
        List<MP> mp = mpResitory.findAll();
        Map<Integer,Integer> m1 = new HashMap<>();
        for(int i=0;i<mp.size();i++){
            m1.put(mp.get(i).getMPID(),mp.get(i).getMID());
        }
        for(int i=0;i<lists.size();i++){
            MaterialLogandname temp = new MaterialLogandname(lists.get(i));
            temp.setMid(m1.get(temp.getMPID()));
            logs.add(temp);
        }
        return logs;
    }

    @Override
    public List<MaterialLogandname> getMHLListByID(Integer x) {
        List<MHouseLog> lists = mHouseLogResitory.getlistByID(x);;
        List<MaterialLogandname> logs = new ArrayList<>();
        List<MP> mp = mpResitory.findAll();
        Map<Integer,Integer> m1 = new HashMap<>();
        for(int i=0;i<mp.size();i++){
            m1.put(mp.get(i).getMPID(),mp.get(i).getMID());
        }
        for(int i=0;i<lists.size();i++){
            MaterialLogandname temp = new MaterialLogandname(lists.get(i));
            temp.setMid(m1.get(temp.getMPID()));
            logs.add(temp);
        }
        return logs;
    }

    @Override
    public List<WHouseLog> getWHLListByID(Integer x) {
        return wHouseLogResitory.getlistByID(x);
    }
}
