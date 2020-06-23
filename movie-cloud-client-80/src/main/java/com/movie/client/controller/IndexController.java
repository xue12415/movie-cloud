package com.movie.client.controller;

import com.movie.common.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

/**
 * @author xue
 * @date 2020-06-23 15:41
 */
@Controller
public class IndexController {
    @RequestMapping("/")
    public String index(Model model, String ifream) {
        if (ifream==null||ifream.equals("")){
            model.addAttribute("ifream", "hello");
        }else {
            model.addAttribute("ifream", ifream);
        }
        return "index";
    }

    @RequestMapping("/hello")
    public String gotoHello() {
        return "hello";
    }
    @RequestMapping("/login")
    public String gotoLogin() {
        return "login";
    }
    @RequestMapping("/register")
    public String gotoRegister() {
        return "register";
    }
    @ResponseBody
    @RequestMapping("/registers")
    private String register(User user){
        System.out.println(user.getName());
        System.out.println(user.getPassword());
        return "movie";
    }
}
