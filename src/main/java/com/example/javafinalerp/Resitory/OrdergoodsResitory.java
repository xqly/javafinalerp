package com.example.javafinalerp.Resitory;

import com.example.javafinalerp.Bean.Ordergoods;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface OrdergoodsResitory extends JpaRepository<Ordergoods,Integer> {
    @Query("select o from Ordergoods o where o.type=?1")
    List<Ordergoods> findlistbytype(Integer x);

    @Query("select o from Ordergoods o where o.type=?1 and o.OID=?2")
    List<Ordergoods> findlistbyid(Integer type, Integer id);

    @Query("select o from Ordergoods o where o.type=?1 and o.CID=?2")
    List<Ordergoods>  findlistbyclient(Integer type , Integer cid);

    @Query("select o from Ordergoods o where o.type=?1 and o.OState=?2")
    List<Ordergoods> findlistsbytypeandstate(Integer type,Integer state);
}
