package com.example.model;

public class Payment {
    private String id;
    private double amount;

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getID() {
        return this.id;
    }

    public void setID(String id) {
        this.id = id;
    }


}
