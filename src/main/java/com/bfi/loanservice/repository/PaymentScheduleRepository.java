package com.bfi.loanservice.repository;

import com.bfi.loanservice.models.paymentSchedule;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.sql.Date;
import java.util.List;
import java.util.Optional;

@Repository
public interface PaymentScheduleRepository extends JpaRepository<paymentSchedule,Long> {


    @Modifying
    @Transactional
    @Query("update paymentSchedule p set p.isPaid = true where p.id =:id ")
    int updateIsPaid(Long id);

    @Modifying
    @Transactional
    @Query("update paymentSchedule p set p.lateDays =DATEDIFF(SYSDATE(), p.installmentDate) where p.id =:id ")
    int updateLateDays(Long id);


   @Query("select p from paymentSchedule p where p.installmentDate <=SYSDATE() and p.isPaid = false ORDER BY p.installmentDate ASC")
    List<paymentSchedule> findByDate();

   /* @Query("select p from paymentSchedule p where p.installmentDate <= cast ( :key as date) and p.isPaid = false")
    List<paymentSchedule> findByDate(String key);
*/


       @Query("select  p from paymentSchedule p where  p.isPaid = false and p.idLoan =:id order by p.installmentDate ASC")
       List<paymentSchedule> findFirst(Long id);


    @Query("select  p from paymentSchedule p where   p.idLoan =:id")
    List<paymentSchedule> findByLoan(Long id);




}
