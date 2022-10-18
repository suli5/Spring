package com.example.Ejercicio5;

import com.example.Ejercicio5.repository.LaptopRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Ejercicio5Application {

	public static void main(String[] args) {


	ApplicationContext context = SpringApplication.run(Ejercicio5Application.class, args);

		LaptopRepository repository = context.getBean(LaptopRepository.class);

		Laptop ordenador1 = new Laptop(null,"Dell","Windows");
		Laptop ordenador2 = new Laptop(null,"Apple","MacOS");

		System.out.println("Numero de ordenadores en el almacen: " + repository.findAll().size());

		repository.save(ordenador1);
		repository.save(ordenador2);

		System.out.println(repository.findAll().size());




	}

}
