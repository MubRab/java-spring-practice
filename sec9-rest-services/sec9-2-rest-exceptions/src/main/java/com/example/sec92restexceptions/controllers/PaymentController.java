package com.example.sec92restexceptions.controllers;

import com.example.sec92restexceptions.exceptions.NotEnoughMoneyException;
import com.example.sec92restexceptions.model.ErrorDetails;
import com.example.sec92restexceptions.model.PaymentDetails;
import com.example.sec92restexceptions.services.PaymentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentController {
    private final PaymentService paymentService;

    public PaymentController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    @GetMapping("/pay")
    public ResponseEntity<?> makePayment() {
        PaymentDetails paymentDetails = paymentService.processPayment();
        return ResponseEntity
                .status(HttpStatus.ACCEPTED)
                .body(paymentDetails);
    }
}
