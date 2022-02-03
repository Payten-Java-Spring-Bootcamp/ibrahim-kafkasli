package com.ibrahim.GraduationProject.controller.user;

import com.ibrahim.GraduationProject.service.user.User;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Null;
import java.util.Random;

@Getter
@Setter
public class UserRequest {

    @NotBlank
    private String tc;

    @NotBlank
    private String name;

    @NotBlank
    private String surName;

    @NotBlank
    private String monthlyIncome;

    @NotBlank
    private String phoneNumber;

    @Null
    private int creditScore;


    public User convertToUser() {
        Random r = new Random();
        this.creditScore = r.nextInt(101);
        return User.builder()
                .tc(tc)
                .name(name)
                .surName(surName)
                .monthlyIncome(monthlyIncome)
                .phoneNumber(phoneNumber)
                .creditScore(creditScore)
                .build();
    }
}
