package com.ibrahim.homework3.service;

import com.ibrahim.homework3.controller.MovieController;
import com.ibrahim.homework3.dto.MovieDto;
import com.ibrahim.homework3.entity.Movie;
import com.ibrahim.homework3.repository.MovieRepository;
import com.ibrahim.homework3.service.impl.MovieServiceImpl;
import com.sun.org.apache.bcel.internal.ExceptionConst;
import lombok.RequiredArgsConstructor;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.logging.Logger;

@Service
@RequiredArgsConstructor
public class MovieService implements MovieServiceImpl {

    private final MovieRepository movieRepository;

    @Override
    public Movie create(MovieDto movieDto) {
        Movie movie = Movie.builder()
                            .name(movieDto.getName())
                            .genre(movieDto.convert(movieDto.getGenre()))
                            .releaseYear(movieDto.getReleaseYear())
                            .director(movieDto.getDirector())
                            .castList(movieDto.getCastList())
                            .point(movieDto.getPoint())
                            .build();
        try {
            movieRepository.save(movie);
        }catch (Exception e){
            System.out.println("Yeni film veri tabanına eklenemedi: "+e);
        }
        return movie;
    }

    @Override
    public List<Movie> getMovies() {
        return movieRepository.findAll();
    }

    @Override
    public void deleteMovie(String name) {
        movieRepository.deleteByName(name);
    }
}
