package com.movie.client.service;

import com.movie.client.dao.MovieDao;
import com.movie.common.entity.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author xue
 * @Date 2020/7/31 16:42
 * @Version 1.0
 * Buddha bless, never bug!
 */
@Service
public class MovieServiceImpl implements MovieService {
    @Autowired
    MovieDao movieDao;
    @Override
    public List<Movie> getMovies() {
        return movieDao.getMovies();
    }

    @Override
    public Movie getMovieById(Integer id) {
        return movieDao.getMovieById(id);
    }
}
