package com.example.javafinalerp.Resitory;

import com.example.javafinalerp.Bean.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ClientResitory extends JpaRepository<Client,Integer> {
    @Query("select c from Client c where c.C_ID=?1")
    List<Client> findbyid(Integer x);

    @Query("select c from Client c where c.CName=?1")
    List<Client> findbyname(String x);
}
