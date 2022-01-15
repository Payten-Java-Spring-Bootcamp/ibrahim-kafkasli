package com.ibrahim.homework2.entity;

import com.ibrahim.homework2.enums.Genre;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.Year;
import java.util.ArrayList;
import java.util.List;


@Getter
@Setter
@Builder
@ApiModel(value = "Movie Api Entity Documentation", description = "Entity")
public class Movie {

    @ApiModelProperty(value = "unique id of movie")
    private int id;

    @ApiModelProperty(value = "name of movie")
    private String name;

    @ApiModelProperty(value = "genre of movie")
    private Genre genre;

    @ApiModelProperty(value = "release year of movie")
    private String releaseYear;

    @ApiModelProperty(value = "director of movie")
    private String director;

    @ApiModelProperty(value = "cast list of movie")
    private List<String> castList;

    @ApiModelProperty(value = "imdb point of movie")
    private int point;
}
