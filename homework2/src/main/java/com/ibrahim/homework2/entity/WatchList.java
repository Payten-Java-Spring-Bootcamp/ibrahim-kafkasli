package com.ibrahim.homework2.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Builder
public class WatchList {
    private int memberId;
    private int watchListId;
    private List<String> watchList;
}
