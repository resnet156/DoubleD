package com.atguigu.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
public class Boot03HelloworldApplication {

    public static void main(String[] args) {
        SpringApplication.run(Boot03HelloworldApplication.class, args);
    }

}
