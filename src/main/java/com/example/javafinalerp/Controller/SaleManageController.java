package com.example.javafinalerp.Controller;

import com.example.javafinalerp.Bean.Goods;
import com.example.javafinalerp.Bean.Ordergoods;
import com.example.javafinalerp.Bean.OW;
import com.example.javafinalerp.Bean.WHouseLog;
import com.example.javafinalerp.Service.BasicManageService;
import com.example.javafinalerp.Service.OrderService;
import com.example.javafinalerp.Service.PlanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import com.example.javafinalerp.tempclass.Orderandname;
import com.example.javafinalerp.tempclass.OWname;
import javax.annotation.Resource;
import java.util.List;

@Controller
public class SaleManageController {
    @Resource
    BasicManageService basicManageService;
    @Resource
    OrderService orderService;
    @Resource
    Orderandname orderandname;
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
        List<Orderandname> order=null;
        List<Goods> goods=basicManageService.getgoodslist();
        model.addAttribute("order",order);
        model.addAttribute("goods",goods);
        return "sale_manage/now__sale";
    }

    @RequestMapping("tiaozhuan")
    public String ns4(){
        return "sale_manage/children";
    }

    @RequestMapping(value = "select_by_oid",method = RequestMethod.POST)
    public String crk2(@RequestParam("uid") Integer id,  Model model){
        List<OWname> goods1 = null;
        model.addAttribute("goods1",goods1);
        return "sale_manage/children";
    }


    @RequestMapping(value = "query_by_oid",method = RequestMethod.POST)
    public String crk(@RequestParam("OID") Integer id,  Model model){
        List<Ordergoods> order = orderService.getorderlistbyid(id);
        model.addAttribute("order",order);
        return "sale_manage/now__sale";
    }

    @RequestMapping(value = "query_by_cid",method = RequestMethod.POST)
    public String crk1(@RequestParam("CID") Integer id,  Model model){
        List<Ordergoods> order = orderService.getorderlistbyid(id);
        model.addAttribute("order",order);
        return "sale_manage/now__sale";
    }

    @RequestMapping("add_realorders")
    public String amt(@RequestParam("orders_json") String x){
        orderService.addOrder();
        //xqly
        return "redirect:now__sale";
    }

    @RequestMapping("re_goods")
    public String rg(Model model){
        List<Goods> goods=basicManageService.getgoodslist();
        model.addAttribute("goods",goods);
        return "sale_manage/re_goods";
    }
}
