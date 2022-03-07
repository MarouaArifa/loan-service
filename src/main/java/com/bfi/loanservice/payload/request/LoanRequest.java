package com.bfi.loanservice.payload.request;

import com.bfi.loanservice.models.HomeOwnership;
import com.bfi.loanservice.models.LoanStatus;
import com.bfi.loanservice.models.Purpose;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

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
    private double dti;

    private Date issueDate;
    private Date startDate;

    private Long term;

    private Purpose purpose;

    private LoanStatus loanStatus;
    private Date requestDate;

    private HomeOwnership homeOwnership;
    private int requestStatusAgent;

    private int requestStatusAnalyst;

    private Long customerId;


    public Date getRequestDate() {
        return requestDate;
    }

    public void setRequestDate(Date requestDate) {
        this.requestDate = requestDate;
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

    public double getDti() {
        return dti;
    }

    public void setDti(double dti) {
        this.dti = dti;
    }

    public Date getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(Date issueDate) {
        this.issueDate = issueDate;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Long getTerm() {
        return term;
    }

    public void setTerm(Long term) {
        this.term = term;
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


    public int getRequestStatusAgent() {
        return requestStatusAgent;
    }

    public void setRequestStatusAgent(int requestStatusAgent) {
        this.requestStatusAgent = requestStatusAgent;
    }

    public int getRequestStatusAnalyst() {
        return requestStatusAnalyst;
    }

    public void setRequestStatusAnalyst(int requestStatusAnalyst) {
        this.requestStatusAnalyst = requestStatusAnalyst;
    }
}

