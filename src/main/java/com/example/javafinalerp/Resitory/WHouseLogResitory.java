package com.example.javafinalerp.Resitory;

import com.example.javafinalerp.Bean.WHouseLog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface WHouseLogResitory extends JpaRepository<WHouseLog,Integer> {
    @Query("select l from WHouseLog l where l.LID=?1")
    List<WHouseLog> getlistByID(Integer x);

    @Query("select l from WHouseLog l where l.WID=?1")
    List<WHouseLog> getlistByWID(Integer x);

    @Query("select l from WHouseLog l where l.LOper=?1")
    List<WHouseLog> getlistbyoper(Integer x);


}
