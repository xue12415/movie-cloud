package com.movie.client.controller;

import com.movie.common.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author xue
 * @date 2020-06-22 18:15
 */
@RestController
public class UserController {
    @Autowired
    private RestTemplate restTemplate;

    public static final String REST_URL_PREFIX = "http://localhost:8020";

    @GetMapping("/user")
    private User getUserById(Integer id){
       return restTemplate.getForObject(REST_URL_PREFIX+"/user/"+id,User.class);
    }
}
