package com.example.javafinalerp.Controller;

import com.example.javafinalerp.Bean.MHouseLog;
import com.example.javafinalerp.Bean.WHouseLog;
import com.example.javafinalerp.Service.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class LogManageController {
    @Autowired
    LogManageController logManageController;

    @Resource
    LogService logService;


    @RequestMapping("chejian_in_Log")
    public String ac2(){
        return "log_manage/chejian_in_Log";
    }
    @RequestMapping("chejian_out_Log")
    public String ac3(){
        return "log_manage/chejian_out_Log";
    }
    @RequestMapping("materialsLog")
    public String ac4(Model model)
    {
        List<MHouseLog> logs = logService.getMHLList();
        model.addAttribute("logs",logs);
        return "log_manage/materialsLog";
    }
    @RequestMapping("productsLog")
    public String ac5(Model model){
        List<WHouseLog> logs = logService.getWHLList();
        model.addAttribute("logs",logs);
        return "log_manage/productsLog";
    }

    @RequestMapping(value = "mlogquery_by_id",method = RequestMethod.POST)
    public String qbi(@RequestParam("QID") Integer x,Model model){
        List<MHouseLog> logs = logService.getMHLListByID(x);
        model.addAttribute("logs",logs);
        return "log_manage/materialsLog";
    }

    @RequestMapping(value = "mlogquery_by_hid",method = RequestMethod.POST)
    public String qbhi(@RequestParam("QID") Integer x,Model model){
        List<MHouseLog> logs = logService.getMHLListByHID(x);
        model.addAttribute("logs",logs);
        return "log_manage/materialsLog";
    }

    @RequestMapping(value = "wlogquery_by_id",method = RequestMethod.POST)
    public String wqbi(@RequestParam("QID") Integer x,Model model){
        List<WHouseLog> logs = logService.getWHLListByID(x);
        model.addAttribute("logs",logs);
        return "log_manage/productsLog";
    }

    @RequestMapping(value = "wlogquery_by_hid",method = RequestMethod.POST)
    public String wqbhi(@RequestParam("QID") Integer x,Model model){
        List<WHouseLog> logs = logService.getWHLListByHID(x);
        model.addAttribute("logs",logs);
        return "log_manage/productsLog";
    }
}
