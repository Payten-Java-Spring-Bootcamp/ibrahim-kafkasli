package com.ibrahim.homework3.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class MemberDto {

    private Long id;

    private String userName;

    private int watchListId;

}
