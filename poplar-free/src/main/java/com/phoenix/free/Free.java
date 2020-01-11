package com.phoenix.free;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan(value = "com.phoenix.dao.mapper")
@SpringBootApplication
public class Free {
    public static void main(String[] args) {
        SpringApplication.run(Free.class, args);
    }
}