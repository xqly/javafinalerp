package com.example.javafinalerp.Resitory;

import com.example.javafinalerp.Bean.MP;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface MPResitory extends JpaRepository<MP,Integer> {
}
