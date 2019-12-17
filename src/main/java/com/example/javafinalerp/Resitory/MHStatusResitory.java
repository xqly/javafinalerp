package com.example.javafinalerp.Resitory;

import com.example.javafinalerp.Bean.MHStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface MHStatusResitory extends JpaRepository<MHStatus,Integer> {
    @Query("select m from MHStatus m where m.MHID=?1")
    List<MHStatus> findbyhid(Integer x);

    @Query("select m from MHStatus m where m.MID=?1")
    List<MHStatus> findbymid(Integer x);

    @Query("select m from MHStatus m where m.MHPID=?1")
    List<MHStatus> findbypid(Integer x);

    @Query("select m from MHStatus m where m.MHSID=?1")
    MHStatus findbysid(Integer x);
}
