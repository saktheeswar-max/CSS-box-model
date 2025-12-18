package com.edutrack;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.edutrack")
public class EdutrackApplication {

    public static void main(String[] args) {
        SpringApplication.run(EdutrackApplication.class, args);
    }
}
