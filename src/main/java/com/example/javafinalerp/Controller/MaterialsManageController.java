package com.example.javafinalerp.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MaterialsManageController {

    @Autowired
    MaterialsManageController materialsManageController;

    @RequestMapping("materialDestroy")
    public String md(){
        return "materials_manage/materialDestroy";
    }

    @RequestMapping("materials_in_stock")
    public String mis(){
        return "materials_manage/materials_in_stock";
    }

    @RequestMapping("materials_out_stock")
    public String mst(){
        return "materials_manage/materials_out_stock";
    }

}
