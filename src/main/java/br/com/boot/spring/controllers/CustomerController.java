package br.com.boot.spring.controllers;

import br.com.boot.spring.model.entities.Customer;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/customers")
public class CustomerController {

    @GetMapping("/any")
    public Customer getCustomer() {
        return new Customer(1, "Lucas", "123.456.789-00");
    }

    @GetMapping("/{id}")
    public Customer getCustomerByUrlId(@PathVariable int id) {
        return new Customer(id, "Lucas", "123.456.789-00");
    }

    @GetMapping
    public Customer getCustomerByQueryStringId(@RequestParam(name = "id", defaultValue = "42") int id) {
        return new Customer(id, "Lucas", "789.456.123-00");
    }

}