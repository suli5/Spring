package com.example.Ejercicio4.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/saludo")
    public String saludo(){
        return "Hola buenos dias";
    }
}
