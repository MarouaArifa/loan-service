package com.bfi.loanservice.restApi;

import com.bfi.loanservice.models.SupportingDocumentLoan;
import com.bfi.loanservice.payload.request.SupportingDocRequest;
import com.bfi.loanservice.payload.response.MessageResponse;
import com.bfi.loanservice.repository.SupportingDocRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/supportingLoan")
public class SupportingDocController {

    @Autowired
    SupportingDocRepository docRepository;

    @PostMapping("/addDocLoan")
    public ResponseEntity<?> addDocLoan(@Valid @RequestBody SupportingDocRequest docRequest) {
        System.out.println("aaaaaaaaaaaaaaaaaaa");
        SupportingDocumentLoan d = new SupportingDocumentLoan(
                docRequest.getType(),
                docRequest.getPath(),
                docRequest.getCustomer());
                docRepository.save(d);
        return ResponseEntity.ok(new MessageResponse("Documents registered successfully!"));

    }




}
