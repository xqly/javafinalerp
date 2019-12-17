package com.example.javafinalerp.Service;

import com.example.javafinalerp.tempclass.Planandname;

import java.util.List;

public interface PlanService {
    List<Planandname> getunplannamelist();
    void outMaterialsbyPlanid(Integer x);
}
