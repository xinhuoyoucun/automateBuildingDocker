package com.laiyuan.test;
/**
 * @author laiyuan
 * @date 2020/10/13
 */
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestApplication.class, args);

        System.out.println("hello");
    }

}