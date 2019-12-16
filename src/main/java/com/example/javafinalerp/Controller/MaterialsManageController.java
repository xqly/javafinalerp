package com.example.javafinalerp.Controller;

import com.example.javafinalerp.Bean.MHStatus;
import com.example.javafinalerp.Bean.MHouseLog;
import com.example.javafinalerp.Bean.Materials;
import com.example.javafinalerp.Bean.ProducePlan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class MaterialsManageController {

    @Autowired
    MaterialsManageController materialsManageController;

    @RequestMapping("materials_in_stock")
    public String mis(Model model)
    {
        List<MHouseLog> lists =null;
        model.addAttribute("lists",lists);
        return "materials_manage/materials_in_stock";
    }

    @RequestMapping("add_realmaterials")
    public String amt(@RequestParam("materials_json") String x){
        return "redirect:materials_in_stock";
    }

    @RequestMapping("materialsfindbyid")
    public String mfbid(Model model,@RequestParam("QID") Integer x){
        List<MHouseLog> lists=null;
        model.addAttribute("lists",lists);
        return "materials_manage/materials_in_stock";
    }


    @RequestMapping("materials_out_stock")
    public String mst(Model model)
    {
        List<ProducePlan> lists =null;
        model.addAttribute("lists",lists);
        return "materials_manage/materials_out_stock";
    }

    @RequestMapping("materialsoutbyid")
    public String mobi(@RequestParam("QID") Integer x){
        return "redirect:materials_manage/materials_out_stock";
    }

    @RequestMapping("materialDestroy")
    public String md(Model model)
    {
        List<MHStatus> lists=null;
        model.addAttribute("lists",lists);
        return "materials_manage/materialDestroy";
    }

    @RequestMapping("Destroymaterial")
    public String dm(@RequestParam("QID") Integer x){
        return "redirect:materials_manage/materialDestroy";
    }

}
