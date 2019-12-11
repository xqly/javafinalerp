package com.example.javafinalerp.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ActionManageController {

    @Autowired
    ActionManageController actionManageController;

    @RequestMapping("basic-table")
    public String bt(){
        return "action_manage/basic-table";
    }

    @RequestMapping("blank")
    public String bk(){
        return "action_manage/blank";
    }

    @RequestMapping("fontawesome")
    public String fa(){
        return "action_manage/fontawesome";
    }

    @RequestMapping("forget")
    public String fg(){
        return "action_manage/forget";
    }

    @RequestMapping("profile")
    public String por(){
        return "action_manage/profile";
    }

    @RequestMapping("pswChange")
    public String psw(){
        return "action_manage/pswChange";
    }

    @RequestMapping("sign-up")
    public String su(){
        return "action_manage/sign-up";
    }
}
