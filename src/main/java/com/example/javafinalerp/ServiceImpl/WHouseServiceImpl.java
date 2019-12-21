package com.example.javafinalerp.ServiceImpl;

import com.example.javafinalerp.Bean.*;
import com.example.javafinalerp.Resitory.*;
import com.example.javafinalerp.Service.WHouseService;
import com.example.javafinalerp.tempfunc.Goodsfunc;
import com.example.javafinalerp.tempfunc.Myfunc;
import net.bytebuddy.asm.Advice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class WHouseServiceImpl implements WHouseService {

    @Autowired
    WHStatusResitory whStatusResitory;

    @Autowired
    GoodsResitory goodsResitory;

    @Autowired
    WHouseLogResitory wHouseLogResitory;

    @Autowired
    WHouseResitroy wHouseResitroy;

    @Autowired
    OWResitory owResitory;

    @Resource
    Goodsfunc goodsfunc;

    @Autowired
    GPResitory gpResitory;


    @Override
    public void addWH(Integer gid,Integer num,Integer shop ,String Time,Integer whid) {
        GP gp = new GP();
        gp.setGID(gid);
        gp.setGShop(shop);
        gp.setGTime(Time);
        gpResitory.save(gp);
        List<GP> ll = gpResitory.findAll();
        Integer pid =0;
        for(int i=0;i<ll.size();i++){
            if(ll.get(i).getGPID()>pid){
                pid=ll.get(i).getGPID();
            }
        }
        WHStatus whStatus = new WHStatus(whid,gid,pid,Time,num);
        whStatusResitory.save(whStatus);

    }

    @Override
    public List<WHouseLog> getinLog() {
        return wHouseLogResitory.getlistbyoper(1);
    }

    @Override
    public List<WHouseLog> getlistbyid(Integer x) {
        return wHouseLogResitory.getlistByID(x);
    }

    @Override
    public List<WHouseLog> getoutLog() {
        return wHouseLogResitory.getlistbyoper(2);
    }

    @Override
    public void outGoodsbysaleID(Integer x) {
        List<OW> ows = owResitory.findlistbyoid(x);
        for(int i=0;i<ows.size();i++){
            OW ow = ows.get(i);
            if(ow.getState()==2){
                goodsfunc.outGoodsbyid(ow.getGID(),ow.getNum()-ow.getTnum());
            }
            else {
                goodsfunc.outGoodsbyid(ow.getGID(),ow.getNum());
            }
        }
    }

    @Override
    public List<WHStatus> getoutdatedlist() {
        List<WHStatus> whStatuses = whStatusResitory.findAll();
        List<WHStatus> lists = new ArrayList<>();
        Map<Integer,Integer> m1 = new HashMap<>();
        List<Goods> gl = goodsResitory.findAll();
        for(int i=0;i<gl.size();i++){
            m1.put(gl.get(i).getG_ID(),gl.get(i).getGExpDate());
        }
        for(int i=0;i<whStatuses.size();i++){
            if(!Myfunc.checkTime(whStatuses.get(i).getWHTime(),m1.get(whStatuses.get(i).getGID()))){
                lists.add(whStatuses.get(i));
            }
        }
        return lists;
    }

    @Override
    public void DestroybySID(Integer x) {
        whStatusResitory.deleteById(x);
    }

    public List<WHouse> getwhbyid(){
        return wHouseResitroy.findAll();
    }
}
