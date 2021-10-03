package com.bfi.loanservice.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(	name = "loans")
public class Loan {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private double loanAmount;

    private double fundedAmount;

    private double intRate;

    private double installment;

    @JsonFormat(pattern="yyyy-MM-dd")
    private Date issueDate;

    @Enumerated(EnumType.STRING)
    @Column(length = 20)
    private PaymentPlan paymentPlan;

    @Enumerated(EnumType.STRING)
    @Column(length = 20)
    private Purpose purpose;

    @Enumerated(EnumType.STRING)
    @Column(length = 20)
    private LoanStatus loanStatus;

    @Enumerated(EnumType.STRING)
    @Column(length = 20)
    private HomeOwnership homeOwnership;

    private Long customerId;


    public Loan(double loanAmount, double fundedAmount, double intRate, double installment, Date issueDate, PaymentPlan paymentPlan, Purpose purpose, LoanStatus loanStatus, HomeOwnership homeOwnership, Long customerId) {


        this.loanAmount=loanAmount;
        this.fundedAmount=fundedAmount;
        this.intRate=intRate;
        this.installment=installment;
        this.issueDate=issueDate;
        this.paymentPlan=paymentPlan;
        this.purpose=purpose;
        this.loanStatus=loanStatus;
        this.homeOwnership=homeOwnership;
        this.customerId=customerId;

    }
}
