package com.example.sec92restexceptions.model;

public class PaymentDetails {
    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    private double amount;
    private String id;
}
