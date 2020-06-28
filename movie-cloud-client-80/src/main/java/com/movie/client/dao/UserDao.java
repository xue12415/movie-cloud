package com.movie.client.dao;

import com.movie.common.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

/**
 * @Author xue
 * @Date 2020/6/28 14:08
 * @Version 1.0
 * Buddha bless, never bug!
 */
@Repository
public class UserDao {
    public static final String REST_URL_PREFIX = "http://localhost:8020";
    @Autowired
    RestTemplate restTemplate;
    public boolean addUser(User user){
        //return restTemplate.postForObject(REST_URL_PREFIX+"/user/add",user,Boolean.class);
        return false;
    }

    public User getUserByMail(String mail){
        return restTemplate.getForObject(REST_URL_PREFIX+"/user/mail/"+mail,User.class);
    }
}
