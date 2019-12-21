package com.example.javafinalerp.Resitory;

import com.example.javafinalerp.Bean.WHouse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface WHouseResitroy extends JpaRepository<WHouse,Integer> {
    @Query("select w from WHouse w where w.WID=?1")
    List<WHouse> findbyid(Integer x);

    @Query("select w from WHouse w where w.WName=?1")
    List<WHouse> findbyname(String x);

    @Query("select w from WHouse w ")
    List<WHouse> findall();
}
