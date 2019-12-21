package com.example.javafinalerp.Service;

import com.example.javafinalerp.Bean.MHouseLog;
import com.example.javafinalerp.Bean.WHouseLog;
import com.example.javafinalerp.tempclass.MaterialLogandname;
import com.example.javafinalerp.tempclass.Mhlandname;

import java.util.List;

public interface LogService {
    List<WHouseLog> getWHLList();
    List<Mhlandname> getMHLListandname();
    List<WHouseLog> getWHLListByHID(Integer x);
    List<MaterialLogandname> getMHLListByHID(Integer x);
    List<MaterialLogandname> getMHLListByID(Integer x);
    List<WHouseLog> getWHLListByID(Integer x);
}
