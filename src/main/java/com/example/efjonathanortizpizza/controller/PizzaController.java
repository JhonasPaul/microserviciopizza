package com.example.efjonathanortizpizza.controller;

import com.example.efjonathanortizpizza.model.Pizza;
import com.example.efjonathanortizpizza.service.iPizzaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v3")
public class PizzaController {
    @Autowired
    private iPizzaService service;

    @GetMapping("/pizzas")
    public ResponseEntity<?> listarCategoria() {
        List<Pizza> lista = this.service.listarPizza();
        return new ResponseEntity<List<Pizza>>(lista, HttpStatus.OK);
    }

    @GetMapping("/pizzas/{id}")
    public ResponseEntity<?> listarPorId(@PathVariable("id") Integer id) {
        Pizza pizza = this.service.listarPizzaPorId(id);
        return new ResponseEntity<Pizza>(pizza, HttpStatus.OK);
    }

    @PostMapping("/pizzas")
    public ResponseEntity<?>agregar(@RequestBody Pizza pizza){
        Pizza categoriaNuevo = this.service.actualizarPizza(pizza);
        return new ResponseEntity<Pizza>(categoriaNuevo, HttpStatus.CREATED);
    }

    @PutMapping("/pizzas")
    public ResponseEntity<?> actualizar(@RequestBody Pizza pizza) {
        Pizza clienteActualizado = this.service.actualizarPizza(pizza);
        return new ResponseEntity<Pizza>(clienteActualizado, HttpStatus.CREATED);
    }

    @DeleteMapping("/pizzas/{id}")
    public ResponseEntity<Void> eliminar(@PathVariable("id") Integer id) {
        this.service.eliminarPizza(id);
        return new ResponseEntity<Void>(HttpStatus.OK);
    }
}
