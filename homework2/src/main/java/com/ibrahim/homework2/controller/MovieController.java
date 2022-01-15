package com.ibrahim.homework2.controller;

import com.ibrahim.homework2.dto.MovieDto;
import com.ibrahim.homework2.entity.Movie;
import com.ibrahim.homework2.service.MovieService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequiredArgsConstructor
@Api(value = "Movie Api Documentation")
public class MovieController {

    private final MovieService movieService ;

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/movie")
    @ApiOperation(value = "create new movie")
    public Movie movie(@RequestBody MovieDto movie){
        return movieService.create(movie);
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/movie")
    @ApiOperation(value = "get all movies from database")
    public Movie movie(){
        return movieService.getMovie();
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping("/movie")
    @ApiOperation(value = "delete movie with movie")
    public ResponseEntity<String> movie(@RequestBody String name){
        return ResponseEntity.ok(movieService.deleteMovie(name));
    }

}

