package com.example;

import org.springframework.stereotype.Component;

@Component
public class NotificationService {

    public NotificationService(){
        System.out.println("Ejecutando constructor NotificationService");
    }

    public String saludar(){
        return "Hola buenas tardes";
    }
}
