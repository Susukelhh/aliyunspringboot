package com.service;

import com.config.SpringMvcConfig;
import com.controller.UserController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnnotationApp {
    public static void main(String[] args) {
        ApplicationContext app=new AnnotationConfigApplicationContext(SpringMvcConfig.class);

        UserController userController = app.getBean(UserController.class);
        userController.save();
    }
}
