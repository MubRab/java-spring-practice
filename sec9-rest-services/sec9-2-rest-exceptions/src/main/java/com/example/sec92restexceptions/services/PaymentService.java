package com.example.sec92restexceptions.services;

import com.example.sec92restexceptions.exceptions.NotEnoughMoneyException;
import com.example.sec92restexceptions.model.PaymentDetails;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {
    public PaymentDetails processPayment() {
        throw new NotEnoughMoneyException();
    }
}
