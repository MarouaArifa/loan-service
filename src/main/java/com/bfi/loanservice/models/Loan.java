package com.bfi.loanservice.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
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

    private boolean requestStatus;

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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(double loanAmount) {
        this.loanAmount = loanAmount;
    }

    public double getFundedAmount() {
        return fundedAmount;
    }

    public void setFundedAmount(double fundedAmount) {
        this.fundedAmount = fundedAmount;
    }

    public double getIntRate() {
        return intRate;
    }

    public void setIntRate(double intRate) {
        this.intRate = intRate;
    }

    public double getInstallment() {
        return installment;
    }

    public void setInstallment(double installment) {
        this.installment = installment;
    }

    public Date getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(Date issueDate) {
        this.issueDate = issueDate;
    }

    public PaymentPlan getPaymentPlan() {
        return paymentPlan;
    }

    public void setPaymentPlan(PaymentPlan paymentPlan) {
        this.paymentPlan = paymentPlan;
    }

    public Purpose getPurpose() {
        return purpose;
    }

    public void setPurpose(Purpose purpose) {
        this.purpose = purpose;
    }

    public LoanStatus getLoanStatus() {
        return loanStatus;
    }

    public void setLoanStatus(LoanStatus loanStatus) {
        this.loanStatus = loanStatus;
    }

    public HomeOwnership getHomeOwnership() {
        return homeOwnership;
    }

    public void setHomeOwnership(HomeOwnership homeOwnership) {
        this.homeOwnership = homeOwnership;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }
}
