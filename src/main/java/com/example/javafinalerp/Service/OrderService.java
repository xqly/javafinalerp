package com.example.javafinalerp.Service;
import com.example.javafinalerp.Bean.Ordergoods;
import com.example.javafinalerp.tempclass.OWname;
import com.example.javafinalerp.tempclass.Orderandname;

import java.util.List;

public interface OrderService {
    List<Orderandname> getorderlist();
    void addOrder();
    List<Ordergoods> getorderlistbyid(Integer x);
    List<Ordergoods> getorderlistbyclient(Integer x);
    List<Ordergoods> getpreorderlist();
    void addpreorder();
    List<Ordergoods> getpreorderlistbyid(Integer x);
    List<Ordergoods> getpreoderlistbyclient(Integer x);
    List<OWname> getlistbyoid(Integer x);
}
