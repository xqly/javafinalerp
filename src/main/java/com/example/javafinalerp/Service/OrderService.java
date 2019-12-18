package com.example.javafinalerp.Service;
import com.example.javafinalerp.Bean.Order;
import java.util.List;

public interface OrderService {
    List<Order> getorderlist();
    void addOrder(String s);
    List<Order> getorderlistbyid(Integer x);
    List<Order> getorderlistbyclient(Integer x);
    List<Order> getpreorderlist();
    void addpreorder();
    List<Order> getpreorderlistbyid(Integer x);
    List<Order> getpreoderlistbyclient(Integer x);
}
