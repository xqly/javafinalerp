package com.example.javafinalerp.Service;

import com.example.javafinalerp.Bean.MHouse;
import com.example.javafinalerp.Bean.MHouseLog;
import com.example.javafinalerp.tempclass.Materialsandname;

import java.util.List;
public interface MHouseService {
    List<MHouse> getmhouse();
    List<MHouseLog> getinsertLog();
    List<MHouseLog> findinsertbyid(Integer x);
    void addMaterialsbyjson(String s);
    List<Materialsandname> getoutdatedmaterials();
    void Destroybymhsid(Integer x);
}
