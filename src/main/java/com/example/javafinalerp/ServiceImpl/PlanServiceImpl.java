package com.example.javafinalerp.ServiceImpl;

import com.example.javafinalerp.Bean.Goods;
import com.example.javafinalerp.Bean.ProducePlan;
import com.example.javafinalerp.Resitory.GoodsResitory;
import com.example.javafinalerp.Resitory.ProducePlanResitory;
import com.example.javafinalerp.Service.PlanService;
import com.example.javafinalerp.tempclass.Planandname;
import com.example.javafinalerp.tempfunc.Materfunc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.*;

@Service
public class PlanServiceImpl implements PlanService {


    @Autowired
    ProducePlanResitory producePlanResitory;

    @Autowired
    GoodsResitory goodsResitory;

    @Resource
    Materfunc materfunc;

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
//        System.out.println(plist.size());
        while(iter2.hasNext()){
            Planandname temp = new Planandname(iter2.next());
            temp.setName(m1.get(temp.getGoodid()));
            if(temp.getPstate()==1){
                lists.add(temp);
            }
//            System.out.println(111);
        }
        return lists;
    }

    @Override
    public void outMaterialsbyPlanid(Integer x) {
        ProducePlan plan =  producePlanResitory.findppbypid(x);
//        System.out.println(2);
        materfunc.OutMaterialbyPlan(x);
        plan.setPstate(2);
        producePlanResitory.save(plan);
    }

    @Override
    public List<Integer> getMethodmygoods(Integer x) {
        return null;//xqly

    }
}
