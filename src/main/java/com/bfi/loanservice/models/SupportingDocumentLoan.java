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
    @Size(max = 60)
    private String type;
    @NotBlank
    @Size(max = 200)
    private String path;
    @ManyToOne
    private Customer customer;

    public SupportingDocumentLoan(String type, String path, Customer customer) {
        this.type = type;
        this.path = path;
        this.customer = customer;
    }
}
