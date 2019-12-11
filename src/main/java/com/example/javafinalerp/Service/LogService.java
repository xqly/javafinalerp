package com.example.javafinalerp.Service;

import com.example.javafinalerp.Bean.MHouseLog;
import com.example.javafinalerp.Bean.WHouseLog;

import java.util.List;

public interface LogService {
    List<WHouseLog> getWHLList();
    List<MHouseLog> getMHLList();
    List<WHouseLog> getWHLListByHID(Integer x);
    List<MHouseLog> getMHLListByHID(Integer x);
    List<MHouseLog> getMHLListByID(Integer x);
    List<WHouseLog> getWHLListByID(Integer x);
}
