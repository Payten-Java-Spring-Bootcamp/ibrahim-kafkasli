package com.ibrahim.homework4.controller.movie;

import com.ibrahim.homework4.service.movie.Movie;
import com.ibrahim.homework4.service.movie.MovieService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class MovieController {

    private final MovieService movieService;
    @PostMapping("/movies")
    public void create(@RequestBody MovieRequest movieRequest){
        Movie movie = movieRequest.convertToMovie();
        movieService.createMovie(movie);
    }
}
