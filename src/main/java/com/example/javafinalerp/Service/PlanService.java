package com.example.javafinalerp.Service;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.example.javafinalerp.Bean.Goods;
import com.example.javafinalerp.Bean.ProducePlan;
import com.example.javafinalerp.tempclass.Planandname;

import java.util.List;

public interface PlanService {
    List<Planandname> getunplannamelist();
    void outMaterialsbyPlanid(Integer x);
    void addmethodbyjson(String s);
    void addplan(ProducePlan plan);
    void delgoodsmethod(Integer dd);
    void delgoodsonemethod(Integer goods,Integer mater);
    JSONArray getmethodjson(Integer gid);
    List<Goods> getmethodgoods();
}
