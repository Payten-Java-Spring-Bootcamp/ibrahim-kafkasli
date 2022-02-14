package com.ibrahim.GraduationProject.service.loan;

import com.ibrahim.GraduationProject.exception.custom.EntityDontCreatedException;
import com.ibrahim.GraduationProject.exception.custom.EntityNotFoundException;
import com.ibrahim.GraduationProject.repository.loan.LoanEntity;
import com.ibrahim.GraduationProject.repository.loan.LoanRepository;
import com.ibrahim.GraduationProject.repository.user.UserEntity;
import com.ibrahim.GraduationProject.service.sms.SMSSenderServiceImpl;
import com.ibrahim.GraduationProject.service.user.User;
import com.ibrahim.GraduationProject.service.user.UserServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class LoanServiceImpl implements LoanService{

    private final UserServiceImpl userServiceImpl;
    private final LoanRepository loanRepository;
    private final SMSSenderServiceImpl smsSenderServiceImpl;

    @Override
    @Cacheable
    public Loan creditApplication(String tc){
        User user = getUser(tc);
        Loan loan = creditResult(user);
        LoanEntity loanEntity = loanRepository.saveAndFlush(loan.convertToLoanEntity());
        if(loanEntity == null){
            throw new EntityDontCreatedException("Loan Entity Don't Created");
        }
        prepareToSendSms(loan,user);
        return loan;
    }


    @Override
    @Cacheable
    public List<Loan> getApplications(String tc){
        List<LoanEntity> loanEntities =  loanRepository.getLoanEntitiesByTc(tc);
        if(loanEntities == null){
            throw new EntityNotFoundException("Loan Entity is Null");
        }
        return loanEntities.stream().map(Loan::convertFromLoanEntity).collect(Collectors.toList());
    }

    private User getUser(String tc){
        User user = userServiceImpl.getUser(tc);
        return user;
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
            return loan;
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
        if(loan == null){
            throw new EntityDontCreatedException("Loan Don't Created");
        }
        return loan;
    }

    private void prepareToSendSms(Loan loan, User user) {
        String message;
        if(loan.getCreditResult().equals("ONAY")){
            message = "Sayın "+user.getName()+" "+user.getSurName()+
                    ", kredi başvurunuz alınmıştır. Size tanımlanan kredi miktarı "
                    +loan.getLimit()+" TL'dir. Başvurunuz onay beklemektedir.";
        }else{
            message = "Sayın "+user.getName()+" "+user.getSurName()+
                    ", Kredi başvuru sonucunuz kredi puanı ve aylık gelir yetersizliğinden reddeilmiştir. ";
        }
        smsSenderServiceImpl.sendSms(user.getPhoneNumber(), message);
    }
}
