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

    @NotBlank
    private double installmentAmount; //annuite

    @NotBlank
    private double amortization; //rembourse

    @JsonFormat(pattern="yyyy-MM-dd")
    private Date installmentDate; // date paiement de chaque annuite

    @NotBlank
    private double principalAmount; //capital initial

    @NotBlank
    private double remainigCapital; //capital final
    @NotBlank
    private boolean isPaid;

    @NotBlank
    private double interestAmount; // dont interet
    @NotBlank
    private int lateDays;


    @ManyToOne(cascade = CascadeType.ALL)
    private Loan idLoan;
}
