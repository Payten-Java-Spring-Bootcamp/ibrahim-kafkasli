package com.ibrahim.GraduationProject.service.loan;

import com.ibrahim.GraduationProject.repository.loan.LoanEntity;
import com.ibrahim.GraduationProject.service.user.User;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Loan {

    private String tc;
    private String creditResult;
    private Float limit;

    public LoanEntity convertToLoanEntity() {
        LoanEntity loanEntity = new LoanEntity();
        loanEntity.setTc(tc);
        loanEntity.setCreditResult(creditResult);
        loanEntity.setCreditLimit(limit);
        return loanEntity;
    }
}
