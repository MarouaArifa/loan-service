package com.bfi.loanservice.restApi;

import com.bfi.loanservice.models.SupportingDocumentLoan;
import com.bfi.loanservice.payload.request.SupportingDocRequest;
import com.bfi.loanservice.payload.response.MessageResponse;
import com.bfi.loanservice.repository.SupportingDocRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;
import java.util.regex.Pattern;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/supportingLoan")
public class SupportingDocController {

    @Autowired
    SupportingDocRepository docRepository;

    @PostMapping("/addDocLoan")
    public ResponseEntity<?> addDocLoan(@Valid @RequestBody SupportingDocRequest docRequest) {
        System.out.println("aaaaaaaaaaaaaaaaaaa");
        System.out.println("uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu"+docRequest.getType());
        String[] tab = docRequest.getType().split(Pattern.quote("|"));
        System.out.println("taaaaaaaaaaaaaaaaaaaaaaaab 0 "+tab[0]);
        System.out.println("taaaaaaaaaaaaaaaaaaaaaaab 1  "+tab[1]);
        docRequest.setType(tab[0]);
        docRequest.setLoan(Long.valueOf( tab[1]));

        SupportingDocumentLoan d = new SupportingDocumentLoan(
                docRequest.getType(),
                docRequest.getPath(),
                docRequest.getLoan());
                docRepository.save(d);
        return ResponseEntity.ok(new MessageResponse("Documents registered successfully!"));

    }


    @GetMapping("findByIdLoan/{key}")
    public List<SupportingDocumentLoan> findByIdLoan(@PathVariable (value = "key") Long key) {

        return docRepository.findByIdLoan(key);

    }

    @GetMapping("/findById/{id}")
    public Optional<SupportingDocumentLoan> findById(@PathVariable (value = "id") Long id) {

        return docRepository.findById(id);

    }

}
