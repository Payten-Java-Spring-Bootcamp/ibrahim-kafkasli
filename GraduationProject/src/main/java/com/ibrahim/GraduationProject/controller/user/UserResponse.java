package com.ibrahim.GraduationProject.controller.user;

import com.ibrahim.GraduationProject.service.user.User;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Builder
public class UserResponse {
    private String tc;

    private String name;

    private String surName;

    public static UserResponse convertFromUser(User user) {
        return UserResponse.builder()
                .tc(user.getTc())
                .name(user.getName())
                .surName(user.getSurName())
                .build();
    }
}
