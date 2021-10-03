package com.bfi.loanservice.payload.request;

import com.bfi.loanservice.models.HomeOwnership;
import com.bfi.loanservice.models.LoanStatus;
import com.bfi.loanservice.models.PaymentPlan;
import com.bfi.loanservice.models.Purpose;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class LoanRequest {

    private Long id;


    private double loanAmount;

    private double fundedAmount;


    private double intRate;


    private double installment;

    private Date issueDate;

    private PaymentPlan paymentPlan;

    private Purpose purpose;

    private LoanStatus loanStatus;

    private HomeOwnership homeOwnership;

    private Long customerId;

}
