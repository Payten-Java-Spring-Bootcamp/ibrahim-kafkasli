package com.ibrahim.GraduationProject.controller.user;

import com.ibrahim.GraduationProject.service.user.User;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import org.springframework.lang.Nullable;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;
import java.util.Random;

@Getter
@Setter
@EqualsAndHashCode(of = "tc")
public class UserRequest {

    @NotBlank
    private String tc;

    @NotBlank
    private String name;

    @NotBlank
    private String surName;

    @NotNull
    private float monthlyIncome;

    @NotBlank
    private String phoneNumber;

    @Nullable
    private int creditScore;


    public User convertToUser() {
        Random r = new Random();
        this.creditScore = r.nextInt(2001);
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
