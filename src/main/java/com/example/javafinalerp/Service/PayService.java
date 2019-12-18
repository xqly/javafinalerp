package com.example.javafinalerp.Service;


import com.example.javafinalerp.Bean.PayList;

import java.util.List;

public interface PayService {
    List<PayList> getlistbytype(Integer x,Integer y);
    List<PayList> getlistbypid(Integer id,Integer x,Integer y);
    List<PayList> getlistbyoid(Integer id,Integer x,Integer y);
    List<PayList> getlistbyman(Integer man,Integer x,Integer y);
}
