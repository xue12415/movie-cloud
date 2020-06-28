package com.movie.client.controller;

import com.movie.client.service.UserService;
import com.movie.common.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author xue
 * @date 2020-06-22 18:15
 */
@Controller
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("/user/login")
    public String login(String mail,String password,Model model) {
       if (userService.login(mail,password)){
           return "index";
       }else {
           model.addAttribute("errorMsg","邮箱或密码不正确");
           return "error";
       }
    }

    @RequestMapping("/user/register")
    public String register(Model model, User user) {
        System.out.println("register");
        if (userService.addUser(user)) {
            return "/";
        } else {
            model.addAttribute("errorMsg", "未知错误");
            return "error";
        }
    }
    @RequestMapping("/logout")
    public String logout(){
        return "index";
    }
}
