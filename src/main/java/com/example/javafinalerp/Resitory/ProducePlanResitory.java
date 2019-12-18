package com.example.javafinalerp.Resitory;

import com.example.javafinalerp.Bean.ProducePlan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ProducePlanResitory extends JpaRepository<ProducePlan,Integer> {
    @Query("select p from ProducePlan p where p.pid=?1")
    ProducePlan findppbypid(Integer x);
}
