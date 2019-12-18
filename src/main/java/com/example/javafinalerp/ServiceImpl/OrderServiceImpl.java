package com.example.javafinalerp.ServiceImpl;

import com.example.javafinalerp.Bean.Order;
import com.example.javafinalerp.Resitory.OrderResitory;
import com.example.javafinalerp.Service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    OrderResitory orderResitory;

    @Override
    public List<Order> getorderlist() {
        return orderResitory.findlistbytype(0);
    }

    @Override
    public void addOrder() {
        //xqly
    }

    @Override
    public List<Order> getorderlistbyid(Integer x) {
        return orderResitory.findlistbyid(0,x);
    }

    @Override
    public List<Order> getorderlistbyclient(Integer x) {
        return orderResitory.findlistbyid(0,x);
    }

    @Override
    public List<Order> getpreorderlist() {
        return orderResitory.findlistbytype(1);
    }

    @Override
    public void addpreorder() {
        //xqly
    }

    @Override
    public List<Order> getpreorderlistbyid(Integer x) {
        return orderResitory.findlistbyid(1,x);
    }

    @Override
    public List<Order> getpreoderlistbyclient(Integer x) {
        return orderResitory.findlistbyclient(1,x);
    }
}
