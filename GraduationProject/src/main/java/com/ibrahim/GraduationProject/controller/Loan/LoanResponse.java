package com.ibrahim.GraduationProject.controller.Loan;

import com.ibrahim.GraduationProject.service.loan.Loan;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class LoanResponse {

    private String tc;
    private String creditResult;
    private Float limit;

    public static LoanResponse convertFromLoan(Loan loan) {
        return LoanResponse.builder()
                        .tc(loan.getTc())
                        .creditResult(loan.getCreditResult())
                        .limit(loan.getLimit())
                        .build();
    }
}
