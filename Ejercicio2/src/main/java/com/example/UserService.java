package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserService {
     NotificationService notificationService;

     @Autowired
     public UserService(NotificationService notificationService){

          System.out.println("Ejecutando constructor UserService");

          this.notificationService = notificationService;

     }

}
