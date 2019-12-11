package com.example.javafinalerp.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

    @Autowired
    MainController mainController;

    @RequestMapping("index")
    public String inde(){
        return "index";
    }
}
