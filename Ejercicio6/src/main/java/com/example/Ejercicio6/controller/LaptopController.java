package com.example.Ejercicio6.controller;

import com.example.Ejercicio6.Laptop;
import com.example.Ejercicio6.repository.LaptopRepository;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class LaptopController {

    private LaptopRepository laptopRepository;

    public LaptopController(LaptopRepository laptopRepository) {
        this.laptopRepository = laptopRepository;
    }

    @GetMapping("/Ejercicio3")
    public List <Laptop> findAll(){
        return laptopRepository.findAll();

    }

    @GetMapping("/Ejercicio3/{id}")
    public ResponseEntity<Laptop> findOneById(@PathVariable Long id) {
        //@PathVariable LO QUE HACE ES VINCULAR EL PARAMETRO Long id CON EL {id}

        Optional<Laptop> bookOpt = laptopRepository.findById(id);

        //OPCION 1
        if (bookOpt.isPresent()) {
            return ResponseEntity.ok(bookOpt.get());

        } else
            return ResponseEntity.notFound().build();
    }

        @PostMapping("/Ejercicio3/Laptop")
        public Laptop create(@RequestBody Laptop laptop, @RequestHeader HttpHeaders headers){
        System.out.println(headers.get("User-Agent"));
        return laptopRepository.save(laptop);

    }

}
