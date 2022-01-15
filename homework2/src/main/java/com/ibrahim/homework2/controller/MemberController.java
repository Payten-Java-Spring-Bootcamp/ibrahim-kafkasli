package com.ibrahim.homework2.controller;

import com.ibrahim.homework2.entity.Member;
import com.ibrahim.homework2.entity.Movie;
import com.ibrahim.homework2.entity.WatchList;
import lombok.Builder;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MemberController {


    @ResponseStatus(HttpStatus.NO_CONTENT)
    @PutMapping("/point")
    public void Point(@RequestBody int memberId, @RequestBody int movieId, @RequestBody int point){

    }

    @PostMapping("/watchlist")
    public void WatchList(@RequestBody int memberId, @RequestBody WatchList watchList){

    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @PutMapping("/watchList")
    public void WatchList(@RequestBody int watchListId, @RequestBody int movieId){

    }

}
