package com.zhiend.finetownship;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.zhiend.finetownship.mapper")
public class FinetownshipApplication {

    public static void main(String[] args) {
        SpringApplication.run(FinetownshipApplication.class, args);
    }

}
