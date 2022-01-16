package com.ibrahim.homework3.service.impl;

import com.ibrahim.homework3.dto.MovieDto;
import com.ibrahim.homework3.entity.Movie;

import java.util.List;

public interface MovieServiceImpl {

    Movie create(MovieDto movie);
    List<Movie> getMovies();
    void deleteMovie(String name);
}
