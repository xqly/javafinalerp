package com.example.javafinalerp.ServiceImpl;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.example.javafinalerp.Bean.Goods;
import com.example.javafinalerp.Bean.OW;
import com.example.javafinalerp.Bean.Ordergoods;
import com.example.javafinalerp.Resitory.GoodsResitory;
import com.example.javafinalerp.Resitory.OWResitory;
import com.example.javafinalerp.Resitory.OrdergoodsResitory;
import com.example.javafinalerp.Service.OrderService;
import com.example.javafinalerp.tempclass.OWname;
import com.example.javafinalerp.tempclass.Orderandname;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    OrdergoodsResitory ordergoodsResitory;

    @Autowired
    OWResitory owResitory;

    @Autowired
    GoodsResitory goodsResitory;

    @Override
    public List<Orderandname> getorderlist() {
        List<Orderandname> lists = new ArrayList<>();
        List<Ordergoods> gl= ordergoodsResitory.findlistbytype(0);
        for(int i=0;i<gl.size();i++){
            Orderandname temp = new Orderandname(gl.get(i));
            lists.add(temp);
        }
        return lists;
    }

    @Override
    public void addOrder() {
        //xqly
    }

    @Override
    public List<Ordergoods> getorderlistbyid(Integer x) {
        return ordergoodsResitory.findlistbyid(0,x);
    }

    @Override
    public List<Ordergoods> getorderlistbyclient(Integer x) {
        return ordergoodsResitory.findlistbyid(0,x);
    }

    @Override
    public List<Orderandname> getpreorderlist() {

        List<Orderandname> lists = new ArrayList<>();
        List<Ordergoods> gl= ordergoodsResitory.findlistbytype(1);
        for(int i=0;i<gl.size();i++){
            Orderandname temp = new Orderandname(gl.get(i));
            lists.add(temp);
        }
        return lists;
    }

    @Override
    public void addpreorder() {
        //xqly
    }

    @Override
    public List<Ordergoods> getpreorderlistbyid(Integer x) {
        return ordergoodsResitory.findlistbyid(1,x);
    }

    @Override
    public List<Ordergoods> getpreoderlistbyclient(Integer x) {
        return ordergoodsResitory.findlistbyclient(1,x);
    }

    @Override
    public List<OWname> getlistbyoid(Integer x) {
        System.out.println(x);
        List<OW> list = owResitory.findlistbyoid(x);
        List<OWname> lists = new ArrayList<>();
        for(int i=0;i<list.size();i++){
            OWname temp = new OWname(list.get(i));
            lists.add(temp);
        }
        return lists;
    }

    @Override
    public JSONArray getordergoodsjson(Integer oid) {
        List<OW> lists = owResitory.findlistbyoid(oid);
        List<Ordergoods> l2 = ordergoodsResitory.findlistbyid(0,oid);
        List<Goods> gl = goodsResitory.findAll();
        Map<Integer,String> m1 = new HashMap<>();
        Map<Integer,Double> m2 = new HashMap<>();
        for(int i=0;i<gl.size();i++){
            m1.put(gl.get(i).getG_ID(),gl.get(i).getGName());
            m2.put(gl.get(i).getG_ID(),gl.get(i).getMPrice());
        }
        Ordergoods ordergoods;
        for(int i=0;i<l2.size();i++){
            ordergoods = l2.get(i);
        }
        JSONArray jsonArray = new JSONArray();
        for(int i=0;i<lists.size();i++){
            OW ow = lists.get(i);
            JSONObject jsonObject = new JSONObject();
            jsonObject.put("name",m1.get(lists.get(i).getGID()));
            if(ow.getState()==2){
                jsonObject.put("numm",lists.get(i).getNum()-ow.getTnum());
                jsonObject.put("price2",m2.get(ow.getGID())*(lists.get(i).getNum()-ow.getTnum()));
            }
            else{
                jsonObject.put("numm",ow.getNum());
                jsonObject.put("price2",m2.get(ow.getGID())*ow.getNum());
            }
            jsonObject.put("price1",m2.get(ow.getGID()));
            jsonArray.add(jsonObject);
        }
        return jsonArray;
    }

    @Override
    public List<Ordergoods> getorderlistsbystate(Integer x) {
        return ordergoodsResitory.findlistsbytypeandstate(0,x);
    }
}
