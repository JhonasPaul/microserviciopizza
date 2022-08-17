package com.example.efjonathanortizpizza.service;

import com.example.efjonathanortizpizza.model.Pizza;

import java.util.List;

public interface iPizzaService{
    public List<Pizza> listarPizza();
    public Pizza listarPizzaPorId(Integer id);
    public Pizza agregarPizza(Pizza pizzera);
    public Pizza actualizarPizza(Pizza pizzera);
    public void eliminarPizza(Integer id);
}
