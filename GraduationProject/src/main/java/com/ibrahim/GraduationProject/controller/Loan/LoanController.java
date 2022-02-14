package com.ibrahim.GraduationProject.controller.Loan;

import com.ibrahim.GraduationProject.exception.custom.EntityDontCreatedException;
import com.ibrahim.GraduationProject.exception.custom.EntityNotFoundException;
import com.ibrahim.GraduationProject.service.loan.Loan;
import com.ibrahim.GraduationProject.service.loan.LoanServiceImpl;
import io.swagger.annotations.*;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequiredArgsConstructor
@Api(value = "Loan Api Doc")
public class LoanController {

    private final LoanServiceImpl loanServiceImpl;

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/loan/{tc}")
    @ApiOperation(value = "Loan Request Function", notes = "This method creates new loan request and returns loan request result")
    public @ApiResponse(code = 201, message = "Containing some model fields")
    LoanResponse loanRequest(@PathVariable @ApiParam(value = "Turkish republic identification number") String tc){
        Loan loan = loanServiceImpl.creditApplication(tc);
        return LoanResponse.convertFromLoan(loan);
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/user/loan/{tc}")
    @ApiOperation(value = "Loan Receive Function", notes = "This method returns all loan request by tc")
    public @ApiResponse(code = 200, message = "Containing some model fields") List<LoanResponse> getApplications(@PathVariable @ApiParam(value = "Turkey Id") String tc){
        List<Loan> loans = loanServiceImpl.getApplications(tc);
        return loans.stream().map(loan -> LoanResponse.convertFromLoan(loan)).collect(Collectors.toList());
    }
}
