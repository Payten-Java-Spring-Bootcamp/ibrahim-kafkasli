package com.ibrahim.homework2.controller;

import com.ibrahim.homework2.entity.Movie;
import com.ibrahim.homework2.enums.Genre;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.Year;
import java.util.ArrayList;
import java.util.List;

@RestController
public class MovieController {


    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/movie")
    public void Movie(@RequestBody Movie movie){
        Movie.builder()
                .name(movie.getName())
                .genre(movie.getGenre())
                .castList(movie.getCastList())
                .releaseYear(movie.getReleaseYear())
                .director(movie.getDirector())
                .build();
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/movie")
    public Movie Movie(){
        List<String> casts = new ArrayList<>();
        casts.add("Matthew McConaughey");
        casts.add("Anne Hathaway");
        return (Movie) Movie.builder()
                .name("Interstaller")
                .genre("Science_Fiction")
                .castList(casts)
                .releaseYear("2014")
                .director("Christopher Nolan")
                .build();
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping("/movie")
    public void Movie(@RequestBody String name){
        
    }

}
