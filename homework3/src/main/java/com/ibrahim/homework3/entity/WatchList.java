package com.ibrahim.homework3.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Entity
@Table
public class WatchList {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long watchListId;

    @ManyToMany
    @JoinTable(name = "Movie")
    private List<Movie> watchList;
}
