package com.example.javafinalerp.Controller;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
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
import org.springframework.web.bind.annotation.*;
import com.example.javafinalerp.tempclass.Orderandname;
import com.example.javafinalerp.tempclass.OWname;
import javax.annotation.Resource;
import java.util.List;
//import com.google.gson.Gson;

@Controller
public class SaleManageController {
    @Resource
    BasicManageService basicManageService;
    @Resource
    OrderService orderService;

    @Autowired
    SaleManageController saleManageController;

    @RequestMapping("advance_sale")
    public String ads(Model model){
        List<Orderandname> order=orderService.getpreorderlist();
        List<Goods> goods=basicManageService.getgoodslist();
        model.addAttribute("order",order);
        model.addAttribute("goods",goods);
        return "sale_manage/advance_sale";
    }

    @RequestMapping("/yourUrl/{yourDataName}")
    @ResponseBody
// @RequestParam("yourData")是必不可少的，因为他指定了链接中的参数名称
    public JSONArray yourUrl(@PathVariable("yourDataName") Integer yourData, Model model) {
        System.out.println(yourData);
        // 返回值可以自由定义
//
//        List<ImageInfo> imageInfos = imageFaceService.FindAll();
//        List<Map<String, Object>> result = new ArrayList<Map<String, Object>>();
//        Map<String, Object> map = null;
//        for (ImageInfo img : imageInfos) {
//            map = new HashMap<String, Object>();
//            map.put("image_id", img.getImage_id());
//            map.put("image_name", img.getImage_name());
//            map.put("image_path", img.getImage_path());
//            map.put("image_feature", img.getImage_feature());
//            result.add(map);
//        }
//        Gson gson = new Gson();
//        return gson.toJson(result);

        List<OWname> goods1=orderService.getlistbyoid(yourData);
        System.out.println(goods1.size());
        model.addAttribute("goods1",goods1);
        System.out.println(orderService.getordergoodsjson(yourData).toString());
        return orderService.getordergoodsjson(yourData);
        //return orderService.getajson().toJSONString();
      //  return orderService.getajson();
    }

    @RequestMapping("now__sale")
    public String ns(Model model){
        List<Orderandname> order=orderService.getorderlist();
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
        System.out.println("ID:"+id.toString());
        List<OWname> goods1 = orderService.getlistbyoid(id);
        model.addAttribute("goods1",goods1);
        return "sale_manage/children";
    }

    @RequestMapping(value = "query_by_poid",method = RequestMethod.POST)
    public String crk7(@RequestParam("OID") Integer id,  Model model){
        List<Orderandname> order = null; //orderService.getpreorderlistbyid(id);
        model.addAttribute("order",order);
        return "sale_manage/advance_sale";
    }

    @RequestMapping(value = "query_by_oid",method = RequestMethod.POST)
    public String crk(@RequestParam("OID") Integer id,  Model model){
        List<Orderandname> order = null; //orderService.getorderlistbyid(id);
        model.addAttribute("order",order);
        return "sale_manage/now__sale";
    }

    @RequestMapping(value = "query_by_pcid",method = RequestMethod.POST)
    public String crk11(@RequestParam("CID") Integer id,  Model model){
        List<Orderandname> order = null; //orderService.getpreoderlistbyclient(id);
        model.addAttribute("order",order);
        return "sale_manage/advance_sale";
    }

    @RequestMapping(value = "query_by_cid",method = RequestMethod.POST)
    public String crk1(@RequestParam("CID") Integer id,  Model model){
        List<Orderandname> order = null; //orderService.getorderlistbyclient(id);
        model.addAttribute("order",order);
        return "sale_manage/now__sale";
    }

    @RequestMapping("add_realorders")
    @ResponseBody
    public String amt2(@RequestBody String x){
        System.out.println(x);
        System.out.println(123);
        orderService.addOrder(x);
        return "redirect:now__sale";
    }

    @RequestMapping("add_preorders")
    public String amt(@RequestParam("preorders_json") String x){
        orderService.addpreorder();
        //xqly
        return "redirect:advance_sale";
    }

    @RequestMapping("re_orders")
    public String amt12(@RequestParam("reo_json") String x){
        //这里是退货的接口通过订单号
        //xqly
        return "redirect:re_goods";
    }

    @RequestMapping("re_goods")
    public String rg(Model model){
        List<Goods> goods=basicManageService.getgoodslist();
        List<Orderandname> order=orderService.getorderlist();
        model.addAttribute("order",order);
        model.addAttribute("goods",goods);
        return "sale_manage/re_goods";
    }
}
