package com.ibrahim.homework4.controller.movie.request;

import com.ibrahim.homework4.controller.movie.Actor;
import com.ibrahim.homework4.enums.Genre;
import com.ibrahim.homework4.service.movie.Movie;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.Set;

@Builder
@Getter
@Setter
public class MovieRequest {

    private String movieName;
    private Genre genre;
    private LocalDate releaseYear;
    private String director;
    private Set<Actor> actorSet;

    public Movie convertToMovie(){
            return Movie.builder()
                        .movieName(movieName)
                        .genre(genre)
                        .releaseYear(releaseYear)
                        .director(director)
                        .actorSet(actorSet)
                        .build();
    }

}
