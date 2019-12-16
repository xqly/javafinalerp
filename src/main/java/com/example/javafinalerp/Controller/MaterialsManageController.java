package com.example.javafinalerp.Controller;

import com.example.javafinalerp.Bean.MHouseLog;
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

    @RequestMapping("materialDestroy")
    public String md(){
        return "materials_manage/materialDestroy";
    }

    @RequestMapping("add_materials")
    public String amt(@RequestParam("materials_json") String x){
        return "redirect:materials_in_stock";
    }

    @RequestMapping("materials_in_stock")
    public String mis(Model model)
    {
        List<MHouseLog> lists =null;
        model.addAttribute("lists",lists);
        return "materials_manage/materials_in_stock";
    }

    @RequestMapping("materials_out_stock")
    public String mst(){
        return "materials_manage/materials_out_stock";
    }

}
