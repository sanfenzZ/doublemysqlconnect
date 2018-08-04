package com.example.doubleidea;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class DoubleideaApplication {

    public static void main(String[] args) {
        SpringApplication.run(DoubleideaApplication.class, args);
    }
}
