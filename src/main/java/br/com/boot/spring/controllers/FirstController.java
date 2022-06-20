package br.com.boot.spring.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/greeting")
public class FirstController {

    @GetMapping(path = "/hello")
    public String greeting() {
        return "Hello, String Boot!";
    }

}
