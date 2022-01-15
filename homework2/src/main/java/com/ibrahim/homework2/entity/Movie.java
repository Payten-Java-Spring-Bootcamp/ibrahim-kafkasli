package com.ibrahim.homework2.entity;

import com.ibrahim.homework2.enums.Genre;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.Year;
import java.util.ArrayList;
import java.util.List;


@Getter
@Setter
@Builder
public class Movie {
    private int id;
    private String name;
    private String genre;
    private String releaseYear;
    private String director;
    private List<String> castList;
    private int point;

    public Genre convert(String source){
        return Genre.valueOf(source.toUpperCase());
    }
}
