package com.ibrahim.GraduationProject.service.user;

import com.ibrahim.GraduationProject.repository.user.UserEntity;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class User {

    private String tc;

    private String name;

    private String surName;

    private float monthlyIncome;

    private String phoneNumber;

    private int creditScore;

    public static User convertFromUserEntity(UserEntity userEntity) {
        return User.builder()
                    .tc(userEntity.getTc())
                    .name(userEntity.getName())
                    .surName(userEntity.getSurName())
                    .monthlyIncome(userEntity.getMonthlyIncome())
                    .phoneNumber(userEntity.getPhoneNumber())
                    .creditScore(userEntity.getCreditScore())
                    .build();
    }

    public UserEntity convertToUserEntity() {
        UserEntity userEntity = new UserEntity();
        userEntity.setTc(tc);
        userEntity.setName(name);
        userEntity.setSurName(surName);
        userEntity.setMonthlyIncome(monthlyIncome);
        userEntity.setPhoneNumber(phoneNumber);
        userEntity.setCreditScore(creditScore);

        return userEntity;
    }
}
