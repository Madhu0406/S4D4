package com.example.service;

public class PriceFacade {

    private final PriceCalculator calculator;

    public PriceFacade(PriceCalculator calculator) {
        this.calculator = calculator;
    }

    public double getPrice() {
        try {
            return calculator.getTotal();
        } catch (ArithmeticException e) {
            return 0.0;
        }
    }
}
