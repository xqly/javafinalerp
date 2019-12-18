package com.example.javafinalerp.Controller;


import com.example.javafinalerp.Bean.Goods;
import com.example.javafinalerp.Bean.Materials;
import com.example.javafinalerp.Bean.ProducePlan;
import com.example.javafinalerp.Service.BasicManageService;
import com.example.javafinalerp.Service.PlanService;
import com.example.javafinalerp.tempclass.Planandname;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class ProductManageController {
    @Resource
    BasicManageService basicManageService;

    @Resource
    PlanService planService;

    @Autowired
    ProductManageController productManageController;

    @RequestMapping("burdenSheet")
    public String bud(Model model){
        List<Materials> materials = basicManageService.getmaterlist();
        List<Goods> goods=basicManageService.getgoodslist();
//        List<Planandname> lists = ;
        model.addAttribute("materials",materials);
        model.addAttribute("goods",goods);
//        model.addAttribute("lists",lists);
        return "product_manage/burdenSheet";
    }

    @RequestMapping("producePlan")
    public String pdp(Model model){
        List<Planandname> lists=planService.getunplannamelist();
        model.addAttribute("lists",lists);
        return "product_manage/producePlan";
    }

//    @RequestMapping("alterplan")
//    public String altplan(@ModelAttribute ProducePlan producePlan){
////        planService.
//    }

}
