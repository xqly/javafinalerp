package com.example.javafinalerp.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProductManageController {

    @Autowired
    ProductManageController productManageController;

    @RequestMapping("burdenSheet")
    public String bud(){
        return "product_manage/burdenSheet";
    }

    @RequestMapping("produceManage")
    public String pdm(){
        return "product_manage/produceManage";
    }

    @RequestMapping("producePlan")
    public String pdp(){
        return "product_manage/producePlan";
    }

}
