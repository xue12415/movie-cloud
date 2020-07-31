package com.example.controller;

import com.example.service.MovieService;
import com.movie.common.entity.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author xue
 * @Date 2020/7/31 15:48
 * @Version 1.0
 * Buddha bless, never bug!
 */
@RestController
@RequestMapping("/movie/")
public class MovieController {
    @Autowired
    MovieService movieService;
    @GetMapping("movies")
    public List<Movie> getMovies(){
        return movieService.getMovies();
    }
    @GetMapping("{id}")
    public Movie getMovieById(@PathVariable("id")Integer movieId){
        return movieService.getMovieById(movieId);
    }
}
