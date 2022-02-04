package com.ibrahim.GraduationProject.service.loan;

import com.ibrahim.GraduationProject.repository.loan.LoanEntity;
import com.ibrahim.GraduationProject.repository.loan.LoanRepository;
import com.ibrahim.GraduationProject.service.user.User;
import com.ibrahim.GraduationProject.service.user.UserServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class LoanServiceImpl implements LoanService{

    private final UserServiceImpl userServiceImpl;
    private final LoanRepository loanRepository;

    @Override
    public Loan creditApplication(String tc) {
        User user = userServiceImpl.getUser(tc);
        Loan loan = creditResult(user);
        LoanEntity loanEntity = loan.convertToLoanEntity();
        loanRepository.saveAndFlush(loanEntity);
        return loan;
    }

    private Loan creditResult(User user) {
        Loan loan = new Loan();
        int creditScore = user.getCreditScore();
        float monthlyIncome = user.getMonthlyIncome();
        int creditMultiplier = 4;
        loan.setTc(user.getTc());
        if(creditScore<500){
            loan.setCreditResult("RED");
            loan.setLimit(0F);
        }else if(creditScore>=500 && creditScore<1000){
            if(monthlyIncome < 5000){
                loan.setCreditResult("ONAY");
                loan.setLimit(10000F);
            }else if(monthlyIncome >= 5000){
                loan.setCreditResult("ONAY");
                loan.setLimit(20000F);
            }
        }else{
            loan.setCreditResult("ONAY");
            loan.setLimit(monthlyIncome*creditMultiplier);
        }
        return loan;
    }
}
