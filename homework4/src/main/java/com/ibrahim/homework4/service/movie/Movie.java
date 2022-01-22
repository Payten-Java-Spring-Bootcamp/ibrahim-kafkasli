package com.ibrahim.homework4.service.movie;

import com.ibrahim.homework4.controller.movie.Actor;
import com.ibrahim.homework4.controller.movie.request.MovieRequest;
import com.ibrahim.homework4.enums.Genre;
import lombok.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import java.time.LocalDate;
import java.util.Set;

@Getter
@Setter
@Data
@Builder
public class Movie {

    @NotBlank
    private String movieName;

    @NotNull
    private Genre genre;

    @NotNull
    private LocalDate releaseYear;

    @NotBlank
    private String director;

    @NotNull
    private Set<Actor> actorSet;


}
