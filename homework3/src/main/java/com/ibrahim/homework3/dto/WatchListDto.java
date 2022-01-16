package com.ibrahim.homework3.dto;

import com.ibrahim.homework3.entity.Movie;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Builder
public class WatchListDto {

    private Long watchListId;

    private List<Movie> watchList;
}
