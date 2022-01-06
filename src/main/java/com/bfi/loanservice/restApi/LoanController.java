package com.bfi.loanservice.restApi;
import com.bfi.loanservice.exceptions.NotFoundException;
import com.bfi.loanservice.models.Loan;
import com.bfi.loanservice.payload.request.LoanRequest;
import com.bfi.loanservice.payload.response.MessageResponse;
import com.bfi.loanservice.repository.LoanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/loans")
public class LoanController {

    @Autowired
    LoanRepository loanRepository;


    @PostMapping("/createLoan")
    public ResponseEntity<?>  createLoan(@Valid @RequestBody LoanRequest loanRequest) {
        System.out.println("aaaaaaaaaaaaaaaaaaa");
        Loan l = new Loan( loanRequest.getLoanAmount(),
                loanRequest.getFundedAmount(),
                loanRequest.getIntRate(),
                loanRequest.getInstallment(),
                loanRequest.getRequestStatusAgent(),
                loanRequest.getIssueDate(),
                loanRequest.getStartDate(),
                loanRequest.getRequestDate(),
                loanRequest.getTerm(),
                loanRequest.getPurpose(),
                loanRequest.getLoanStatus(),
                loanRequest.getCustomerId(),
                loanRequest.getRequestStatusAnalyst());
        loanRepository.save(l);
        return ResponseEntity.ok(new MessageResponse("Loan registered successfully!"));

    }

    @GetMapping("/loans/all")
    public List<Loan> getAllLoans() {
        return loanRepository.findAll();
    }


    @GetMapping("/{id}")
    public Optional<Loan> findById(@PathVariable (value = "id") Long id) {

        return loanRepository.findById(id);
    }

    @GetMapping("/last/{key}")
    public List<Loan> findByLastId(@PathVariable (value = "key") Long key) {

        return loanRepository.findByLastId(key);
    }


    @PutMapping("/decisionAgent/{id}/{d}")
    public int decisionAgent(@PathVariable(value = "id") Long id,@PathVariable(value = "d") int d) throws NotFoundException {
        Optional<Loan> us = Optional.ofNullable(loanRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("user not Found for this id ::" + id)));
        return  loanRepository.AcceptAgent(id,d);

    }


    @PutMapping("/decisionAnalyst/{id}/{d}")
    public int decisionAnalyst(@PathVariable(value = "id") Long id,@PathVariable(value = "d") int d) throws NotFoundException {
        Optional<Loan> us = Optional.ofNullable(loanRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("user not Found for this id ::" + id)));
        return  loanRepository.AcceptAnalyste(id,d);
    }


    @GetMapping("/accepted")
    public List<Loan> getLoansAccepted() {
        return loanRepository.allLoansAccepted();
    }

    @GetMapping("/listAnalyst")
    public List<Loan> getLoansAnalyst() {
        return loanRepository.allReqAnalyst();
    }

    @GetMapping("/listAgent")
    public List<Loan> getLoansAgent() {
        return loanRepository.allReqAgent();
    }

    @GetMapping("findMulti/{key}")
    public List<Loan> findMulti(@PathVariable (value = "key") String key) {

        return loanRepository.findMulti(key);

    }

}
