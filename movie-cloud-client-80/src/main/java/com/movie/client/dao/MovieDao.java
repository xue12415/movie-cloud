package com.movie.client.dao;

import com.movie.common.entity.Movie;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

/**
 * @Author xue
 * @Date 2020/7/31 16:37
 * @Version 1.0
 * Buddha bless, never bug!
 */
@Repository
@FeignClient(value = "MOVIE-SERVER-8030")
public interface MovieDao {
    @GetMapping("/movie/movies")
    public List<Movie> getMovies();
    @GetMapping("/movie/{id}")
    public Movie getMovieById(@PathVariable("id")Integer movieId);
}
