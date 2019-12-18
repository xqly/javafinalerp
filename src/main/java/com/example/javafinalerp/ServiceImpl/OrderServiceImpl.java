package com.example.javafinalerp.ServiceImpl;

import com.example.javafinalerp.Bean.Ordergoods;
import com.example.javafinalerp.Resitory.OrdergoodsResitory;
import com.example.javafinalerp.Service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    OrdergoodsResitory ordergoodsResitory;

    @Override
    public List<Ordergoods> getorderlist() {
        return ordergoodsResitory.findlistbytype(0);
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
}
