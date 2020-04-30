package com.pets;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;


/**
 * @author 芒果love
 */
@SpringBootApplication
@MapperScan("com.pets.dao")
@EnableTransactionManagement
public class App {
    public static void main(String[] args) {
        //启动类
        SpringApplication.run(App.class, args);
    }
}
