package com.example.javafinalerp;

import com.example.javafinalerp.Bean.User;
import com.example.javafinalerp.Bean.UserInfo;
import com.example.javafinalerp.Service.UserInfoService;
import com.example.javafinalerp.Service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class JavafinalerpApplicationTests {

    @Resource
    UserService userService;

    @Resource
    UserInfoService userInfoService;

    @Test
    void contextLoads() {
//        userInfoService.getpass("1");
    }

}
