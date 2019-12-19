package com.example.javafinalerp;

import com.example.javafinalerp.Service.MHouseService;
import com.example.javafinalerp.Service.PlanService;
import com.example.javafinalerp.Service.UserInfoService;
import com.example.javafinalerp.Service.UserService;
import com.example.javafinalerp.tempclass.Materialsandname;
import com.example.javafinalerp.tempfunc.Materfunc;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;

@SpringBootTest
class JavafinalerpApplicationTests {

    @Resource
    UserService userService;

    @Resource
    UserInfoService userInfoService;

    @Resource
    MHouseService mHouseService;

    @Resource
    PlanService planService;

    @Resource
    Materfunc materfunc;

    @Test
    void contextLoads() {
        mHouseService.addMaterialsbyjson("[{\"mname\":\"竹子\",\"MHID\":\"1\",\"MHTime\":\"0001-01-01\",\"MHNum\":\"1\"}]");
    }

}
