package com.phoenix.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@EnableEurekaClient
@SpringBootApplication
public class PoplarZuul {
    public static void main(String[] args) {
        SpringApplication.run(PoplarZuul.class, args);
    }
}