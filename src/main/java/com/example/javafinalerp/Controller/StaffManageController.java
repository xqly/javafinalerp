package com.example.javafinalerp.Controller;


import com.example.javafinalerp.Bean.User;
import com.example.javafinalerp.Resitory.UserResitory;
import com.example.javafinalerp.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class StaffManageController {

    @Autowired
    StaffManageController staffManageController;

    @Resource
    UserService userService;

    String []temp = new String[10];
    String []URL = new String[10];

    public StaffManageController(){
        temp[1]="财务部";
        URL[1]="add_financial_people";
        temp[2]="销售部";
        URL[2]="add_sale_people";
        temp[3]="成品部";
        URL[3]="add_product_people";
        temp[4]="材料部";
        URL[4]="add_materials_people";
        temp[5]="生产车间部";
        URL[5]="add_dept_people";
        temp[6]="生产计划部";
        URL[6]="add_plan_people";
    }

    @RequestMapping("add_financial_people")
    public String afp(Model model)
    {
        List<User> users = userService.getListByDept(1);
        model.addAttribute("users",users);
        return "staff_manage/add_financial_people";
    }

    @RequestMapping("add_product_people")
    public String app(Model model)
    {
        List<User> users = userService.getListByDept(3);
        model.addAttribute("users",users);
        return "staff_manage/add_product_people";
    }

    @RequestMapping("add_materials_people")
    public String amp(Model model){
        List<User> users = userService.getListByDept(4);
        model.addAttribute("users",users);
        return "staff_manage/add_materials_people";
    }

    @RequestMapping("add_dept_people")
    public String adp(Model model){
        List<User> users = userService.getListByDept(5);
        model.addAttribute("users",users);
        return "staff_manage/add_dept_people";
    }

    @RequestMapping("add_plan_people")
    public String appeo(Model model){
        List<User> users = userService.getListByDept(6);
        model.addAttribute("users",users);
        return"staff_manage/add_plan_people";
    }

    @RequestMapping("add_sale_people")
    public String adsp(Model model){
        List<User> users = userService.getListByDept(2);
        model.addAttribute("users",users);
        return "staff_manage/add_sale_people";}

    @RequestMapping(value = "query_by_id",method = RequestMethod.POST)
    public String qbi(@RequestParam("QID") Integer id ,@RequestParam("deptment") Integer dept, Model model){
        List<User> users = userService.getListByID(id,dept);
        model.addAttribute("users",users);
        return "staff_manage/"+URL[dept];
    }

    @RequestMapping(value = "query_by_name",method = RequestMethod.POST)
    public String qbn(@RequestParam("QNAME") String name,@RequestParam("deptment") Integer dept ,Model model){
        List<User> users = userService.getListByName(name,dept);
        model.addAttribute("users",users);
        return "staff_manage/"+URL[dept];
    }

    @RequestMapping(value = "/saveinfo" ,method = RequestMethod.POST)
    public String save(@ModelAttribute User user , @RequestParam("SUDept") String DeptName, HttpSession session){
        for(int i=1;i<=6;i++){
            if(DeptName.equals(temp[i])){
                user.setUDept(i);
                break;
            }
        }
        user.setUPassword("123456");
        userService.saveUser(user);
        return "redirect:"+URL[user.getUDept()];
    }

    @RequestMapping(value="/deluser",method = RequestMethod.POST)
    public String delu(@RequestParam("uid") Integer x){
        User user = userService.getUserByID(x);
        userService.delByID(x);
        return "redirect:"+URL[user.getUDept()];
    }

    @RequestMapping(value="/alteruser",method = RequestMethod.POST)
    public String alteruser(@ModelAttribute User user , @RequestParam("SUDept") String DeptName,HttpSession session){
        for(int i=1;i<=6;i++){
            if(DeptName.equals(temp[i])){
                user.setUDept(i);
                break;
            }
        }
        System.out.println(DeptName);
        System.out.println(user.getUDept());
        User old= userService.getUserByID(user.getU_ID());
        user.setUPassword(old.getUPassword());
        userService.saveUser(user);
        return "redirect:"+URL[user.getUDept()];
    }
}
