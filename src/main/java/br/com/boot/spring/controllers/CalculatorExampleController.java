package br.com.boot.spring.controllers;

    /*      /calculadora/somar/10/20
            /calculadora/subtrair?a=100&b=39
    */

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/calculator")
public class CalculatorExampleController {

    @GetMapping("/sum/{a}/{b}")
    public int sum(
            @PathVariable int a,
            @PathVariable int b
    ) { return a + b; }

    @GetMapping("/difference")
    public int difference(
            @RequestParam(name = "a")
            int a,
            @RequestParam(name = "b")
            int b
    ) { return a - b; }
}