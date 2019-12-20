package com.example.javafinalerp.ServiceImpl;

import com.example.javafinalerp.Bean.Goods;
import com.example.javafinalerp.Bean.OW;
import com.example.javafinalerp.Bean.WHStatus;
import com.example.javafinalerp.Bean.WHouseLog;
import com.example.javafinalerp.Resitory.GoodsResitory;
import com.example.javafinalerp.Resitory.OWResitory;
import com.example.javafinalerp.Resitory.WHStatusResitory;
import com.example.javafinalerp.Resitory.WHouseLogResitory;
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
    OWResitory owResitory;

    @Resource
    Goodsfunc goodsfunc;


    @Override
    public void addWH(WHStatus x) {
        whStatusResitory.save(x);
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
}
