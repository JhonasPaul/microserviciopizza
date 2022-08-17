package com.example.efjonathanortizpizza.repository;

import com.example.efjonathanortizpizza.model.Pizza;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PizzaRepository extends JpaRepository<Pizza, Integer> {

}
