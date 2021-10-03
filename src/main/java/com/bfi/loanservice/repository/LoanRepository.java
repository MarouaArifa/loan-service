package com.bfi.loanservice.repository;

import com.bfi.loanservice.models.Loan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoanRepository  extends JpaRepository<Loan,Long> {
}
