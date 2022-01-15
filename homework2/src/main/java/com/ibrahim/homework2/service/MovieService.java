package com.ibrahim.homework2.service;

import com.ibrahim.homework2.dto.MovieDto;
import com.ibrahim.homework2.entity.Movie;
import org.springframework.stereotype.Service;

@Service
public class MovieService {

    private Movie createdMovie;

    public Movie create(MovieDto movie) {
        createdMovie = Movie.builder()
                                    .id(movie.getId())
                                    .releaseYear(movie.getReleaseYear())
                                    .director(movie.getDirector())
                                    .name(movie.getName())
                                    .castList(movie.getCastList())
                                    .genre(movie.convert(movie.getGenre()))
                                    .build();
        return createdMovie;
    }

    public Movie getMovie() {
        return createdMovie;
    }

    public String deleteMovie(String name){
        return name;
    }
}
