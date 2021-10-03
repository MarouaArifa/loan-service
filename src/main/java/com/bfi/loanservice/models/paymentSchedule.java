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
    private double installmentAmount;
    @JsonFormat(pattern="yyyy-MM-dd")
    private Date installmentDate;
    @NotBlank
    private boolean isPaid;

    @NotBlank
    private double interestAmount;
    @NotBlank
    private int lateDays;
}
