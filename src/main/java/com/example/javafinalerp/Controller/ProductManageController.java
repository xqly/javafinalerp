package com.example.javafinalerp.Controller;


import com.example.javafinalerp.Bean.*;
import com.example.javafinalerp.Service.BasicManageService;
import com.example.javafinalerp.Service.PlanService;
import com.example.javafinalerp.tempclass.Planandname;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
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
        List<Goods> goods=basicManageService.getunmethodgoods();
        List<Planandname> lists = planService.getunplannamelist();
        model.addAttribute("materials",materials);
        model.addAttribute("goods",goods);
        model.addAttribute("lists",lists);
        return "product_manage/burdenSheet";
    }

    @RequestMapping("producePlan")
    public String pdp(Model model){
        List<Goods> goods=basicManageService.getunmethodgoods();
        model.addAttribute("goods",goods);
        List<WorkShop>workShops=basicManageService.getworkslist();
        model.addAttribute("workShops",workShops);
        List<Planandname> lists=planService.getunplannamelist();
        model.addAttribute("lists",lists);
        return "product_manage/producePlan";
    }

    @RequestMapping(value = "/saveplan" ,method = RequestMethod.POST)
    public String save(@ModelAttribute  ProducePlan producePlan , HttpSession session){


         // planService.savePlan(producePlan);  根据service
        return "redirect:producePlan";
    }


    @RequestMapping(value = "/alterplan" ,method = RequestMethod.POST)
    public String altplan(@ModelAttribute  ProducePlan producePlan , HttpSession session){


        // planService.savePlan(producePlan);  根据service
        return "redirect:producePlan";
    }


}
