package com.cui.firstdemo;

import org.mybatis.spring.boot.autoconfigure.MybatisAutoConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class, MybatisAutoConfiguration.class})
public class FirstdemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(FirstdemoApplication.class, args);
    }

}
