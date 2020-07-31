package com.movie.client.controller;

import com.movie.client.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author xue
 * @Date 2020/7/31 16:45
 * @Version 1.0
 * Buddha bless, never bug!
 */
@Controller
public class MovieController {
    @Autowired
    MovieService service;
    @RequestMapping("/movies")
    public String movies(Model model){
        model.addAttribute("movies",service.getMovies());
        return "archive";
    }
}
