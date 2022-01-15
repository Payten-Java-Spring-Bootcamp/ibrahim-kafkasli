package com.ibrahim.homework2.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.List;

@ApiModel(value = "Member Api Entity documentation", description = "Entity")
public class Member {

    @ApiModelProperty(value = "unique id of member")
    private int id;

    @ApiModelProperty(value = "user name of member")
    private String userName;

    @ApiModelProperty(value = "watch list of member")
    private WatchList watchList;
}
