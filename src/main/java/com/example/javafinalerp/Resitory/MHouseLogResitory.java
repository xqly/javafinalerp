package com.example.javafinalerp.Resitory;

import com.example.javafinalerp.Bean.MHouseLog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface MHouseLogResitory extends JpaRepository<MHouseLog,Integer> {
    @Query("select m from MHouseLog m where m.MHID=?1")
    List<MHouseLog> getlistByMHID(Integer x);

    @Query("select m from MHouseLog m where m.MHLID=?1")
    List<MHouseLog> getlistByID(Integer x);

}
