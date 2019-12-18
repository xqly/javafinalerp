package com.example.javafinalerp.Controller;


import com.example.javafinalerp.Bean.PayList;
import com.example.javafinalerp.Bean.User;
import com.example.javafinalerp.Service.PayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class FinancialManageController {

    @Resource
    PayService payService;

    @Autowired
    FinancialManageController financialManageController;

    @RequestMapping("account_in")
    public String acin(Model model){
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

    @RequestMapping("account_wait")
    public String acwt(){
        return "financial_manage/account_wait";
    }

}
