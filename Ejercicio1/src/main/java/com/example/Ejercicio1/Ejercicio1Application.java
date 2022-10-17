package com.example.Ejercicio1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Ejercicio1Application {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        Saludo saludo = new Saludo();

        String salida= saludo.imprimirSaludo();

        System.out.println(salida);
    }

}
