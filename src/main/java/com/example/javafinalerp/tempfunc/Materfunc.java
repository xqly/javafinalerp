package com.example.javafinalerp.tempfunc;

import com.example.javafinalerp.Bean.*;
import com.example.javafinalerp.Resitory.MHStatusResitory;
import com.example.javafinalerp.Resitory.MHouseLogResitory;
import com.example.javafinalerp.Resitory.MethodResitory;
import com.example.javafinalerp.Resitory.ProducePlanResitory;
import org.apache.shiro.SecurityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Materfunc {

    @Autowired
    MHStatusResitory mhStatusResitory;

    @Autowired
    MHouseLogResitory mHouseLogResitory;

    @Autowired
    ProducePlanResitory producePlanResitory;

    @Autowired
    MethodResitory methodResitory;

    public void DesMaterbyMHSID(Integer x){
        mhStatusResitory.deleteById(x);
        UserInfo user = (UserInfo) SecurityUtils.getSubject().getPrincipal();
        MHStatus mhStatus = mhStatusResitory.findbysid(x);
        MHouseLog mHouseLog = new MHouseLog();
        mHouseLog.setMDate(Myfunc.getDate());
        mHouseLog.setMHID(mhStatus.getMHID());
        mHouseLog.setOper(3);
        mHouseLog.setMPID(mhStatus.getMHPID());
        mHouseLog.setMLNum(mhStatus.getMHNum());
        mHouseLog.setMLMan(user.getUid());
        mHouseLogResitory.save(mHouseLog);
    }

    public void OutMaterialbyidandnum(Integer id,Integer num){
        //xqly

    }

    public void OutMaterialbyPlan(Integer x){
        ProducePlan producePlan = producePlanResitory.findppbypid(x);
        if(producePlan==null){
            System.out.println(123);
        }
        else {
            List<Method> methods = methodResitory.getallmid(producePlan.getGnum());
//            System.out.println(methods.size());
            for(int i=0;i<methods.size();i++){
                Method temp = methods.get(i);
                OutMaterialbyidandnum(temp.getMID(),temp.getMNum()*producePlan.getGnum());
            }
        }
    }
    public void InMaterialsbyidandnum(Integer id,Integer num){
        //xqly
    }
}
