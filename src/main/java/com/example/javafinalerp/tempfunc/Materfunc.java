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

    public void OutMHSbynumandid(Integer id,Integer num){
//        System.out.println("num:"+num.toString());
        MHStatus mhStatus = mhStatusResitory.findbysid(id);
        if(mhStatus.getMHNum()==num){
            mhStatusResitory.deleteById(id);
        }
        else {
            mhStatus.setMHNum(mhStatus.getMHNum()-num);
            mhStatusResitory.save(mhStatus);
        }
        System.out.println(444);
//        UserInfo user = (UserInfo) SecurityUtils.getSubject().getPrincipal();
        MHouseLog mHouseLog = new MHouseLog();
        mHouseLog.setMDate(Myfunc.getDate());
        mHouseLog.setMHID(mhStatus.getMHID());
        mHouseLog.setOper(2);
        mHouseLog.setMPID(mhStatus.getMHPID());
        mHouseLog.setMLNum(mhStatus.getMHNum());
        mHouseLog.setMLMan(1);//xqly
        mHouseLogResitory.save(mHouseLog);
    }

    public void OutMaterialbyidandnum(Integer id,Integer num){
        List<MHStatus> lists = mhStatusResitory.findbymid(id);
        for(int i=0;i<lists.size();i++){
            for(int j=0;j<lists.size();j++){
                if(lists.get(i).getMHTime().compareTo(lists.get(j).getMHTime())==-1){
                    MHStatus temp = lists.get(i);
                    lists.set(i,lists.get(j));
                    lists.set(j,temp);
                }
            }
        }
        Integer all=0;
        for(int i=0;i<lists.size();i++){
            if(all+lists.get(i).getMHNum()<num){
                OutMHSbynumandid(lists.get(i).getMHSID(),lists.get(i).getMHNum());
                all+=lists.get(i).getMHNum();
            }
            else {
                OutMHSbynumandid(lists.get(i).getMHSID(),num-all);
                break;
            }
        }
    }

    public void OutMaterialbyPlan(Integer x){
        System.out.println("outplan:"+x.toString());
        ProducePlan producePlan = producePlanResitory.findppbypid(x);
        if(producePlan==null){
            System.out.println(123);
        }
        else {
            List<Method> methods = methodResitory.getallmid(producePlan.getGnum());
//            System.out.println(methods.size());
            for(int i=0;i<methods.size();i++){
                System.out.println(i);
                Method temp = methods.get(i);
                OutMaterialbyidandnum(temp.getMID(),temp.getMNum()*producePlan.getGnum());
            }
        }
    }
    public void InMaterialsbyiqdandnum(Integer id,Integer num){
        //xqly

    }
}
