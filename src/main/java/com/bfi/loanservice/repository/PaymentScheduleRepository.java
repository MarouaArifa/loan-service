package com.bfi.loanservice.repository;

import com.bfi.loanservice.models.paymentSchedule;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface PaymentScheduleRepository extends JpaRepository<paymentSchedule,Long> {


    @Modifying
    @Transactional
    @Query("update paymentSchedule p set p.isPaid = true where p.id =:id ")
    int updateIsPaid(Long id);

    @Modifying
    @Transactional
    @Query("update paymentSchedule p set p.lateDays =:d where p.id =:id ")
    int updateLateDays(Long id,int d);



}
