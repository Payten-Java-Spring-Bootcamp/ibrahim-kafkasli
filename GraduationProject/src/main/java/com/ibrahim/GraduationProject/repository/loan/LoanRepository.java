package com.ibrahim.GraduationProject.repository.loan;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LoanRepository extends JpaRepository<LoanEntity, Long> {

    List<LoanEntity> getLoanEntitiesByTc(String tc);
}
