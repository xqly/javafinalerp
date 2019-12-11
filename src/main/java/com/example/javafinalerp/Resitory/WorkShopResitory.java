package com.example.javafinalerp.Resitory;

import com.example.javafinalerp.Bean.WorkShop;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface WorkShopResitory extends JpaRepository<WorkShop,Integer> {
    @Query("select w from WorkShop w where w.WSID=?1")
    List<WorkShop> findbyid(Integer x);

    @Query("select w from WorkShop w where w.WSName=?1")
    List<WorkShop> findbyname(String x);
}
