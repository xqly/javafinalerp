package com.example.javafinalerp.ServiceImpl;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.example.javafinalerp.Bean.Goods;
import com.example.javafinalerp.Bean.MHouse;
import com.example.javafinalerp.Bean.Materials;
import com.example.javafinalerp.Bean.WorkShop;
import com.example.javafinalerp.Resitory.GoodsResitory;
import com.example.javafinalerp.Resitory.MHouseResitory;
import com.example.javafinalerp.Resitory.MaterialsResitory;
import com.example.javafinalerp.Resitory.WorkShopResitory;
import com.example.javafinalerp.Service.JsonService;
import com.example.javafinalerp.Service.MHouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JsonServiceImpl implements JsonService {

    @Autowired
    MaterialsResitory materialsResitory;

    @Autowired
    GoodsResitory goodsResitory;

    @Autowired
    MHouseResitory mHouseResitory;

    @Autowired
    WorkShopResitory workShopResitory;

    @Override
    public JSONArray Material() {
        List<Materials> list = materialsResitory.findAll();
        JSONArray jsonArray = new JSONArray();
        for(int i=0;i<list.size();i++){
            JSONObject temp = new JSONObject();
            temp.put("name",list.get(i).getMName());
            temp.put("price",list.get(i).getMPrice());
            temp.put("id",list.get(i).getMID());
            jsonArray.add(temp);
        }
        return jsonArray;
    }

    @Override
    public JSONArray MHouse() {
        List<MHouse> list = mHouseResitory.findAll();
        JSONArray jsonArray = new JSONArray();
        for(int i=0;i<list.size();i++){
            JSONObject temp = new JSONObject();
            temp.put("name",list.get(i).getMHName());
            temp.put("id",list.get(i).getMHID());
            jsonArray.add(temp);
        }
        return jsonArray;
    }


    @Override
    public JSONArray Goods() {
        List<Goods> list = goodsResitory.findAll();
        JSONArray jsonArray = new JSONArray();
        for(int i=0;i<list.size();i++){
            JSONObject jsonObject = new JSONObject();
            jsonObject.put("name",list.get(i).getGName());
            jsonObject.put("id",list.get(i).getG_ID());
            jsonArray.add(jsonObject);
        }
        return jsonArray;
    }

    @Override
    public JSONArray Workshop() {
        List<WorkShop> list = workShopResitory.findAll();
        JSONArray jsonArray = new JSONArray();
        for(int i=0;i<list.size();i++){
            JSONObject jsonObject = new JSONObject();
            jsonObject.put("name",list.get(i).getWSName());
            jsonObject.put("id",list.get(i).getWSID());
        }
        return jsonArray;
    }
}
