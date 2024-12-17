package com.example.websimpapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.*;
@RestController
@SpringBootApplication
public class WebsimpapiApplication {

    public static void main(String[] args) {

        SpringApplication.run(WebsimpapiApplication.class, args);
    }
//    http://localhost:8080/api/doctors


    @GetMapping("/hello")
    public  String helloo(){
        return  "Hello world";
    }



}
