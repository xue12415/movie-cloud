package com.example.mapper;

import com.movie.common.entity.Movie;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Author xue
 * @Date 2020/7/31 15:32
 * @Version 1.0
 * Buddha bless, never bug!
 */
@Mapper
public interface MovieMapper {
    List<Movie> selectMovies();
    Movie selectMovieById(Integer movieId);
}
