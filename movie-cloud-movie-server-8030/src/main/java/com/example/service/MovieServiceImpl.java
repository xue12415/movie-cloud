package com.example.service;

import com.example.mapper.MovieMapper;
import com.movie.common.entity.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author xue
 * @Date 2020/7/31 15:47
 * @Version 1.0
 * Buddha bless, never bug!
 */
@Service
public class MovieServiceImpl implements MovieService {
    @Autowired
    MovieMapper movieMapper;
    @Override
    public List<Movie> getMovies() {
        return movieMapper.selectMovies();
    }

   @Cacheable(key = "#movieId" ,value = "movie")
    @Override
    public Movie getMovieById(Integer movieId) {
        return movieMapper.selectMovieById(movieId);
    }
}
