package com.example.javafinalerp.Controller;

import com.example.javafinalerp.Bean.Goods;
import com.example.javafinalerp.Service.BasicManageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class SaleManageController {
    @Resource
    BasicManageService basicManageService;
    @Autowired
    SaleManageController saleManageController;

    @RequestMapping("advance_sale")
    public String ads(Model model){
        List<Goods> goods=basicManageService.getgoodslist();
        model.addAttribute("goods",goods);
        return "sale_manage/advance_sale";
    }

    @RequestMapping("now__sale")
    public String ns(Model model){
        List<Goods> goods=basicManageService.getgoodslist();
        model.addAttribute("goods",goods);
        return "sale_manage/now__sale";
    }

    @RequestMapping("re_goods")
    public String rg(Model model){
        List<Goods> goods=basicManageService.getgoodslist();
        model.addAttribute("goods",goods);
        return "sale_manage/re_goods";
    }
}
