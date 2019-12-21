package com.example.javafinalerp;

import com.example.javafinalerp.Service.*;
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
    WHouseService wHouseService;

    @Resource
    PlanService planService;

    @Resource
    Materfunc materfunc;

    @Resource
    OrderService orderService;

    @Test
    void contextLoads() {
        orderService.addOrder("{\"customer\":\"123\",\"discount\":\"\",\"beizhu\":\"yao\",\"peiliao\":[{\"mname\":\"料酒\",\"mnum\":\"10\"}]}");
    }

}
