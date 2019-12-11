package com.example.javafinalerp.Controller;


import com.example.javafinalerp.Bean.User;
import com.example.javafinalerp.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import java.util.Map;

@Controller
public class LoginController {

    @Autowired
    private LoginController loginController;

    @Resource
    UserService userService;

    @RequestMapping("/login")
    public String good(){
        return "login";
    }

    @PostMapping(value = "/loginIn")
    public String login(@RequestParam("username") Integer username , @RequestParam("password") String password ){
        User user = userService.loginCheck(username,password);
        if(user==null) return "error";
        else return "index";
    }
}
