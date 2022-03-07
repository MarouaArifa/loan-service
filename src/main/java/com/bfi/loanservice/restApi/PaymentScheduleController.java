package com.bfi.loanservice.restApi;

import com.bfi.loanservice.exceptions.NotFoundException;
import com.bfi.loanservice.models.Loan;
import com.bfi.loanservice.models.paymentSchedule;
import com.bfi.loanservice.payload.request.PaymentScheduleRequest;
import com.bfi.loanservice.payload.response.MessageResponse;
import com.bfi.loanservice.repository.PaymentScheduleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

import java.sql.Date;
import java.time.LocalDate;

import java.util.List;
import java.util.Optional;


@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/paymentSchedule")
public class PaymentScheduleController {

    @Autowired
    PaymentScheduleRepository paymentRepository;



    @PostMapping("/addAnnuite")
    public ResponseEntity<?> addAnnuite(@Valid @RequestBody PaymentScheduleRequest payRequest) {

        paymentSchedule p = new paymentSchedule( payRequest.getInstallmentAmount(),
                payRequest.getAmortization(),
                payRequest.getInstallmentDate(),
                payRequest.getPrincipalAmount(),
                payRequest.getRemainigCapital(),
                payRequest.isPaid(),
                payRequest.getInterestAmount(),
                payRequest.getLateDays(),
                payRequest.getIdLoan());

                paymentRepository.save(p);
        return ResponseEntity.ok(new MessageResponse("annuite registered successfully!"));

    }


    @PutMapping("/updateIsPaid/{id}")
    public int updateIsPaid(@PathVariable(value = "id") Long id) throws NotFoundException {

        return  paymentRepository.updateIsPaid(id);

    }

    @PutMapping("/updateLateDays/{id}")
    public int updateLateDays(@PathVariable(value = "id") Long id) throws NotFoundException {

        return  paymentRepository.updateLateDays(id);
    }


    @GetMapping("findByDate")
    public List<paymentSchedule> findMulti() {


        return paymentRepository.findByDate();

    }


    @GetMapping("/findByLoan/{id}")
    public List<paymentSchedule>findByLoan(@PathVariable(value = "id") Long id) throws NotFoundException {

        return  paymentRepository.findByLoan(id);
    }


    @GetMapping("findFirst/{id}")
    public paymentSchedule findFirst(@PathVariable (value = "id") Long id) {


        return paymentRepository.findFirst(id).get(0);

    }

}
