package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@EnableCaching
@SpringBootApplication
public class MovieCloudMovieServer8030Application {

    public static void main(String[] args) {
        SpringApplication.run(MovieCloudMovieServer8030Application.class, args);
    }

}
