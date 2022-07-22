package br.com.boot.spring.domain.dto;

import br.com.boot.spring.model.entities.Product;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductResponseDTO {

    private int id;

    private String name;

    private double price;

    private double discount;

    public ProductResponseDTO() {
        super();
    }

    public ProductResponseDTO(String name, double price, double discount) {
        this.name = name;
        this.price = price;
        this.discount = discount;
    }

    public ProductResponseDTO(Product product) {
        this.id = product.getId();
        this.name = product.getName();
        this.price = product.getPrice();
        this.discount = product.getDiscount();
    }

}