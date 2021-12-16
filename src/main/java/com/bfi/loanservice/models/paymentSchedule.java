package com.bfi.loanservice.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.Date;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "paymentSchedule")
public class paymentSchedule {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private double installmentAmount; //annuite


    private double amortization; //rembourse

    @JsonFormat(pattern="yyyy-MM-dd")
    private Date installmentDate; // date paiement de chaque annuite


    private double principalAmount; //capital initial


    private double remainigCapital; //capital final

    private boolean isPaid;


    private double interestAmount; // dont interet

    private int lateDays;


    private Long idLoan;


    public paymentSchedule(double installmentAmount, double amortization, Date installmentDate, double principalAmount, double remainigCapital, boolean isPaid, double interestAmount, int lateDays, Long idLoan) {
        this.installmentAmount = installmentAmount;
        this.amortization = amortization;
        this.installmentDate = installmentDate;
        this.principalAmount = principalAmount;
        this.remainigCapital = remainigCapital;
        this.isPaid = isPaid;
        this.interestAmount = interestAmount;
        this.lateDays = lateDays;
        this.idLoan = idLoan;
    }
}
