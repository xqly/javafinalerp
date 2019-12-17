package com.example.javafinalerp.Controller;


import com.example.javafinalerp.Bean.Goods;
import com.example.javafinalerp.Bean.Materials;
import com.example.javafinalerp.Bean.ProducePlan;
import com.example.javafinalerp.Service.BasicManageService;
import com.example.javafinalerp.tempclass.Materialsandname;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class ProductManageController {
    @Resource
    BasicManageService basicManageService;

    @Autowired
    ProductManageController productManageController;

    @RequestMapping("burdenSheet")
    public String bud(Model model){
        List<Materials> materials = basicManageService.getmaterlist();
        List<Goods> goods=basicManageService.getgoodslist();
        model.addAttribute("materials",materials);
        model.addAttribute("goods",goods);
        return "product_manage/burdenSheet";
    }

    @RequestMapping("produceManage")
    public String pdm(){
        return "product_manage/produceManage";
    }

    @RequestMapping("producePlan")
    public String pdp(Model model){
        List<ProducePlan> lists=null;
        model.addAttribute("lists",lists);
        return "product_manage/producePlan";
    }

}
