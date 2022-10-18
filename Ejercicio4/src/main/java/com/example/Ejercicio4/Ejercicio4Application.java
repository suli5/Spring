package com.example.Ejercicio4;

import com.example.Ejercicio4.controller.HelloController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Ejercicio4Application {

	public static void main(String[] args) {


	ApplicationContext context =  SpringApplication.run(Ejercicio4Application.class, args);

		HelloController saludo = new HelloController();

		String salida = saludo.saludo();

		System.out.println(salida);
	}

}
