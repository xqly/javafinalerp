package com.example.javafinalerp.Service;

import com.example.javafinalerp.Bean.*;

import java.util.List;

public interface BasicManageService {

    List<Materials> getmaterlist();
    List<Materials> getmaterbyid(Integer x);
    List<Materials> getmaterbyname(String name);
    void addmater(Materials mater);
    void delmaterbyid(Integer x);

    List<MHouse> germhouselist();
    List<MHouse> getmhousebyid(Integer x);
    List<MHouse> getmhousebyname(String name);
    void addmhouse(MHouse mhouse);
    void delmhousebyid(Integer x);

    List<MHStatus> gethslist();
    List<MHStatus> getmhsbyhid(Integer x);
    List<MHStatus> getmhsbymid(Integer x);
    List<MHStatus> getmhsbypid(Integer x);

    List<Goods> getgoodslist();
    List<Goods> getglbyid(Integer x);
    List<Goods> getglbyname(String name);
    List<Goods> getglbyType(Integer x);
    void addg(Goods goods);
    void delgbyid(Integer x);

    List<WHouse> getwhouselist();
    List<WHouse> getwhbyhid(Integer x);
    List<WHouse> getwhbuname(String name);
    void addwh(WHouse wHouse);
    void delwhbyid(Integer x);

    List<WHStatus> getwhslist();
    List<WHStatus> getwhsbyhid(Integer x);
    List<WHStatus> getwhsbygid(Integer x);
    List<WHStatus> getwhsbypid(Integer x);

    List<WorkShop> getworkslist();
    List<WorkShop> getworksbyid(Integer x);
    List<WorkShop> getworksbyname(String name);
    void addworkshop(WorkShop workShop);
    void delworkshopbyid(Integer x);

    List<Client> getclientlist();
    List<Client> getclbyid(Integer x);
    List<Client> getclbyname(String name);
    void addclient(Client client);
    void delclientbyid(Integer x);

    List<Goods> getunmethodgoods();
}
