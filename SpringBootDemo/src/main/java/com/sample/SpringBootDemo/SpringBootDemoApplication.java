package com.sample.SpringBootDemo;

import com.sample.SpringBootDemo.model.Laptop;
import com.sample.SpringBootDemo.service.LaptopService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootDemoApplication {

    public static void main(String[] args) {
        // That application context directly interact with the container
        ApplicationContext context = SpringApplication.run(SpringBootDemoApplication.class, args);


        LaptopService service = context.getBean(LaptopService.class);


//        learn about the service
        Laptop lap = context.getBean(Laptop.class);
        service.addLaptop(lap);







        // Call the class
//        Alien obj = context.getBean(Alien.class);
//        System.out.println(obj.getAge());
//        obj.code();
    }

}
