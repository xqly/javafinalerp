package com.example.javafinalerp.Resitory;

import com.example.javafinalerp.Bean.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface OrderResitory extends JpaRepository<Order,Integer> {
    @Query("select o from Order o where o.type=?1")
    List<Order> findlistbytype(Integer x);

    @Query("select o from Order o where o.type=?1 and o.OID=?2")
    List<Order> findlistbyid(Integer type,Integer id);

    @Query("select o from Order o where o.type=?1 and o.CID=?2")
    List<Order>  findlistbyclient(Integer type ,Integer cid);
}
