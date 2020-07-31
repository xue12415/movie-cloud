package com.movie.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableEurekaClient
@EnableFeignClients
@SpringBootApplication
public class MovieCloudClient80Application {

    public static void main(String[] args) {
        SpringApplication.run(MovieCloudClient80Application.class, args);
    }

}
