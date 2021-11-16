package com.bfi.loanservice.repository;
import com.bfi.loanservice.models.SupportingDocumentLoan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SupportingDocRepository  extends JpaRepository<SupportingDocumentLoan,Long> {
}
