package com.example.service;

public class PriceCalculator {
    public double base = 100;

    public double calculateTax() {
        return base * 0.18;
    }

    public double getTotal() {
        return base + calculateTax();
    }
}
