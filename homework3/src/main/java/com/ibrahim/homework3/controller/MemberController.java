package com.ibrahim.homework3.controller;

import com.ibrahim.homework3.dto.MemberDto;
import com.ibrahim.homework3.dto.WatchListDto;
import com.ibrahim.homework3.entity.WatchList;
import com.ibrahim.homework3.service.MemberService;
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
    public void Point(@RequestBody Long memberId, @RequestBody Long movieId, @RequestBody int point){
        memberService.givePoint(memberId, movieId, point);
    }

    @PostMapping("/watchlist")
    @ApiOperation(value = "member creates watch list from movies for himself")
    public void WatchList(@RequestBody Long memberId, @RequestBody WatchListDto watchList){
        memberService.createWatchList(memberId, watchList);
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @PutMapping("/watchList")
    @ApiOperation(value = "member adds movie in watch list")
    public void WatchList(@RequestBody Long memberId, @RequestBody Long movieId){
        memberService.addOnWatchList(memberId, movieId);
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/member")
    public void Member(@RequestBody MemberDto memberDto){
        memberService.createMember(memberDto);
    }

}
