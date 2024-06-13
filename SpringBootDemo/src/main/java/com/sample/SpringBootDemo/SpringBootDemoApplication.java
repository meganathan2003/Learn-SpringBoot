package com.sample.SpringBootDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootDemoApplication {

    public static void main(String[] args) {
        // That application context directly interact with the container
        ApplicationContext context = SpringApplication.run(SpringBootDemoApplication.class, args);
        System.out.println("Hello World");

        // Call the class
        Progammer obj = context.getBean(Progammer.class);
        obj.code();
    }

}
