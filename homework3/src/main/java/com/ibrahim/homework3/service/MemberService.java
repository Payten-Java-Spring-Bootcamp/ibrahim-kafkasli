package com.ibrahim.homework3.service;

import com.ibrahim.homework3.dto.WatchListDto;
import com.ibrahim.homework3.entity.Member;
import com.ibrahim.homework3.entity.Movie;
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
    }

    @Override
    public void createWatchList(Long memberId, WatchListDto watchList) {
        Member member = memberRepository.findById(memberId);

    }

    @Override
    public void addOnWatchList(Long memberId, Long movieId) {

    }
}
