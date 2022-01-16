package com.ibrahim.homework3.service.impl;

import com.ibrahim.homework3.dto.WatchListDto;
import com.ibrahim.homework3.entity.WatchList;

public interface MemberServiceImpl {

    void givePoint(Long memberId, Long movieId, int point);
    void createWatchList(Long memberId, WatchListDto watchList);
    void addOnWatchList(Long memberId, Long movieId);
}
