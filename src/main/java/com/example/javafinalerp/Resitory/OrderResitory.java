package com.example.javafinalerp.Resitory;

import com.example.javafinalerp.Bean.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderResitory extends JpaRepository<Order,Integer> {
}
