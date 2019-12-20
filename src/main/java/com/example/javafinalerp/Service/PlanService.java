package com.example.javafinalerp.Service;

import com.example.javafinalerp.Bean.ProducePlan;
import com.example.javafinalerp.tempclass.Planandname;

import java.util.List;

public interface PlanService {
    List<Planandname> getunplannamelist();
    void outMaterialsbyPlanid(Integer x);
    List<Integer> getMethodmygoods(Integer x);
    void addmethodbyjson(String s,Integer gid);
<<<<<<< Updated upstream
    void addplan(ProducePlan plan);
=======
>>>>>>> Stashed changes
}
