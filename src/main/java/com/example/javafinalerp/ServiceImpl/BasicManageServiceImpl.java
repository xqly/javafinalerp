package com.example.javafinalerp.ServiceImpl;

import com.example.javafinalerp.Bean.*;
import com.example.javafinalerp.Resitory.*;
import com.example.javafinalerp.Service.BasicManageService;
import com.example.javafinalerp.tempclass.Mhsname;
import com.example.javafinalerp.tempfunc.Changefunc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service
public class BasicManageServiceImpl implements BasicManageService {

    @Autowired
    MaterialsResitory materialsResitory;

    @Override
    public List<Materials> getmaterlist() {
        return materialsResitory.findAll();
    }

    @Override
    public List<Materials> getmaterbyid(Integer x) {
        return materialsResitory.findbyid(x);
    }

    @Override
    public List<Materials> getmaterbyname(String name) {
        return materialsResitory.findbyname(name);
    }

    @Override
    public void addmater(Materials mater) {
        materialsResitory.save(mater);
    }

    @Override
    public void delmaterbyid(Integer x) {
        materialsResitory.deleteById(x);
    }

    @Autowired
    MHouseResitory mHouseResitory;

    @Override
    public List<MHouse> germhouselist() {
        return mHouseResitory.findAll();
    }

    @Override
    public List<MHouse> getmhousebyid(Integer x) {
        return mHouseResitory.findbyid(x);
    }

    @Override
    public List<MHouse> getmhousebyname(String name) {
        return mHouseResitory.findbyname(name);
    }

    @Override
    public void addmhouse(MHouse mhouse) {
        mHouseResitory.save(mhouse);
    }

    @Override
    public void delmhousebyid(Integer x) {
        mHouseResitory.deleteById(x);
    }

    @Autowired
    MHStatusResitory mhStatusResitory;

    @Resource
    Changefunc changefunc;

    @Override
    public List<Mhsname> gethslist() {
        List<MHStatus> list = mhStatusResitory.findAll();
        List<Mhsname> answ = changefunc.MHS(list);
        return answ;
    }

    @Override
    public List<MHStatus> getmhsbyhid(Integer x) {
        return mhStatusResitory.findbyhid(x);
    }

    @Override
    public List<MHStatus> getmhsbymid(Integer x) {
        return mhStatusResitory.findbymid(x);
    }

    @Override
    public List<MHStatus> getmhsbypid(Integer x) {
        return mhStatusResitory.findbypid(x);
    }

    @Autowired
    GoodsResitory goodsResitory;

    @Override
    public List<Goods> getgoodslist() {
        return goodsResitory.findAll();
    }

    @Override
    public List<Goods> getglbyid(Integer x) {
        return goodsResitory.findbyid(x);
    }

    @Override
    public List<Goods> getglbyname(String name) {
        return goodsResitory.findbyname(name);
    }

    @Override
    public List<Goods> getglbyType(Integer x) {
        return goodsResitory.findbytype(x);
    }

    @Override
    public void addg(Goods goods) {
        goodsResitory.save(goods);
    }

    @Override
    public void delgbyid(Integer x) {
        goodsResitory.deleteById(x);
    }

    @Autowired
    WHouseResitroy wHouseResitroy;

    @Override
    public List<WHouse> getwhouselist() {
        return wHouseResitroy.findAll();
    }

    @Override
    public List<WHouse> getwhbyhid(Integer x) {
        return wHouseResitroy.findbyid(x);
    }

    @Override
    public List<WHouse> getwhbuname(String name) {
        return wHouseResitroy.findbyname(name);
    }

    @Override
    public void addwh(WHouse wHouse) {
        wHouseResitroy.save(wHouse);
    }

    @Override
    public void delwhbyid(Integer x) {
        wHouseResitroy.deleteById(x);
    }

    @Autowired
    WHStatusResitory whStatusResitory;

    @Override
    public List<WHStatus> getwhslist() {
        return whStatusResitory.findAll();
    }

    @Override
    public List<WHStatus> getwhsbyhid(Integer x) {
        return whStatusResitory.findbyhid(x);
    }

    @Override
    public List<WHStatus> getwhsbygid(Integer x) {
        return whStatusResitory.findbygid(x);
    }

    @Override
    public List<WHStatus> getwhsbypid(Integer x) {
        return whStatusResitory.findbypid(x);
    }

    @Autowired
    WorkShopResitory workShopResitory;

    @Override
    public List<WorkShop> getworkslist() {
        return workShopResitory.findAll();
    }

    @Override
    public List<WorkShop> getworksbyid(Integer x) {
        return workShopResitory.findbyid(x);
    }

    @Override
    public List<WorkShop> getworksbyname(String name) {
        return workShopResitory.findbyname(name);
    }

    @Override
    public void addworkshop(WorkShop workShop) {
        workShopResitory.save(workShop);
    }

    @Override
    public void delworkshopbyid(Integer x) {
        workShopResitory.deleteById(x);
    }

    @Autowired
    ClientResitory clientResitory;

    @Override
    public List<Client> getclientlist() {
        return clientResitory.findAll();
    }

    @Override
    public List<Client> getclbyid(Integer x) {
        return clientResitory.findbyid(x);
    }

    @Override
    public List<Client> getclbyname(String name) {
        return null;
    }

    @Override
    public void addclient(Client client) {
        clientResitory.save(client);
    }

    @Override
    public void delclientbyid(Integer x) {
        clientResitory.deleteById(x);
    }

    @Autowired
    MethodResitory methodResitory;

    @Override
    public List<Goods> getunmethodgoods() {
        List<Method> list = methodResitory.findAll();
        List<Goods> gl = new ArrayList<>();
        List<Goods> gls = goodsResitory.findAll();
        for(int i=0;i<gls.size();i++){
            Integer ok=0;
            for(int j=0;j<list.size();j++){
                if(list.get(j).getGID()==gls.get(i).getG_ID()){
                    ok=1;
                    break;
                }
            }
            if(ok==0){
                gl.add(gls.get(i));
            }
        }
        return gl;
    }
}
