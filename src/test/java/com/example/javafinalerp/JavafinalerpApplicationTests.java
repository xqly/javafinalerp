package com.example.javafinalerp;

import com.example.javafinalerp.Bean.User;
import com.example.javafinalerp.Service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class JavafinalerpApplicationTests {

    @Resource
    UserService userService;

    @Test
    void contextLoads() {
        User user;
        user = userService.loginCheck(12,"123qwe");
        if(user==null){

        }
    }

}
