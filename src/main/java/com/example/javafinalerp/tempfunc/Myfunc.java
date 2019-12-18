package com.example.javafinalerp.tempfunc;

import com.example.javafinalerp.Bean.User;
import com.example.javafinalerp.Resitory.UserResitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.sql.Time;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Component
public class Myfunc {


    private static Integer TimetoI(String x){
        String s2=null;
        Integer Year=0,Mon=0,Day=0;
        for(int i=0;i<x.length();i++){
            if(x.charAt(i)=='-'){
                s2=x.substring(0,i);
                Year = Integer.parseInt(s2);
                x=x.substring(i+1);
                break;
            }
        }
//        System.out.println(s2);
//        System.out.println(x);
        for(int i=0;i<x.length();i++){
            if(x.charAt(i)=='-'){
                s2=x.substring(0,i);
                Mon = Integer.parseInt(s2);
                x=x.substring(i+1);
                Day = Integer.parseInt(x);
                break;
            }
        }
        Integer all = (Year-1970)*365+Mon*30+Day;
        return all;
    }

    public static String getDate(){
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");//设置日期格式
        return df.format(new Date());// new Date()为获取当前系统时间
    }

    public static boolean checkTime(String x,Integer z){
        int xx=TimetoI(x).intValue();
        int zz = z;
        int yy = TimetoI(getDate()).intValue();
        System.out.println(x);
        System.out.println(xx);
        System.out.println(yy);
        System.out.println(z);
        if(yy-xx>zz){
            System.out.println("f");
            return false;
        }
        else return true;
    }

}
