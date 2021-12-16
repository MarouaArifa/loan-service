package com.bfi.loanservice.payload.request;

import com.bfi.loanservice.models.Loan;
import lombok.Data;

import java.util.Date;

@Data
public class PaymentScheduleRequest {
    private Long id;

    private double installmentAmount; //annuite

    private double amortization; //rembourse

    private Date installmentDate; // date paiement de chaque annuite

    private double principalAmount; //capital initial

    private double remainigCapital; //capital final
    private boolean isPaid;

    private double interestAmount; // dont interet
    private int lateDays;

    private Long idLoan;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getInstallmentAmount() {
        return installmentAmount;
    }

    public void setInstallmentAmount(double installmentAmount) {
        this.installmentAmount = installmentAmount;
    }

    public double getAmortization() {
        return amortization;
    }

    public void setAmortization(double amortization) {
        this.amortization = amortization;
    }

    public Date getInstallmentDate() {
        return installmentDate;
    }

    public void setInstallmentDate(Date installmentDate) {
        this.installmentDate = installmentDate;
    }

    public double getPrincipalAmount() {
        return principalAmount;
    }

    public void setPrincipalAmount(double principalAmount) {
        this.principalAmount = principalAmount;
    }

    public double getRemainigCapital() {
        return remainigCapital;
    }

    public void setRemainigCapital(double remainigCapital) {
        this.remainigCapital = remainigCapital;
    }

    public boolean isPaid() {
        return isPaid;
    }

    public void setPaid(boolean paid) {
        isPaid = paid;
    }

    public double getInterestAmount() {
        return interestAmount;
    }

    public void setInterestAmount(double interestAmount) {
        this.interestAmount = interestAmount;
    }

    public int getLateDays() {
        return lateDays;
    }

    public void setLateDays(int lateDays) {
        this.lateDays = lateDays;
    }

    public Long getIdLoan() {
        return idLoan;
    }

    public void setIdLoan(Long idLoan) {
        this.idLoan = idLoan;
    }
}
