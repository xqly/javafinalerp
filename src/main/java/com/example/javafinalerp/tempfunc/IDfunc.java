package com.example.javafinalerp.tempfunc;


import com.example.javafinalerp.Bean.*;
import com.example.javafinalerp.Resitory.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class IDfunc {
    @Autowired
    OrdergoodsResitory ordergoodsResitory;

    @Autowired
    ClientResitory clientResitory;

    @Autowired
    MHouseLogResitory mHouseLogResitory;

    @Autowired
    UserResitory userResitory;

    @Autowired
    UserInfoResitory userInfoResitory;

    public Integer user(){
        List<User> lists = userResitory.findAll();
        Integer maxx=0;
        for(int i=0;i<lists.size();i++){
            if(maxx.intValue()<lists.get(i).getU_ID()){
                maxx= lists.get(i).getU_ID();
            }
        }
        return maxx;
    }

    public Integer userinfo(){
        List<UserInfo> lists = userInfoResitory.findAll();
        Integer maxx=0;
        for(int i=0;i<lists.size();i++){
            if(maxx.intValue()<lists.get(i).getUid()){
                maxx= lists.get(i).getUid();
            }
        }
        return maxx;
    }

    public Integer ordergoods(){
        List<Ordergoods> lists = ordergoodsResitory.findAll();
        Integer maxx=0;
        for(int i=0;i<lists.size();i++){
            if(maxx.intValue()<lists.get(i).getOID()){
                maxx= lists.get(i).getOID();
            }
        }
        return maxx;
    }



    public Integer client(){
        List<Client> lists = clientResitory.findAll();
        Integer maxx=0;
        for(int i=0;i<lists.size();i++){
            if(maxx.intValue()<lists.get(i).getC_ID()){
                maxx= lists.get(i).getC_ID();
            }
        }
        return maxx;
    }

    public Integer MHL(){
        List<MHouseLog> lists = mHouseLogResitory.findAll();
        Integer maxx=0;
        for(int i=0;i<lists.size();i++){
            if(maxx.intValue()<lists.get(i).getMHLID()){
                maxx= lists.get(i).getMHLID();
            }
        }
        return maxx;
    }
}
