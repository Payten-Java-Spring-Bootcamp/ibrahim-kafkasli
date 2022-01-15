package com.ibrahim.homework2.controller;

import com.ibrahim.homework2.entity.WatchList;
import com.ibrahim.homework2.service.MemberService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;


@RestController
@RequiredArgsConstructor
@Api(value = "Member Api Documentation")
public class MemberController {

    private final MemberService memberService;

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @PutMapping("/point")
    @ApiOperation(value = "Member gives point for movie")
    public void Point(@RequestBody int memberId, @RequestBody int movieId, @RequestBody int point){
        memberService.givePoint(memberId, movieId, point);
    }

    @PostMapping("/watchlist")
    @ApiOperation(value = "member creates watch list from movies for himself")
    public void WatchList(@RequestBody int memberId, @RequestBody WatchList watchList){
        memberService.createWatchList(memberId, watchList);
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @PutMapping("/watchList")
    @ApiOperation(value = "member adds movie in watch list")
    public void WatchList(@RequestBody int memberId, @RequestBody int movieId){
        memberService.addOnWatchList(memberId, movieId);
    }

}
