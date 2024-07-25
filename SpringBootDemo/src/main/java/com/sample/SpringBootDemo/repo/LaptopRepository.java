package com.sample.SpringBootDemo.repo;

import com.sample.SpringBootDemo.model.Laptop;
import org.springframework.stereotype.Repository;

/**
 * This file name is intract with the database
 * using the jdbc connnection
 */

@Repository
public class LaptopRepository {

//  Sample laptop to add
    public void save(Laptop lap){
        System.out.println("Save in database");
    }

}
