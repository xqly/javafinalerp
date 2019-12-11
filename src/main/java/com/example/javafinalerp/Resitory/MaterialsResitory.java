package com.example.javafinalerp.Resitory;

import com.example.javafinalerp.Bean.Materials;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface MaterialsResitory extends JpaRepository<Materials,Integer> {
    @Query("select m from Materials m where m.MID=?1")
    List<Materials> findbyid(Integer x);

    @Query("select m from Materials m where m.MName=?1")
    List<Materials> findbyname(String x);



}
