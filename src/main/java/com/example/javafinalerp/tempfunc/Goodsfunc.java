package com.example.javafinalerp.tempfunc;

import com.example.javafinalerp.Bean.WHStatus;
import com.example.javafinalerp.Resitory.WHStatusResitory;
import com.sun.mail.imap.protocol.INTERNALDATE;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Goodsfunc {

    @Autowired
    WHStatusResitory whStatusResitory;

    void outGoodsbysid(Integer x,Integer num){
        WHStatus whStatus = whStatusResitory.findbysid(x);
        if(whStatus.getGNum()>num){
            whStatus.setGNum(whStatus.getGNum()-num);
            whStatusResitory.save(whStatus);
        }
        else {
            whStatusResitory.deleteById(whStatus.getWHSID());
        }
    }

    public void outGoodsbyid(Integer x,Integer num){
        List<WHStatus> all = whStatusResitory.findbygid(x);
        for(int i=0;i<all.size();i++){
            for(int j=0;j<all.size();j++){
                if(all.get(i).getWHTime().compareTo(all.get(j).getWHTime())==-1){
                    WHStatus temp = all.get(i);
                    all.set(i,all.get(j));
                    all.set(j,temp);
                }
            }
        }
        Integer summ=0;
        for(int i=0;i<all.size();i++){
            if(summ+all.get(i).getGNum()<num){
                outGoodsbysid(all.get(i).getWHSID(),all.get(i).getGNum());
            }
            else {
                outGoodsbysid(all.get(i).getWHSID(),num-summ);
                break;
            }
        }
    }
}
