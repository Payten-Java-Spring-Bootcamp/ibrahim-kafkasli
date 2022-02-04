package com.ibrahim.GraduationProject.repository.loan;

import com.ibrahim.GraduationProject.repository.user.UserEntity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table
public class LoanEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    private String tc;

    private String creditResult;

    private Float creditLimit;
}
