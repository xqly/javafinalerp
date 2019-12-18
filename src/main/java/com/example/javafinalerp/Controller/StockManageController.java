package com.example.javafinalerp.Controller;

import com.example.javafinalerp.Bean.Ordergoods;
import com.example.javafinalerp.Bean.WHouseLog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class StockManageController {

    @Autowired
    StockManageController stockManageController;

    @RequestMapping("produce_in_stock")
    public String aa(Model model){
        List<WHouseLog> lists = null;
        model.addAttribute("lists",lists);
        return "stock_manage/produce_in_stock";
    }


    @RequestMapping("product_out_stock")
    public String cx(Model model){
        List<Ordergoods> lists=null;
        model.addAttribute("lists",lists);
        return "stock_manage/product_out_stock";
    }

    @RequestMapping("productDestroy")
    public String xh(Model model){
        List<WHouseLog> lists=null;
        model.addAttribute("lists",lists);
        return "stock_manage/productDestroy";
    }

    @RequestMapping(value = "queryGoods_by_name",method = RequestMethod.POST)
    public String crk(@RequestParam("GIID") String name,  Model model){
        List<WHouseLog> lists = null;
        model.addAttribute("lists",lists);
        return "stock_manage/produce_in_stock";
    }


}
