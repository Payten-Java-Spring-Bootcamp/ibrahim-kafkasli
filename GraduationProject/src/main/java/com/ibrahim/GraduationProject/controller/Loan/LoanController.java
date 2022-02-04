package com.ibrahim.GraduationProject.controller.Loan;

import com.ibrahim.GraduationProject.service.loan.Loan;
import com.ibrahim.GraduationProject.service.loan.LoanServiceImpl;
import com.ibrahim.GraduationProject.service.user.User;
import com.ibrahim.GraduationProject.service.user.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class LoanController {

    private final LoanServiceImpl loanServiceImpl;

    @PostMapping("/loan/{tc}")
    public LoanResponse loanRequest(@PathVariable String tc){
        Loan loan = loanServiceImpl.creditApplication(tc);
        return LoanResponse.convertFromLoan(loan);
    }
}
