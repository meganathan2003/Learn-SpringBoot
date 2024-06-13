package com.sample.SpringBootDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

// This anotaion for we tell that spring to it's you're responsibility to create a obj
@Component
public class Progammer {

    // autowired connect the two different class
    @Autowired
    Laptop laptop;

    public void code() {
        laptop.compile();
    }

}
