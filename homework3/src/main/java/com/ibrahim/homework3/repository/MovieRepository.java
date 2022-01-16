package com.ibrahim.homework3.repository;

import com.ibrahim.homework3.entity.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie, Long> {
     void deleteByName(String name);
}
