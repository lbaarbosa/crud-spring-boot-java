package br.com.boot.spring.domain.dto.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductRequest {

    private int id;

    private String name;

    private double price;

    private double discount;

    public ProductRequest() {
        super();
    }

    public ProductRequest(String name, double price, double discount) {
        this.name = name;
        this.price = price;
        this.discount = discount;
    }

}
