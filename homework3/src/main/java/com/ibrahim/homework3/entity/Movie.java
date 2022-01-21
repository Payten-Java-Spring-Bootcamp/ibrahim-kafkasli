package com.ibrahim.homework3.entity;

import com.ibrahim.homework3.enums.Genre;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;

import javax.persistence.*;
import java.util.List;


@Getter
@Setter
@ApiModel(value = "Movie Api Entity Documentation", description = "Entity")
@Entity
@Table(name = "Movie")
@ToString
@EqualsAndHashCode(of = {"id"})
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @ApiModelProperty(value = "unique id of movie")
    private Long id;

    @ApiModelProperty(value = "name of movie")
    private String name;

    @Enumerated
    @ApiModelProperty(value = "genre of movie")
    private Genre genre;

    @ApiModelProperty(value = "release year of movie")
    private String releaseYear;

    @ApiModelProperty(value = "director of movie")
    private String director;

    @ManyToMany
    @JoinTable(name = "Cast")
    @ApiModelProperty(value = "cast list of movie")
    private List<Cast> castList;

    @ApiModelProperty(value = "imdb point of movie")
    private int point;
}
