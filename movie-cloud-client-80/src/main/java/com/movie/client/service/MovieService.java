package com.movie.client.service;

import com.movie.common.entity.Movie;

import java.util.List;

/**
 * @Author xue
 * @Date 2020/7/31 16:42
 * @Version 1.0
 * Buddha bless, never bug!
 */
public interface MovieService {
    List<Movie> getMovies();
    Movie getMovieById(Integer id);
}
