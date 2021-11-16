package com.bfi.loanservice.payload.request;

import com.bfi.loanservice.models.Customer;
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
@NoArgsConstructor
@AllArgsConstructor
public class SupportingDocRequest {

    private Long id;
    @NotBlank
    @Size(max = 60)
    private String type;
    @NotBlank
    @Size(max = 200)
    private String path;
    @ManyToOne
    private Customer customer;


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

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
