package com.example.javafinalerp.ServiceImpl;

import com.example.javafinalerp.Bean.PayList;
import com.example.javafinalerp.Service.PayService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PayServiceImpl implements PayService {
    @Override
    public List<PayList> getlistbytype(Integer x, Integer y) {
        return null;
    }

    @Override
    public List<PayList> getlistbypid(Integer id, Integer x, Integer y) {
        return null;
    }

    @Override
    public List<PayList> getlistbyoid(Integer id, Integer x, Integer y) {
        return null;
    }

    @Override
    public List<PayList> getlistbyman(Integer man, Integer x, Integer y) {
        return null;
    }
}
