package com.example.service;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.*;
import org.mockito.junit.MockitoJUnitRunner;

import static org.mockito.Mockito.*;
import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class PriceFacadeTest {

    @Mock
    private PriceCalculator calculator;

    private PriceFacade facade;

    @Before
    public void setUp() {
        facade = new PriceFacade(calculator);
    }

    @Test
    public void testFallbackOnError() {
        when(calculator.getTotal()).thenThrow(new ArithmeticException());

        double price = facade.getPrice();

        assertEquals(0.0, price, 0.01);
    }

    @Test
    public void testNormalPriceCalculation() {
        when(calculator.getTotal()).thenReturn(118.0);

        double price = facade.getPrice();

        assertEquals(118.0, price, 0.01);
    }
}
