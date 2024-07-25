package com.sample.SpringBootDemo.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;

public class Alien {

    @Value("25")
    private int age;
    private  Computer comp;


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Computer getComp(){
        return  comp;
    }

    @Autowired
    @Qualifier("laptop")
    public void setComp(Computer com){
        this.comp = com;
    }

    public  void code(){
        comp.compile();
    }

}
