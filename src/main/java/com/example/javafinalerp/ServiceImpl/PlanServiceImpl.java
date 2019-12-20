package com.example.javafinalerp.ServiceImpl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.example.javafinalerp.Bean.Goods;
import com.example.javafinalerp.Bean.Method;
import com.example.javafinalerp.Bean.ProducePlan;
import com.example.javafinalerp.Resitory.GoodsResitory;
import com.example.javafinalerp.Resitory.MethodResitory;
import com.example.javafinalerp.Resitory.ProducePlanResitory;
import com.example.javafinalerp.Service.PlanService;
import com.example.javafinalerp.tempclass.Planandname;
import com.example.javafinalerp.tempfunc.Materfunc;
import com.google.gson.JsonArray;
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

    @Autowired
    MethodResitory methodResitory;

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
    public void addmethodbyjson(String s,Integer gid) {
        JSONArray jsonArray = JSON.parseArray(s);
        for(int i=0;i<jsonArray.size();i++){
            JSONObject jsonObject = jsonArray.getJSONObject(i);
            Integer mid = jsonObject.getInteger("mid");
            Integer num = jsonObject.getInteger("num");
            Method method = new Method(gid,mid,num);
            methodResitory.save(method);
        }
    }
<<<<<<< HEAD
=======
//<<<<<<< Updated upstream
>>>>>>> origin
    @Override
    public void addplan(ProducePlan plan) {
        producePlanResitory.save(plan);
    }
<<<<<<< HEAD

    @Override
    public void delgoodsmethod(Integer dd) {
        List<Method> list = methodResitory.findAll();
        for(int i=0;i<list.size();i++){
            Method temp = list.get(i);
            if(temp.getGID()==dd){
                methodResitory.deleteById(temp.getMeID());
            }
        }
    }

    @Override
    public void delgoodsonemethod(Integer goods, Integer mater) {
        List<Method> list = methodResitory.findAll();
        for(int i=0;i<list.size();i++){
            Method temp = list.get(i);
            if(temp.getGID().equals(goods) && temp.getMID().equals(mater)){
                methodResitory.deleteById(temp.getMeID());
            }
        }
    }
    @Override
    public JSONArray getmethodjson(Integer gid) {
        return null;
    }
=======
//=======
//>>>>>>> Stashed changes
>>>>>>> origin
}
