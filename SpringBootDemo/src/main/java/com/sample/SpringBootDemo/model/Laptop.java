package com.sample.SpringBootDemo.model;


import org.springframework.stereotype.Component;

@Component
public class Laptop implements Computer {

    //  Here create a new method
    public void compile(){
        System.out.println("compling in laptop");
    }
}
