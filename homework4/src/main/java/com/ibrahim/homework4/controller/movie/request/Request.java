package com.ibrahim.homework4.controller.movie.request;

import com.ibrahim.homework4.controller.movie.Cast;
import com.ibrahim.homework4.enums.Genre;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.Set;

@Builder
@Getter
@Setter
public class Request {

    private String movieName;
    private Genre genre;
    private LocalDate releaseYear;
    private String director;
    private Set<Cast> castSet;

}
