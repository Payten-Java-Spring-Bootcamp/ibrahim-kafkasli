package com.ibrahim.GraduationProject.repository.user;

import com.ibrahim.GraduationProject.repository.loan.LoanEntity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name = "users")
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String tc;

    private String name;

    private String surName;

    private float monthlyIncome;

    private String phoneNumber;

    private int creditScore;

}
