package com.example.sec92restexceptions.controllers;

import com.example.sec92restexceptions.exceptions.NotEnoughMoneyException;
import com.example.sec92restexceptions.model.ErrorDetails;
import com.example.sec92restexceptions.model.PaymentDetails;
import com.example.sec92restexceptions.services.PaymentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;
import java.util.UUID;
import java.util.logging.Logger;

@RestController
public class PaymentController {
    private final PaymentService paymentService;
    private static Logger logger = Logger.getLogger(PaymentController.class.getName());

    public PaymentController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    @PostMapping("/pay")
    public ResponseEntity<?> makePayment() {
        PaymentDetails paymentDetails = paymentService.processPayment();
        return ResponseEntity
                .status(HttpStatus.ACCEPTED)
                .body(paymentDetails);
    }

    @PostMapping("/receive")
    public ResponseEntity<?> receivePayment(@RequestHeader String reqID, @RequestBody PaymentDetails paymentDetails) {
        Currency rands = Currency.getInstance(new Locale("en", "ZA"));
        logger.info("Received request with ID: " + reqID + ". Received amount: " + NumberFormat.getCurrencyInstance().format(paymentDetails.getAmount()));
        paymentDetails.setId(UUID.randomUUID().toString());
        return ResponseEntity
                .status(HttpStatus.ACCEPTED)
                .header("reqID", reqID)
                .body(paymentDetails);
    }
}
