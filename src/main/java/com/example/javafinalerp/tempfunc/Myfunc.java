package com.example.javafinalerp.tempfunc;

import com.example.javafinalerp.Bean.User;
import com.example.javafinalerp.Resitory.UserResitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Component
public class Myfunc {


    private static Integer TimetoI(String x){
        String s2;
        Integer Year=0,Mon=0,Day=0;
        for(int i=0;i<x.length();i++){
            if(x.charAt(i)=='-'){
                s2=x.substring(0,i-1);
                Year = Integer.parseInt(s2);
                x=x.substring(i+1);
                break;
            }
        }
        for(int i=0;i<x.length();i++){
            if(x.charAt(i)=='-'){
                s2=x.substring(0,i-1);
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
        if(TimetoI(getDate())-TimetoI(x)>z){
            return false;
        }
        else return true;
    }

}
