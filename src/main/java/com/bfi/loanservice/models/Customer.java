package com.bfi.loanservice.models;

import javax.persistence.OneToMany;

public class Customer {
    @OneToMany(mappedBy="customerId")
    private Long id;

}
