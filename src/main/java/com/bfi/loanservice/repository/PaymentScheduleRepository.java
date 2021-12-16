package com.bfi.loanservice.repository;

import com.bfi.loanservice.models.paymentSchedule;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentScheduleRepository extends JpaRepository<paymentSchedule,Long> {
}
