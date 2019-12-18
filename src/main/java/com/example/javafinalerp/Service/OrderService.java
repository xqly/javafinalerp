package com.example.javafinalerp.Service;
import com.example.javafinalerp.Bean.Order;
import java.util.List;

public interface OrderService {
    List<Order> getorderlist();
    void addOrder();
    List<Order> getorderlistbyid();
    List<Order> getorderlistbyclient();
    List<Order> getpreorderlist();
    void addpreorder();
    List<Order> getpreorderlistbyid();
    List<Order> getpreoderlistbyclient();
}
