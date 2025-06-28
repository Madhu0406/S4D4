package com.example.service;

import org.springframework.stereotype.Component;

@Component
public class PaymentGatewayClient {
    public void charge() {
        System.out.println("Charging payment...");
    }
}
