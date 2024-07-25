package com.sample.SpringBootDemo.service;

import com.sample.SpringBootDemo.repo.LaptopRepository;
import com.sample.SpringBootDemo.model.Laptop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * This file is called the
 * service layer in the spring boot
 *
 * @author  meganathan
 */

@Service
public class LaptopService {

    @Autowired
    private LaptopRepository repo;

    public void addLaptop(Laptop lap){
        repo.save(lap);
    }

}
