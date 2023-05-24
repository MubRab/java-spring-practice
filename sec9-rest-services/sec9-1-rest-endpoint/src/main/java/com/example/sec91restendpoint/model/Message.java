package com.example.sec91restendpoint.model;

public class Message {

    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public static Message compose(String message) {
        Message msg = new Message();
        msg.setMessage(message);
        return msg;
    }
}
