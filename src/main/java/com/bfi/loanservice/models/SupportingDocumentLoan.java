package com.bfi.loanservice.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(	name = "supportingDocumentLoan")
public class SupportingDocumentLoan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank
    private String type;
    @NotBlank
    private String path;


    private Long idLoan;

    public SupportingDocumentLoan(String type, String path, Long idLoan) {
        this.type = type;
        this.path = path;
        this.idLoan = idLoan;
    }
}
