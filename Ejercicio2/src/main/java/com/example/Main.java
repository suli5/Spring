package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        NotificationService notificacion = (NotificationService) context.getBean("notificationService");

        String salida1 = notificacion.saludar();

        System.out.println(salida1);

        UserService salida2 = (UserService) context.getBean("userService");

        System.out.println(salida2.notificationService.saludar());


    }
}
