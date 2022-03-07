package com.bfi.loanservice.repository;

import com.bfi.loanservice.models.Loan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public interface LoanRepository  extends JpaRepository<Loan,Long> {

    @Query("select l from Loan l where l.customerId =:key order by l.id desc")
    List<Loan> findByLastId(Long key);


    @Query("select l from Loan l where l.customerId =:key")
    List<Loan> findByIdCustomer(Long key);


    @Modifying
    @Transactional
    @Query("update Loan l set l.requestStatusAgent =:d where l.id =:id ")
    int AcceptAgent(Long id,int d);

    @Modifying
    @Transactional
    @Query("update Loan l set l.requestStatusAnalyst =:d where l.id =:id ")
    int AcceptAnalyste(Long id,int d);

    @Query("select l from Loan l where l.requestStatusAgent = 0 and l.requestStatusAnalyst = 0 ")
    List<Loan> allReqAgent();

    @Query("select l from Loan l where l.requestStatusAgent = 1 and l.requestStatusAnalyst = 0 ")
    List<Loan> allReqAnalyst();


    @Query("select l from Loan l where l.requestStatusAgent = 1 and l.requestStatusAnalyst = 1 ")
    List<Loan> allLoansAccepted();

    @Query("select l from Loan l where cast( l.customerId as string) like %:key%  or cast( l.startDate as string) like %:key%")
    List<Loan> findMulti(String key);



}
