package com.bfi.loanservice.payload.request;

import com.bfi.loanservice.models.Loan;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
@Data
public class SupportingDocRequest {

    private Long id;
    private String type;
    private String path;
    private Long idLoan;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public Long getLoan() {
        return idLoan;
    }

    public void setLoan(Long idLoan) {
        this.idLoan = idLoan;
    }
}
