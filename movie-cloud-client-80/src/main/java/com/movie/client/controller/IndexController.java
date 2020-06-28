package com.movie.client.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author xue
 * @date 2020-06-23 15:41
 */
@Controller
public class IndexController {
    @RequestMapping("/")
    public String index() {
        return "index";
    }
    @RequestMapping("/gotoLogin")
    public String gotoLogin() {
        return "login";
    }
    @RequestMapping("/gotoRegister")
    public String gotoRegister() {
        return "register";
    }
}
