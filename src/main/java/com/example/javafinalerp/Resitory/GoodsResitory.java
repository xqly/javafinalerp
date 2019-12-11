package com.example.javafinalerp.Resitory;

import com.example.javafinalerp.Bean.Goods;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface GoodsResitory extends JpaRepository<Goods,Integer> {
    @Query("select g from Goods g where g.G_ID=?1")
    List<Goods> findbyid(Integer x);

    @Query("select g from Goods g where g.GName=?1")
    List<Goods> findbyname(String x);

    @Query("select g from Goods g where g.GType=?1")
    List<Goods> findbytype(Integer x);
}
