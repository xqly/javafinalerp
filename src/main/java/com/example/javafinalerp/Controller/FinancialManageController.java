package com.example.javafinalerp.Controller;


import com.example.javafinalerp.Bean.MHouse;
import com.example.javafinalerp.Bean.Ordergoods;
import com.example.javafinalerp.Bean.PayList;
import com.example.javafinalerp.Bean.User;
import com.example.javafinalerp.Service.OrderService;
import com.example.javafinalerp.Service.PayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class FinancialManageController {

    @Resource
    PayService payService;

    @Resource
    OrderService orderService;


    @Autowired
    FinancialManageController financialManageController;

    @RequestMapping("account_in")
    public String acin(Model model){
        List<PayList> payLists = payService.getlistbytype(1,1);
        model.addAttribute("lists",payLists);
        return "financial_manage/account_in";
    }


    @RequestMapping(value="mhqbydid" ,method = RequestMethod.POST)
    public String mhqbyid(@RequestParam("QDID") Integer x, Model model){
        List<PayList> payLists = payService.getlistbytype(1,1);
        model.addAttribute("lists",payLists);
        return "financial_manage/account_in";
    }

    @RequestMapping(value="mhqbysid" ,method = RequestMethod.POST)
    public String mhqbysid(@RequestParam("QSID") Integer x, Model model){
        List<PayList> payLists = payService.getlistbytype(1,1);
        model.addAttribute("lists",payLists);
        return "financial_manage/account_in";
    }


    @RequestMapping(value="mhqbysman" ,method = RequestMethod.POST)
    public String mhqbysman(@RequestParam("QMan") Integer x, Model model){
        List<PayList> payLists = payService.getlistbytype(1,1);
        model.addAttribute("lists",payLists);
        return "financial_manage/account_in";
    }


    @RequestMapping("advance_money_in")
    public String admi(Model model)
    {
        List<PayList> payLists = payService.getlistbytype(2,1);
        model.addAttribute("lists",payLists);
        return "financial_manage/advance_money_in";
    }


    @RequestMapping(value="mhqbysman1" ,method = RequestMethod.POST)
    public String mhqbysman1(@RequestParam("QMan") Integer x, Model model){
        List<PayList> payLists = payService.getlistbytype(2,1);
        model.addAttribute("lists",payLists);
        return "financial_manage/advance_money_in";
    }

    @RequestMapping(value="mhqbysid1" ,method = RequestMethod.POST)
    public String mhqbysid1(@RequestParam("QSID") Integer x, Model model){
        List<PayList> payLists = payService.getlistbytype(2,1);
        model.addAttribute("lists",payLists);
        return "financial_manage/advance_money_in";
    }

    @RequestMapping(value="mhqbysdid1" ,method = RequestMethod.POST)
    public String mhqbysdid1(@RequestParam("QDID") Integer x, Model model){
        List<PayList> payLists = payService.getlistbytype(2,1);
        model.addAttribute("lists",payLists);
        return "financial_manage/advance_money_in";
    }


    @RequestMapping("money_in")
    public String Mi(){
        return "financial_manage/money_in";
    }
    @RequestMapping("money_out")
    public String Mo(Model model)
    {
        List<PayList> payLists = payService.getlistbytype(1,2);
        model.addAttribute("lists",payLists);
        return "financial_manage/money_out";
    }


    @RequestMapping(value="mhqbysdid2" ,method = RequestMethod.POST)
    public String mhqbysdid2(@RequestParam("QID") Integer x, Model model){
        List<PayList> payLists = payService.getlistbytype(1,2);
        model.addAttribute("lists",payLists);
        return "financial_manage/money_out";
    }

    @RequestMapping(value="mhqbysman2" ,method = RequestMethod.POST)
    public String mhqbysman2(@RequestParam("QMan") Integer x, Model model){
        List<PayList> payLists = payService.getlistbytype(1,2);
        model.addAttribute("lists",payLists);
        return "financial_manage/money_out";
    }


    @RequestMapping(value="query_by_time" ,method = RequestMethod.POST)
    public String mhqbytimess(@RequestParam("QTime") Integer x, Model model){
        List<PayList> payLists = payService.getlistbytype(1,1);
        model.addAttribute("lists",payLists);
        return "financial_manage/money_in";
    }//传入类型有误，未实现


//    @RequestMapping(value="query_by_Did" ,method = RequestMethod.POST)
//    public String mhqbytime(@RequestParam("QSID") Integer x, Model model){
//        List<Ordergoods> payLists = orderService.getlistbytype();
//        model.addAttribute("lists",payLists);
//        return "financial_manage/account_wait";
//    }
//
//    @RequestMapping(value="query_by_Ddid" ,method = RequestMethod.POST)
//    public String mhqbytime(@RequestParam("QDID") Integer x, Model model){
//        List<Ordergoods> payLists = orderService.getlistbytype();
//        model.addAttribute("lists",payLists);
//        return "financial_manage/account_wait";
//    }
//
//
//    @RequestMapping(value="query_by_Dman" ,method = RequestMethod.POST)
//    public String mhqbytime(@RequestParam("QMan") Integer x, Model model){
//        List<Ordergoods> payLists = orderService.getlistbytype();
//        model.addAttribute("lists",payLists);
//        return "financial_manage/account_wait";
//    }



    @RequestMapping("account_wait")
    public String acwt(){
        return "financial_manage/account_wait";
    }

}
