package com.phoenix.poplar;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan(value = "com.phoenix.dao.mapper")
@SpringBootApplication
public class Poplar {
    public static void main(String[] args) {
        SpringApplication.run(Poplar.class, args);
    }
}