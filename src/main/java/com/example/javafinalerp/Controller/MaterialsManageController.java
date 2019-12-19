package com.example.javafinalerp.Controller;

import com.example.javafinalerp.Bean.*;
import com.example.javafinalerp.Service.BasicManageService;
import com.example.javafinalerp.Service.MHouseService;
import com.example.javafinalerp.Service.PlanService;
import com.example.javafinalerp.tempclass.Json1;
import com.example.javafinalerp.tempclass.Materialsandname;
import com.example.javafinalerp.tempclass.Planandname;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class MaterialsManageController {
    @Resource
    MHouseService mHouseService;
    @Resource
    BasicManageService basicManageService;

    @Resource
    PlanService planService;

    @Autowired
    MaterialsManageController materialsManageController;

    @RequestMapping("materials_in_stock")
    public String mis(Model model)
    {
        List<MHouseLog> lists =mHouseService.getinsertLog();
        List<MHouse> mhouse=mHouseService.getmhouse();
        List<Materials> materials = basicManageService.getmaterlist();
        model.addAttribute("materials",materials);
        model.addAttribute("mhouse",mhouse);
        model.addAttribute("lists",lists);
        return "materials_manage/materials_in_stock";
    }

    @RequestMapping("add_realmaterials")
    @ResponseBody
    public String amt(@RequestBody String x){
        mHouseService.addMaterialsbyjson(x);
        return "redirect:materials_in_stock";
    }

    @RequestMapping("materialsfindbyid")
    public String mfbid(Model model,@RequestParam("QID") Integer x){
        List<MHouseLog> lists=mHouseService.findinsertbyid(x);
        model.addAttribute("lists",lists);
        return "materials_manage/materials_in_stock";
    }

    @RequestMapping("materials_out_stock")
    public String mst(Model model)
    {
        List<Planandname> lists =planService.getunplannamelist();
        model.addAttribute("lists",lists);
        return "materials_manage/materials_out_stock";
    }

    @RequestMapping("materialsoutbyid")
    public String mobi(@RequestParam("QID") Integer x){
        System.out.println(1);
        planService.outMaterialsbyPlanid(x);
        return "redirect:materials_out_stock";
    }

    @RequestMapping("materialDestroy")
    public String md(Model model)
    {
        List<Materialsandname> lists=mHouseService.getoutdatedmaterials();
        model.addAttribute("lists",lists);
        return "materials_manage/materialDestroy";
    }

    @RequestMapping("Destroymaterial")
    public String dm(@RequestParam("QID") Integer x){
        mHouseService.Destroybymhsid(x);
        return "redirect:materialDestroy";
    }
}