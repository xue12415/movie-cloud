package com.example.service;

import com.movie.common.entity.Movie;

import java.util.List;

/**
 * @Author xue
 * @Date 2020/7/31 15:46
 * @Version 1.0
 * Buddha bless, never bug!
 */

public interface MovieService {
    public List<Movie> getMovies();
    public Movie getMovieById(Integer movieId);
}
