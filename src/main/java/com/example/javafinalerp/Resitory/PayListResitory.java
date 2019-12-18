package com.example.javafinalerp.Resitory;

import com.example.javafinalerp.Bean.PayList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PayListResitory extends JpaRepository<PayList,Integer> {
    @Query("select p from PayList p where p.state=?1 and p.stateout=?2")
    List<PayList> getlistbytype(Integer x,Integer y);

    @Query("select p from PayList p where p.state=?1 and p.stateout=?2 and p.PID=?3")
    List<PayList> getlistbypid(Integer x,Integer y,Integer id);

    @Query("select p from PayList p where p.state=?1 and p.stateout=?2 and p.OID=?3")
    List<PayList> getlistbyoid(Integer x,Integer y,Integer id);

    @Query("select p from PayList p where p.state=?1 and p.stateout=?2 and p.PMan=?3")
    List<PayList> getlistbytypeman(Integer x,Integer y,Integer man);


}
