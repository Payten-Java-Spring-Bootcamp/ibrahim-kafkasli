package com.ibrahim.GraduationProject.repository.loan;

import com.ibrahim.GraduationProject.repository.user.UserEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@ApiModel(value = "User Model Class", description = "This model has some fields for loan")
@Table(name = "loan_applications")
public class LoanEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ApiModelProperty(value = "Loan Model Identifier Field")
    private Long Id;

    @ApiModelProperty(value = "Loan Model TC Field")
    private String tc;

    @ApiModelProperty(value = "Loan Model Credit Result Field")
    private String creditResult;

    @ApiModelProperty(value = "Loan Model Credit Limit Field")
    private Float creditLimit;
}
