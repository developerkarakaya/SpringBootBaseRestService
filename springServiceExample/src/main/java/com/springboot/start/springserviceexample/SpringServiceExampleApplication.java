package com.springboot.start.springserviceexample;

import com.springboot.start.springserviceexample.model.User;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class SpringServiceExampleApplication {
    public static List<User> liste;

    public static void main(String[] args) {
        SpringApplication.run(SpringServiceExampleApplication.class,
                args);


    }

}
