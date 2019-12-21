package com.example.javafinalerp.Controller;


import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.example.javafinalerp.Bean.*;
import com.example.javafinalerp.Service.BasicManageService;
import com.example.javafinalerp.Service.PlanService;
import com.example.javafinalerp.tempclass.OWname;
import com.example.javafinalerp.tempclass.Planandname;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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
    public String bud5(Model model){
        List<Materials> materials = basicManageService.getmaterlist();
        List<Goods> goods=basicManageService.getunmethodgoods();
     //   List<Planandname> lists = planService.getunplannamelist();
        List<Goods> methodgoods = planService.getmethodgoods();//有配料的商品
        model.addAttribute("materials",materials);
        model.addAttribute("goods",goods);
        model.addAttribute("methodgoods",methodgoods);
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
    public String saver(@RequestParam("goods0") Integer goods,@RequestParam("num0") Integer num,@RequestParam("time0") String time,@RequestParam("chejian0") Integer chejian, HttpSession session){
        ProducePlan producePlan = new ProducePlan();
//        System.out.println(chejian);
        producePlan.setGnum(num);
        producePlan.setPstate(1);
        producePlan.setPtime(time);
        producePlan.setGoodid(goods);
        producePlan.setPworkshop(chejian);
        planService.addplan(producePlan);
        return "redirect:producePlan";
    }


    @RequestMapping(value = "/alterplan" ,method = RequestMethod.POST)
    public String altplan10(@ModelAttribute  ProducePlan producePlan , HttpSession session){
        producePlan.setPstate(1);
        planService.addplan(producePlan);
        return "redirect:producePlan";
    }

    @RequestMapping(value = "query_by_kid",method = RequestMethod.POST)
    public String qbi(@RequestParam("KID") Integer id , Model model){
       // List<Planandname> lists=planService.getunplannamelistbyid(id);
     //   model.addAttribute("lists",lists);
        return "product_manage/producePlan";
    }

    @RequestMapping("add_burdenSheet")
    @ResponseBody
    public String amtm(@RequestBody String x){
        planService.addmethodbyjson(x);
        return "redirect:burdenSheet";
    }


    @RequestMapping(value="/deluser1",method = RequestMethod.POST)    //删除配料单
    public String delu(@RequestParam("uid") Integer x){

       planService.delgoodsmethod(x);
        return "redirect:burdenSheet";
    }


    @RequestMapping("/yourUrl1/{yourDataName1}")
    @ResponseBody
    public JSONArray yourUrl1(@PathVariable("yourDataName1") Integer yourData1, Model model) {
         System.out.println(yourData1);
        return planService.getmethodjson(yourData1);
    }
}
