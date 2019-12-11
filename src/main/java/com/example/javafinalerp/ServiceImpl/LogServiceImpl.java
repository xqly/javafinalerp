package com.example.javafinalerp.ServiceImpl;

import com.example.javafinalerp.Bean.MHouseLog;
import com.example.javafinalerp.Bean.WHouseLog;
import com.example.javafinalerp.Resitory.MHouseLogResitory;
import com.example.javafinalerp.Resitory.WHouseLogResitory;
import com.example.javafinalerp.Service.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LogServiceImpl implements LogService {

    @Autowired
    MHouseLogResitory mHouseLogResitory;

    @Autowired
    WHouseLogResitory wHouseLogResitory;

    @Override
    public List<WHouseLog> getWHLList() {
        return wHouseLogResitory.findAll();
    }

    @Override
    public List<MHouseLog> getMHLList() {
        return mHouseLogResitory.findAll();
    }

    @Override
    public List<WHouseLog> getWHLListByHID(Integer x) {
        return wHouseLogResitory.getlistByWID(x);
    }

    @Override
    public List<MHouseLog> getMHLListByHID(Integer x) {
        return mHouseLogResitory.getlistByMHID(x);
    }

    @Override
    public List<MHouseLog> getMHLListByID(Integer x) {
        return mHouseLogResitory.getlistByID(x);
    }

    @Override
    public List<WHouseLog> getWHLListByID(Integer x) {
        return wHouseLogResitory.getlistByID(x);
    }
}
