package com.example.javafinalerp.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SaleManageController {

    @Autowired
    SaleManageController saleManageController;

    @RequestMapping("advance_sale")
    public String ads(){
        return "sale_manage/advance_sale";
    }

    @RequestMapping("now__sale")
    public String ns(){
        return "sale_manage/now__sale";
    }

    @RequestMapping("re_goods")
    public String rg(){
        return "sale_manage/re_goods";
    }
}
