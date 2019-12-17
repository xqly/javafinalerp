package com.example.javafinalerp.Resitory;

import com.example.javafinalerp.Bean.Method;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface MethodResitory extends JpaRepository<Method,Integer> {
    @Query("select m from Method m where m.GID=?1")
    List<Method> getallmid(Integer x);
}
