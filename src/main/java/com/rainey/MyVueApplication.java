package com.rainey;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * 主入口
 * @author rainey
 */
@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class })
public class MyVueApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyVueApplication.class, args);
    }

}
