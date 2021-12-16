package com.bfi.loanservice.repository;
import com.bfi.loanservice.models.SupportingDocumentLoan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SupportingDocRepository  extends JpaRepository<SupportingDocumentLoan,Long> {
    @Query("select d from SupportingDocumentLoan d where d.idLoan =:key ")
    List<SupportingDocumentLoan> findByIdLoan(Long key);
}
