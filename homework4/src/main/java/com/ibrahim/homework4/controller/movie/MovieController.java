package com.ibrahim.homework4.controller.movie;

import com.ibrahim.homework4.controller.movie.request.MovieRequest;
import com.ibrahim.homework4.service.movie.Movie;
import com.ibrahim.homework4.service.movie.MovieService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class MovieController {

    private final MovieService movieService;

    @PostMapping("/movies")
    @ResponseStatus(HttpStatus.CREATED)
    public int create(@RequestBody MovieRequest movieRequest){
        Movie movie = movieRequest.convertToMovie();
        return movieService.create(movie);
    }
}
