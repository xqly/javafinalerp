package com.example.javafinalerp.Resitory;

import com.example.javafinalerp.Bean.MHouse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface MHouseResitory extends JpaRepository<MHouse,Integer> {

    @Query("select m from MHouse m where m.MHID=?1")
    List<MHouse> findbyid(Integer x);

    @Query("select m from MHouse m where m.MHName=?1")
    List<MHouse> findbyname(String name);

    @Query("select m from MHouse m ")
    List<MHouse> findAll();
}
