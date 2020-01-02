package com.atguigu.generator.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(value = "com.atguigu.generator.demo.mapper")
public class GeneratorDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(GeneratorDemoApplication.class, args);
    }

}
