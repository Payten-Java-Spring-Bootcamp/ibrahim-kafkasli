package com.ibrahim.homework3.controller;

import com.ibrahim.homework3.dto.MovieDto;
import com.ibrahim.homework3.entity.Movie;
import com.ibrahim.homework3.service.MovieService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


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
    public List<Movie> movie(){
        return movieService.getMovies();
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping("/movie")
    @ApiOperation(value = "delete movie with movie")
    public ResponseEntity<String> movie(@RequestBody String name){
        movieService.deleteMovie(name);
        return ResponseEntity.ok("Kullanıcı Başarılı Şekilde Silindi");
    }

}

