package com.example.Ejercicio6;

import com.example.Ejercicio6.repository.LaptopRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Ejercicio6Application {

	public static void main(String[] args) {


	ApplicationContext context = SpringApplication.run(Ejercicio6Application.class, args);

		LaptopRepository repository = context.getBean(LaptopRepository.class);

		Laptop ordenador1 = new Laptop(null,"Lenovo","Windows 11");
		Laptop ordenador2 = new Laptop(null,"Acer","Windows 11");

		System.out.println("Numero de ordenadores en el almacen: " + repository.findAll().size());

		repository.save(ordenador1);
		repository.save(ordenador2);

		System.out.println("Numero de ordenadores en el almacen: " + repository.findAll().size());
	}

}
