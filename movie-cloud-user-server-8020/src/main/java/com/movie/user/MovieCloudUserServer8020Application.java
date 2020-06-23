package com.movie.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class MovieCloudUserServer8020Application {

    public static void main(String[] args) {
        SpringApplication.run(MovieCloudUserServer8020Application.class, args);
    }

}
