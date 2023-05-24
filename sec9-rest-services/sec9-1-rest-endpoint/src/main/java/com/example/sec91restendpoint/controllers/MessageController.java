package com.example.sec91restendpoint.controllers;

import com.example.sec91restendpoint.model.Message;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * This controller sends a Message object
 */

@RestController
public class MessageController {
    @GetMapping("/sms")
    public ResponseEntity<Message> sms() {
        Message s = Message.compose("This is an SMS");
        return ResponseEntity
                .status(HttpStatus.ACCEPTED)
                .header("user","John")
                .header("type","SMS")
                .body(s);
    }

    @GetMapping("/tweet")
    public ResponseEntity<Message> tweet() {
        Message t = Message.compose("This is a tweet");
        return ResponseEntity
                .status(HttpStatus.ACCEPTED)
                .header("user","Jane")
                .header("type","Tweet")
                .body(t);

    }

    @GetMapping("/all")
    public List<?> all() {
        return List.of(Message.compose("This is an SMS"), Message.compose("This is a tweet"));
    }
}
