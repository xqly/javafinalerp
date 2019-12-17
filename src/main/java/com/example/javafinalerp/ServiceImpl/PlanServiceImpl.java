package com.example.javafinalerp.ServiceImpl;

import com.example.javafinalerp.Bean.Goods;
import com.example.javafinalerp.Bean.ProducePlan;
import com.example.javafinalerp.Resitory.GoodsResitory;
import com.example.javafinalerp.Resitory.ProducePlanResitory;
import com.example.javafinalerp.Service.PlanService;
import com.example.javafinalerp.tempclass.Planandname;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class PlanServiceImpl implements PlanService {

    @Autowired
    ProducePlanResitory producePlanResitory;

    @Autowired
    GoodsResitory goodsResitory;

    @Override
    public List<Planandname> getunplannamelist() {
        List<Planandname> lists = new ArrayList<>();
        List<ProducePlan> plist = producePlanResitory.findAll();
        List<Goods> glist = goodsResitory.findAll();
        Map<Integer,String> m1 = new HashMap<>();
        Iterator<Goods> iter = glist.iterator();
        while(iter.hasNext()){
            Goods temp = iter.next();
            m1.put(temp.getG_ID(),temp.getGName());
        }
        Iterator<ProducePlan> iter2 = plist.iterator();
        while(iter.hasNext()){
            Planandname temp = new Planandname(iter2.next());
            temp.setName(m1.get(temp.getGoodid()));
            lists.add(temp);
        }
        return lists;
    }

    @Override
    public void outMaterialsbyPlanid(Integer x) {
        ProducePlan plan =  producePlanResitory.findppbypid(x);
        //xqly

    }
}
