package com.example.javafinalerp.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StockManageController {

    @Autowired
    StockManageController stockManageController;

    @RequestMapping("produce_in_stock")
    public String pis(){
        return "stock_manage/produce_in_stock";
    }

    @RequestMapping("product_out_stock")
    public String pos(){
        return "stock_manage/product_out_stock";
    }

    @RequestMapping("productDestroy")
    public String pd(){
        return "stock_manage/productDestroy";
    }

}
