package com.movie.client.controller;

import com.movie.common.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

/**
 * @author xue
 * @date 2020-06-22 18:15
 */
@RestController
public class UserController {
    @Autowired
    private RestTemplate restTemplate;

    public static final String REST_URL_PREFIX = "http://localhost:8020";

    Map<String,String> infoMap=new HashMap<>();
    @RequestMapping("/user")
    private User getUserById(Integer id){
       return restTemplate.getForObject(REST_URL_PREFIX+"/user/"+id,User.class);
    }


    @RequestMapping("/user/add")
    @ResponseBody
    private Map<String,String> addUser(User user){
        //boolean flag= restTemplate.postForObject(REST_URL_PREFIX+"/user/add",user,Boolean.class);
       boolean flag=true;
        if (flag){
            infoMap.put("flag","success");
        }else {
            infoMap.put("flag","error");
        }

        return infoMap;
    }
}
