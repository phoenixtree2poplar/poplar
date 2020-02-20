package com.phoenix.free;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan(value = "com.phoenix.free.mapper")
@SpringBootApplication
public class MybatisPlusGenerator {
    public static void main(String[] args) {
        SpringApplication.run(MybatisPlusGenerator.class, args);
    }
}