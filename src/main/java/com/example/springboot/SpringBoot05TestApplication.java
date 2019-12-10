package com.example.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
//扫描mybatis mapper 包路径
@MapperScan(basePackages = "com.example.springboot.mapper")
public class SpringBoot05TestApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBoot05TestApplication.class, args);
    }

}
