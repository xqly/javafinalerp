package com.example.javafinalerp.ServiceImpl;

import com.example.javafinalerp.Bean.MHouse;
import com.example.javafinalerp.Bean.WHouse;
import com.example.javafinalerp.Resitory.MHouseResitory;
import com.example.javafinalerp.Service.MHouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MHouseServiceImpl implements MHouseService {
    @Autowired
    private MHouseResitory mHouseResitroy;

    @Override
    public  List<MHouse> getmhouse()
    {
        return mHouseResitroy.findAll();
    }
}
