package com.ibrahim.homework4.service.movie;

import com.ibrahim.homework4.enums.Genre;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Set;

@Getter
@Setter
@Builder
public class Movie {
    private String name;
    private Genre genre;
    private LocalDateTime localDateTime;
    private String director;
    private Set<String> casts;
}
