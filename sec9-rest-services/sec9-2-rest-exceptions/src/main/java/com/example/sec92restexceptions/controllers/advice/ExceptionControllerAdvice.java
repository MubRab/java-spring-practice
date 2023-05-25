package com.example.sec92restexceptions.controllers.advice;

import com.example.sec92restexceptions.exceptions.NotEnoughMoneyException;
import com.example.sec92restexceptions.model.ErrorDetails;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionControllerAdvice {
    @ExceptionHandler(NotEnoughMoneyException.class)
    public ResponseEntity<ErrorDetails> exceptionNotEnoughMoneyHandler() {
        ErrorDetails errorDetails = new ErrorDetails();
        errorDetails.setMessage("Not enough funds");
        return ResponseEntity
                .badRequest()
                .body(errorDetails);
    }
}
