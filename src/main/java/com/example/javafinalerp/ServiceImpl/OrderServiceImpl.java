package com.example.javafinalerp.ServiceImpl;

import com.example.javafinalerp.Bean.OW;
import com.example.javafinalerp.Bean.Ordergoods;
import com.example.javafinalerp.Resitory.OWResitory;
import com.example.javafinalerp.Resitory.OrdergoodsResitory;
import com.example.javafinalerp.Service.OrderService;
import com.example.javafinalerp.tempclass.OWname;
import com.example.javafinalerp.tempclass.Orderandname;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    OrdergoodsResitory ordergoodsResitory;

    @Autowired
    OWResitory owResitory;

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
    public List<Ordergoods> getpreorderlist() {
        return ordergoodsResitory.findlistbytype(1);
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
}
