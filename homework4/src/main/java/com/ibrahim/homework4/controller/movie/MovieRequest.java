package com.ibrahim.homework4.controller.movie;

import com.ibrahim.homework4.enums.Genre;
import com.ibrahim.homework4.service.movie.Movie;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.Set;

@Getter
@Setter
@Builder
public class MovieRequest {

    private String name;
    private Genre genre;
    private LocalDateTime localDateTime;
    private String director;
    private Set<String> casts;

    public Movie convertToMovie() {
        return Movie.builder()
                    .name(name)
                    .genre(genre)
                    .localDateTime(localDateTime)
                    .director(director)
                    .casts(casts)
                    .build();
    }
}
