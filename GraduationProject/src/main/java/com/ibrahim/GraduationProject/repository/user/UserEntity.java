package com.ibrahim.GraduationProject.repository.user;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name = "user")
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String tc;

    private String name;

    private String surName;

    private String monthlyIncome;

    private String phoneNumber;

    private int creditScore;

}
