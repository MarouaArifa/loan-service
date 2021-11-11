package com.bfi.loanservice.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

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

    private int requestStatusAgent;

    private int requestStatusAnalyst;

    @JsonFormat(pattern="yyyy-MM-dd")
    private Date issueDate;

    @JsonFormat(pattern="yyyy-MM-dd")
    private Date startDate;

    @JsonFormat(pattern="yyyy-MM-dd")
    private Date requestDate;

    private Long term; //duree

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

    @OneToMany (mappedBy="idLoan")
    private Set<paymentSchedule> amortizationTable;


    public Loan(double loanAmount, double fundedAmount, double intRate, double installment, int requestStatusAgent, Date issueDate, Date startDate, Date requestDate, Long term, Purpose purpose, LoanStatus loanStatus, Long customerId,int requestStatusAnalyst) {
        this.loanAmount = loanAmount;
        this.fundedAmount = fundedAmount;
        this.intRate = intRate;
        this.installment = installment;
        this.requestStatusAgent = requestStatusAgent;
        this.issueDate = issueDate;
        this.startDate = startDate;
        this.requestDate = requestDate;
        this.term = term;
        this.purpose = purpose;
        this.loanStatus = loanStatus;
        this.customerId = customerId;
        this.requestStatusAnalyst = requestStatusAnalyst;
    }


    public int getRequestStatusAnalyst() {
        return requestStatusAnalyst;
    }

    public void setRequestStatusAnalyst(int requestStatusAnalyst) {
        this.requestStatusAnalyst = requestStatusAnalyst;
    }

    public int getRequestStatusAgent() {
        return requestStatusAgent;
    }

    public void setRequestStatusAgent(int requestStatusAgent) {
        this.requestStatusAgent = requestStatusAgent;
    }

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

    public Date getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(Date issueDate) {
        this.issueDate = issueDate;
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

    public Set<paymentSchedule> getAmortizationTable() {
        return amortizationTable;
    }

    public void setAmortizationTable(Set<paymentSchedule> amortizationTable) {
        this.amortizationTable = amortizationTable;
    }
}

