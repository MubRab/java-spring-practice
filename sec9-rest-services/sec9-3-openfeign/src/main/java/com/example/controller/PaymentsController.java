package com.example.controller;

import com.example.model.Payment;
import com.example.proxy.PaymentsProxy;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
public class PaymentsController {
    private final PaymentsProxy paymentsProxy;

    public PaymentsController(PaymentsProxy paymentsProxy) {
        this.paymentsProxy = paymentsProxy;
    }

    @PostMapping("/receive")
    public Payment receivePayment(@RequestBody Payment payment) {
        String reqID = UUID.randomUUID().toString();
        return paymentsProxy.receivePayment(reqID, payment);
    }
}
