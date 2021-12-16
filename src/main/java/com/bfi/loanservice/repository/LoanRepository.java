package com.bfi.loanservice.repository;

import com.bfi.loanservice.models.Loan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LoanRepository  extends JpaRepository<Loan,Long> {

    @Query("select l from Loan l where l.customerId =:key order by l.id desc")
    List<Loan> findByLastId(Long key);
}
