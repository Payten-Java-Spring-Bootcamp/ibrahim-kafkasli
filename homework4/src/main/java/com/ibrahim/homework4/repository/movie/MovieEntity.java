package com.ibrahim.homework4.repository.movie;

import com.ibrahim.homework4.enums.Genre;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;
import java.util.Set;

@Getter
@Setter
@Entity
public class MovieEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private Genre genre;
    private LocalDateTime localDateTime;
    private String director;
    private Set<String> casts;

}
