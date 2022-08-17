package com.example.efjonathanortizpizza.service;

import com.example.efjonathanortizpizza.model.Pizza;
import com.example.efjonathanortizpizza.repository.PizzaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PizzaServiceImpl implements iPizzaService{
    @Autowired
    private PizzaRepository repository;

    @Override
    public List<Pizza> listarPizza() {
        return this.repository.findAll();
    }

    @Override
    public Pizza listarPizzaPorId(Integer id) {
        return this.repository.findById(id).orElse(null);
    }

    @Override
    public Pizza agregarPizza(Pizza pizzera) {
        return this.repository.save(pizzera);
    }

    @Override
    public Pizza actualizarPizza(Pizza pizzera) {
        return this.repository.saveAndFlush(pizzera);
    }

    @Override
    public void eliminarPizza(Integer id) {
        this.repository.deleteById(id);
    }
}
