package com.example.Ejercicio5.controller;

import com.example.Ejercicio5.Laptop;
import com.example.Ejercicio5.repository.LaptopRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class LaptopController {

    private LaptopRepository laptopRepository;

    public LaptopController(LaptopRepository laptopRepository) {
        this.laptopRepository = laptopRepository;
    }

    @GetMapping("/laptop")
    public List <Laptop> findAll(){
        return laptopRepository.findAll();
    }
}
