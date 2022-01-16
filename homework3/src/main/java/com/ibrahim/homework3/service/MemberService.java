package com.ibrahim.homework3.service;

import com.ibrahim.homework3.dto.MemberDto;
import com.ibrahim.homework3.dto.WatchListDto;
import com.ibrahim.homework3.entity.Member;
import com.ibrahim.homework3.entity.Movie;
import com.ibrahim.homework3.entity.WatchList;
import com.ibrahim.homework3.repository.MemberRepository;
import com.ibrahim.homework3.repository.MovieRepository;
import com.ibrahim.homework3.repository.WatchListRepository;
import com.ibrahim.homework3.service.impl.MemberServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MemberService implements MemberServiceImpl {

    private final MovieRepository movieRepository;
    private final MemberRepository memberRepository;
    private final WatchListRepository watchListRepository;

    @Override
    public void givePoint(Long memberId, Long movieId, int point) {
        Movie movie = movieRepository.getById(movieId);
        movie.setPoint((movie.getPoint()+point)/2);
        movieRepository.save(movie);
    }

    @Override
    public void createWatchList(Long memberId, WatchListDto watchListDto) {
        Member member = memberRepository.getById(memberId);
        member.setWatchListId(watchListDto.getWatchListId());
        WatchList watchList = WatchList.builder().watchList(watchListDto.getWatchList()).build();
        memberRepository.save(member);
        watchListRepository.save(watchList);
    }

    @Override
    public void addOnWatchList(Long memberId, Long movieId) {
        Member member = memberRepository.getById(memberId);
        WatchList watchList = watchListRepository.getById(member.getWatchListId());
        watchList.getWatchList().add(movieRepository.getById(movieId));
        watchListRepository.save(watchList);
    }

    @Override
    public void createMember(MemberDto memberDto) {
        Member member = Member.builder().userName(memberDto.getUserName()).build();
        memberRepository.save(member);
    }
}
