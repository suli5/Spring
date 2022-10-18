package com.example.Ejercicio6.repository;

import com.example.Ejercicio6.Laptop;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface LaptopRepository extends JpaRepository <Laptop,Long> {
}
