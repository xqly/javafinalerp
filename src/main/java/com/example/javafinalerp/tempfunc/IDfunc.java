package com.example.javafinalerp.tempfunc;


import com.example.javafinalerp.Bean.Client;
import com.example.javafinalerp.Bean.MHouseLog;
import com.example.javafinalerp.Bean.Ordergoods;
import com.example.javafinalerp.Bean.User;
import com.example.javafinalerp.Resitory.ClientResitory;
import com.example.javafinalerp.Resitory.MHouseLogResitory;
import com.example.javafinalerp.Resitory.OrdergoodsResitory;
import com.example.javafinalerp.Resitory.UserResitory;
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
