package com.ibrahim.GraduationProject.service.loan;


import java.util.List;

public interface LoanService {

    Loan creditApplication(String tc);
    List<Loan> getApplications(String tc);
}
