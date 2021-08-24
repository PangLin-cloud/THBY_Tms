package com.tianhai;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan
@SpringBootApplication
public class ThbyTmsApplication {

    public static void main(String[] args) {
        SpringApplication.run(ThbyTmsApplication.class, args);
    }

}
