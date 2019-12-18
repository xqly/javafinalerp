package com.example.javafinalerp.ServiceImpl;

import com.example.javafinalerp.Bean.PayList;
import com.example.javafinalerp.Resitory.PayListResitory;
import com.example.javafinalerp.Service.PayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PayServiceImpl implements PayService {

    @Autowired
    PayListResitory payListResitory;

    @Override
    public List<PayList> getlistbytype(Integer x, Integer y) {
        return payListResitory.getlistbytype(x,y);
    }

    @Override
    public List<PayList> getlistbypid(Integer id, Integer x, Integer y) {
        return payListResitory.getlistbypid(x,y,id);
    }

    @Override
    public List<PayList> getlistbyoid(Integer id, Integer x, Integer y) {
        return payListResitory.getlistbyoid(x,y,id);
    }

    @Override
    public List<PayList> getlistbyman(Integer man, Integer x, Integer y) {
        return payListResitory.getlistbytypeman(x,y,man);
    }
}
