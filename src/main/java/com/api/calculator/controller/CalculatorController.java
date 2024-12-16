package com.api.calculator.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.api.calculator.service.CalculatorService;

import java.math.BigDecimal;

@RestController
public class CalculatorController {

    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping("/a")
    public BigDecimal add(@RequestParam BigDecimal a, @RequestParam BigDecimal b) {
        return calculatorService.add(a, b);
    }

    @GetMapping("/s")
    public BigDecimal subtract(@RequestParam BigDecimal a, @RequestParam BigDecimal b) {
        return calculatorService.subtract(a, b);
    }

    @GetMapping("/m")
    public BigDecimal multiply(@RequestParam BigDecimal a, @RequestParam BigDecimal b) {
        return calculatorService.multiply(a, b);
    }

    @GetMapping("/d")
    public BigDecimal divide(@RequestParam BigDecimal a, @RequestParam BigDecimal b) {
        return calculatorService.divide(a, b);
    }
}
