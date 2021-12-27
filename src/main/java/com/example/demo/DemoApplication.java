package com.example.demo;

import com.example.demo.module.staff;
import com.exxample.demo.view.viewstaff;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

}
@Autowired
private viewstaff viewstaff;

@Override
pubic void run (String... args) throws Exception {
    staff sraff1 = new staff();
    staff1.setFirstname("Sudharshan");
    staff1.setLastname("Liverpool");
    staff1.setPhonenumber"123");
    staff1.setAddress("Jungle");
    viewstaff.save(staff1);
        }
