package com.bborzechowski.jenkinsspringhello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class JenkinsSpringHelloApplication {

    public static void main(String[] args) {
        SpringApplication.run(JenkinsSpringHelloApplication.class, args);
    }

    @GetMapping("/")
    public String get(){
        return "Hello Jenkins";
    }
}
