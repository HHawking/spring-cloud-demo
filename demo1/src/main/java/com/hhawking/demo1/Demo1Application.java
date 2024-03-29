package com.hhawking.demo1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
* @title: demo1
* @Author: HH
* @Date: 2019-8-30 17:35
*/
@SpringBootApplication(scanBasePackages = "com.hhawking.demo1")
@EnableEurekaClient
@EnableFeignClients
public class Demo1Application {

    public static void main(String[] args) {
        SpringApplication.run(Demo1Application.class, args);
    }

}
