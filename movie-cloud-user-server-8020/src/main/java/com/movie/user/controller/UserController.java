package com.movie.user.controller;


import com.movie.common.entity.User;
import com.movie.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author xue
 * @date 2020-06-22 16:48
 */
@RestController
public class UserController {
    @Autowired
    private UserService service;

    @GetMapping("/user/{id}")
    public User getUserById(@PathVariable("id") Integer id){
        return  service.getUserById(id);
    }

    @PostMapping("/user/add")
    public Boolean addUser(@RequestBody User user){
        return service.addUser(user);
    }

    @GetMapping("/user/mail/{mail}")
    public User getUserByMail(@PathVariable("mail") String mail){
        return service.getUserByMail(mail);
    }
}
