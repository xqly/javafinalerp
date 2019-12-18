package com.example.javafinalerp.Controller;

import com.example.javafinalerp.Bean.Goods;
import com.example.javafinalerp.Bean.Order;
import com.example.javafinalerp.Bean.WHouse;
import com.example.javafinalerp.Bean.WHouseLog;
import com.example.javafinalerp.Service.BasicManageService;
import com.example.javafinalerp.Service.MHouseService;
import com.example.javafinalerp.Service.OrderService;
import com.example.javafinalerp.Service.WHouseLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class StockManageController {

    @Autowired
    StockManageController stockManageController;

    @Resource
    WHouseLogService wHouseLogService;


    @Resource
    OrderService orderService;

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

    @RequestMapping("produce_in_stock")
    public String aa(Model model){
        List<WHouseLog> lists = wHouseLogService.getWHLList();
        model.addAttribute("lists",lists);
        return "stock_manage/produce_in_stock";
    }


    @RequestMapping("product_out_stock")
    public String cx(Model model){
        List<Order> lists=orderService.getWHLList();
        model.addAttribute("lists",lists);
        return "stock_manage/product_out_stock";
    }

    @RequestMapping("productDestroy")
    public String xh(Model model){
        List<WHouseLog> lists=wHouseLogService.getGQLList();
        model.addAttribute("lists",lists);
        return "stock_manage/productDestroy";
    }

    @RequestMapping(value = "query_by_name",method = RequestMethod.POST)
    public String crk(@RequestParam("GIID") String name,  Model model){
        List<WHouseLog> lists = wHouseLogService.getListByID(name);
        model.addAttribute("lists",lists);
        return "stock_manage/produce_in_stock";
    }


}
