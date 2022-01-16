package com.ibrahim.homework3.dto;

import com.ibrahim.homework3.entity.Cast;
import com.ibrahim.homework3.enums.Genre;
import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Builder
public class MovieDto {

    private Long id;

    private String name;

    private String genre;

    private String releaseYear;

    private String director;

    private List<Cast> castList;

    private int point;

    public Genre convert(String source){
        return Genre.valueOf(source.toUpperCase());
    }
}
