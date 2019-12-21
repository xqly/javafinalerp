package com.example.javafinalerp.Controller;

import com.example.javafinalerp.Bean.*;
import com.example.javafinalerp.Service.BasicManageService;
import com.example.javafinalerp.tempclass.Mhsname;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class BasicManageController {
    @Autowired
    BasicManageController basicManageController;

    @Resource
    BasicManageService basicManageService;

    @RequestMapping("add_materials")
    public String ac5(Model model){
        List<Materials> maters = basicManageService.getmaterlist();
        model.addAttribute("maters",maters);
        return "basic_manage/add_materials";
    }

    @RequestMapping(value = "materqbyid" ,method = RequestMethod.POST)
    public String mqbid(@RequestParam("QID") Integer x,Model model){
        List<Materials> maters = basicManageService.getmaterbyid(x);
        model.addAttribute("maters",maters);
        return "basic_manage/add_materials";
    }

    @RequestMapping(value = "materqbyname" ,method = RequestMethod.POST)
    public String mqbname(@RequestParam("QNAME") String name,Model model){
        List<Materials> maters = basicManageService.getmaterbyname(name);
        model.addAttribute("maters",maters);
        return "basic_manage/add_materials";
    }

    @RequestMapping("add_dept")
    public String ac1(Model model){
        List<MHouse> mHouses = basicManageService.germhouselist();
        model.addAttribute("mhs",mHouses);
        return "basic_manage/add_dept";
    }

    @RequestMapping(value="mhqbyid" ,method = RequestMethod.POST)
    public String mhqbyid(@RequestParam("QID") Integer x,Model model){
        List<MHouse> mHouses = basicManageService.getmhousebyid(x);
        model.addAttribute("mhs",mHouses);
        return "basic_manage/add_dept";
    }

    @RequestMapping(value = "mhqbyname",method = RequestMethod.POST)
    public String mhqbyname(@RequestParam("QNAME") String name, Model model){
        List<MHouse> mHouses = basicManageService.getmhousebyname(name);
        model.addAttribute("mhs",mHouses);
        return "basic_manage/add_dept";
    }

    @RequestMapping("materials_in_home")
    public String ac9(Model model){
        List<Mhsname> mhStatuses = basicManageService.gethslist();
        model.addAttribute("mhs",mhStatuses);
        return "basic_manage/materials_in_home";
    }

    @RequestMapping(value = "mhsqbyhid",method = RequestMethod.POST)
    public String mhsqbyid(@RequestParam("QID") Integer id,Model model){
        List<MHStatus> mhStatuses = basicManageService.getmhsbyhid(id);
        model.addAttribute("mhs",mhStatuses);
        return "basic_manage/materials_in_home";
    }

    @RequestMapping(value = "mhsqbymid",method = RequestMethod.POST)
    public String mhsqbymid(@RequestParam("QID") Integer x,Model model){
        List<MHStatus> mhStatuses = basicManageService.getmhsbymid(x);
        model.addAttribute("mhs",mhStatuses);
        return "basic_manage/materials_in_home";
    }

    @RequestMapping(value = "mhsqbypid",method = RequestMethod.POST)
    public String mhsqbyhid(@RequestParam("QID") Integer x,Model model){
        List<MHStatus>mhStatuses = basicManageService.getmhsbypid(x);
        model.addAttribute("mhs",mhStatuses);
        return "basic_manage/materials_in_home";
    }

    @RequestMapping("add_goods")
    public String ac4(Model model){
        List<Goods> goods = basicManageService.getgoodslist();
        model.addAttribute("goods",goods);
        return "basic_manage/add_goods";
    }

    @RequestMapping(value = "gqbyid",method = RequestMethod.POST)
    public String gqbyid(@RequestParam("QID") Integer x,Model model){
        List<Goods> goods = basicManageService.getglbyid(x);
        model.addAttribute("goods",goods);
        return "basic_manage/add_goods";
    }

    @RequestMapping(value = "gqbyname",method = RequestMethod.POST)
    public String gqbyname(@RequestParam("QNAME") String x,Model model){
        List<Goods> goods = basicManageService.getglbyname(x);
        model.addAttribute("goods",goods);
        return "basic_manage/add_goods";
    }

    @RequestMapping(value = "gqbytype",method = RequestMethod.POST)
    public String gqbytype(@RequestParam("QTYPE") Integer x,Model model){
        List<Goods> goods = basicManageService.getglbyType(x);
        model.addAttribute("goods",goods);
        return "basic_manage/add_goods";
    }

    @RequestMapping("add_stock")
    public String ac8(Model model){
        List<WHouse> wHouses = basicManageService.getwhouselist();
        model.addAttribute("whouses",wHouses);
        return "basic_manage/add_stock";
    }
    @RequestMapping(value = "whqbyid",method = RequestMethod.POST)
    public String whqbyid(@RequestParam("QID") Integer x,Model model){
        List<WHouse> wHouses = basicManageService.getwhbyhid(x);
        model.addAttribute("whouses",wHouses);
        return "basic_manage/add_stock";
    }
    @RequestMapping(value = "whqbyname",method = RequestMethod.POST)
    public String whqbyname(@RequestParam("QNAME") String x,Model model){
        List<WHouse> wHouses = basicManageService.getwhbuname(x);
        model.addAttribute("whouses",wHouses);
        return "basic_manage/add_stock";
    }

    @RequestMapping("product_in_home")
    public String ac10(Model model){
        List<WHStatus> whStatuses = basicManageService.getwhslist();
        model.addAttribute("whss",whStatuses);
        return "basic_manage/product_in_home";
    }
    @RequestMapping(value = "whsqbyhid",method = RequestMethod.POST)
    public String whsqbyid(@RequestParam("QID") Integer x,Model model){
        List<WHStatus> whStatuses = basicManageService.getwhsbyhid(x);
        model.addAttribute("whss",whStatuses);
        return "basic_manage/product_in_home";
    }
    @RequestMapping(value = "whsqbygid",method = RequestMethod.POST)
    public String whsqbygid(@RequestParam("QID") Integer x,Model model){
        List<WHStatus> whStatuses = basicManageService.getwhsbygid(x);
        model.addAttribute("whss",whStatuses);
        return "basic_manage/product_in_home";
    }
    @RequestMapping(value = "whsqbypid",method = RequestMethod.POST)
    public String whsqbypid(@RequestParam("QID") Integer x,Model model){
        List<WHStatus> whStatuses = basicManageService.getwhsbypid(x);
        model.addAttribute("whss",whStatuses);
        return "basic_manage/product_in_home";
    }

    @RequestMapping("add_product_acre")
    public String ac7(Model model){
        List<WorkShop> workShops = basicManageService.getworkslist();
        model.addAttribute("wss",workShops);
        return "basic_manage/add_product_acre";
    }

    @RequestMapping(value = "wsqbyid",method = RequestMethod.POST)
    public String wsqbyid(@RequestParam("QID") Integer x,Model model){
        List<WorkShop> workShops = basicManageService.getworksbyid(x);
        model.addAttribute("wss",workShops);
        return "basic_manage/add_product_acre";
    }
    @RequestMapping(value = "wsqbyname",method = RequestMethod.POST)
    public String wsqbyname(@RequestParam("QNAME") String x,Model model){
        List<WorkShop> workShops = basicManageService.getworksbyname(x);
        model.addAttribute("wss",workShops);
        return "basic_manage/add_product_acre";
    }

    @RequestMapping("add_custom")
    public String ac(Model model){
        List<Client> clients = basicManageService.getclientlist();
        model.addAttribute("clients",clients);
        return "basic_manage/add_custom";
    }

    @RequestMapping(value = "cqbyid",method = RequestMethod.POST)
    public String cqbyid(@RequestParam("QID") Integer x,Model model){
        List<Client> clients = basicManageService.getclbyid(x);
        model.addAttribute("clients",clients);
        return "basic_manage/add_custom";
    }

    @RequestMapping(value = "cqbynmae",method = RequestMethod.POST)
    public String cqbyname(@RequestParam("QNAME") String x,Model model){
        List<Client> clients = basicManageService.getclbyname(x);
        model.addAttribute("clients",clients);
        return "basic_manage/add_custom";
    }




}
