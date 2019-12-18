package com.example.javafinalerp.Resitory;

import com.example.javafinalerp.Bean.WHStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface WHStatusResitory extends JpaRepository<WHStatus,Integer> {
    @Query("select w from WHStatus w where w.WHID=?1")
    List<WHStatus> findbyhid(Integer x);

    @Query("select w from WHStatus w where w.GID=?1")
    List<WHStatus> findbygid(Integer x);

    @Query("select w from WHStatus w where w.GPID=?1")
    List<WHStatus> findbypid(Integer x);

    @Query("select w from WHStatus w where w.WHSID=?1")
    WHStatus findbysid(Integer x);
}
