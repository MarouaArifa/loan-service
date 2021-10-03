package com.bfi.loanservice.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "evals")
public class EvalFroid {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String suivreFormation;
    private String repondAuBesoin ;
    private String linitiative;
    private String mettreEnPratique;
    private String frequence;
    private String aQuoiDu ;
    private String favoriserLaMise;
    private String euEntratien ;
    private String Remarque;
    private Long userId;
}
