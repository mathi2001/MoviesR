package com.example.MoviesR;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;


    @SpringBootApplication
    @RestController
    public class MoviesRApplication {

        public static void main(String[] args) {
            SpringApplication.run(MoviesRApplication.class, args);
        }
    }

