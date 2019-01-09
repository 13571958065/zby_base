package com.zby.base.baseweb;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.zby")
@MapperScan("com.zby.base.dao")
public class BaseWebApplication {

    public static void main(String[] args) {
        SpringApplication.run (BaseWebApplication.class, args);
    }

}

