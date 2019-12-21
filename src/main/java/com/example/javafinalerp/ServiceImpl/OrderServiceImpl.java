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
import com.example.javafinalerp.tempfunc.IDfunc;
import com.example.javafinalerp.tempfunc.Myfunc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
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

    @Resource
    Myfunc myfunc;

    @Resource
    IDfunc iDfunc;

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
    public void addOrder(String x) {
        List<Goods> list = goodsResitory.findAll();
        Map<String,Integer> m1= new HashMap<>();
        for(int i=0;i<list.size();i++){
            m1.put(list.get(i).getGName(),list.get(i).getG_ID());
        }
        JSONObject jsonObject = JSONObject.parseObject(x);
        Integer cust = jsonObject.getInteger("customer");
        Double discount = jsonObject.getDouble("discount");
        String bz = jsonObject.getString("beizhu");
        JSONArray jsonArray = jsonObject.getJSONArray("peiliao");
        Ordergoods order = new Ordergoods();
        if(discount!=null)
            order.setDiscount(discount);
        else order.setDiscount(1.0);
        order.setCID(cust);
        order.setOTime(myfunc.getDate());
        order.setOMID(1);//xqly
        order.setRemark(bz);
        order.setOState(0);
        order.setType(0);
        ordergoodsResitory.save(order);
        for(int i=0;i<jsonArray.size();i++){
            JSONObject pl = jsonArray.getJSONObject(i);
            String name = pl.getString("mname");
            Integer num = pl.getInteger("mnum");
            Integer gid = m1.get(name);
            OW ow = new OW();
            ow.setGID(gid);
            ow.setNum(num);
            ow.setState(1);
            ow.setTnum(0);
            ow.setOID(iDfunc.ordergoods());
            owResitory.save(ow);
        }
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
    public void addpreorder(String x) {
        System.out.println(x);
        List<Goods> list = goodsResitory.findAll();
        Map<String,Integer> m1= new HashMap<>();
        for(int i=0;i<list.size();i++){
            m1.put(list.get(i).getGName(),list.get(i).getG_ID());
        }
        JSONObject jsonObject = JSONObject.parseObject(x);
        Integer cust = jsonObject.getInteger("customer");
        Double discount = jsonObject.getDouble("discount");
        String tihuo = jsonObject.getString("tihuo_time");
        String bz = jsonObject.getString("beizhu");
        JSONArray pl = jsonObject.getJSONArray("peiliao");
        Ordergoods order = new Ordergoods();
        if(discount!=null)
            order.setDiscount(discount);
        else order.setDiscount(1.0);
        order.setCID(cust);
        order.setOTime(myfunc.getDate());
        order.setOLTime(tihuo);
        order.setOMID(1);//xqly
        order.setRemark(bz);
        order.setOState(0);
        order.setType(1);
        ordergoodsResitory.save(order);
        for(int i=0;i<pl.size();i++){
            JSONObject ob = pl.getJSONObject(i);
            String mname = ob.getString("mname");
            Integer mnum = ob.getInteger("mnum");
            Integer gid = m1.get(mname);
            OW ow = new OW();
            ow.setGID(gid);
            ow.setNum(mnum);
            ow.setState(1);
            ow.setTnum(0);
            ow.setOID(iDfunc.ordergoods());
            owResitory.save(ow);
        }
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

    @Override
    public void tuiorder(String x) {
        List<Goods> list = goodsResitory.findAll();
        Map<String,Integer> m1= new HashMap<>();
        for(int i=0;i<list.size();i++){
            m1.put(list.get(i).getGName(),list.get(i).getG_ID());
        }
        JSONObject jsonObject = JSONObject.parseObject(x);
        Integer oid = jsonObject.getInteger("dingdan");
        JSONArray pl = jsonObject.getJSONArray("peiliao");
        for(int i=0;i<pl.size();i++){
            JSONObject ob = pl.getJSONObject(i);
            String name = ob.getString("mname");
            Integer num = ob.getInteger("mnum");
            Integer gid = m1.get(name);
            OW ow = owResitory.findbyoidandgid(oid,gid);
            ow.setState(2);
            ow.setTnum(ow.getTnum()+num);
            if(ow.getTnum().intValue()>ow.getNum().intValue()){
                ow.setTnum(ow.getNum());
            }
            owResitory.save(ow);
        }
    }
}
