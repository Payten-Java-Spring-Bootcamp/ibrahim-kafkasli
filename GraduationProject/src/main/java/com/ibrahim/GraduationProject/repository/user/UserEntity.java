package com.ibrahim.GraduationProject.repository.user;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name = "users")
@ApiModel(value = "User Model Class", description = "This model has some fields for user")
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ApiModelProperty(value = "User Model Identifier Field")
    private Long id;

    @ApiModelProperty(value = "User Model Customer Turkish Republic Identification Number Field")
    private String tc;

    @ApiModelProperty(value = "User Model Customer Name Field")
    private String name;

    @ApiModelProperty(value = "User Model Customer Surname Field")
    private String surName;

    @ApiModelProperty(value = "User Model Customer Monthly Income Field")
    private float monthlyIncome;

    @ApiModelProperty(value = "User Model Customer Phone Number Field")
    private String phoneNumber;

    @ApiModelProperty(value = "User Model Customer Credit Score Field")
    private int creditScore;

}
