package com.api.restmodule.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.api.calculatormodule.dataresponse.OperationResponse;
import com.api.calculatormodule.service.CalculatorService;

import java.math.BigDecimal;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {

    @Autowired
    private CalculatorService calculatorService;

    @GetMapping("/sum")
    public OperationResponse add(@RequestParam BigDecimal a, @RequestParam BigDecimal b) {
        return new OperationResponse(calculatorService.add(a, b));
    }

    @GetMapping("/sub")
    public OperationResponse subtract(@RequestParam BigDecimal a, @RequestParam BigDecimal b) {
        return new OperationResponse(calculatorService.subtract(a, b));
    }

    @GetMapping("/mul")
    public OperationResponse multiply(@RequestParam BigDecimal a, @RequestParam BigDecimal b) {
        return new OperationResponse(calculatorService.multiply(a, b));
    }

    @GetMapping("/div")
    public OperationResponse divide(@RequestParam BigDecimal a, @RequestParam BigDecimal b) {
        return new OperationResponse(calculatorService.divide(a, b));
    }
}
