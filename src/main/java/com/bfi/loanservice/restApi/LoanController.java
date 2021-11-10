package com.bfi.loanservice.restApi;

import com.bfi.loanservice.models.Customer;
import com.bfi.loanservice.models.Loan;
import com.bfi.loanservice.payload.request.LoanRequest;
import com.bfi.loanservice.payload.response.MessageResponse;
import com.bfi.loanservice.repository.LoanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/loans")
public class LoanController {

    @Autowired
    LoanRepository loanRepository;


    @PostMapping("createLoan")
    public ResponseEntity<?>  createLoan(@Valid @RequestBody LoanRequest loanRequest) {
        System.out.println("aaaaaaaaaaaaaaaaaaa");
        Loan l = new Loan( loanRequest.getLoanAmount(),
                loanRequest.getFundedAmount(),
                loanRequest.getIntRate(),
                loanRequest.getInstallment(),
                loanRequest.getRequestStatus(),
                loanRequest.getIssueDate(),
                loanRequest.getStartDate(),
                loanRequest.getRequestDate(),
                loanRequest.getTerm(),
                loanRequest.getPurpose(),
                loanRequest.getLoanStatus(),
                loanRequest.getCustomerId());
       // l.setCustomerId(id);
        loanRepository.save(l);
        return ResponseEntity.ok(new MessageResponse("Loan registered successfully!"));

    }

    @GetMapping("/loans/all")
    public Iterable<Loan> getAllLoans() {
        return loanRepository.findAll();
    }

}
