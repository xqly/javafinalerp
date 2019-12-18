package com.example.javafinalerp.Controller;


import com.example.javafinalerp.Bean.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;

@Controller
public class FinancialManageController {

    @Autowired
    FinancialManageController financialManageController;

    @RequestMapping("account_in")
    public String acin(){
        return "financial_manage/account_in";
    }

    @RequestMapping("advance_money_in")
    public String admi(){
        return "financial_manage/advance_money_in";
    }

    @RequestMapping("money_in")
    public String Mi(){
        return "financial_manage/money_in";
    }
    @RequestMapping("money_out")
    public String Mo(){
        return "financial_manage/money_out";
    }

    @RequestMapping("account_wait")
    public String acwt(){
        return "financial_manage/account_wait";
    }

}
