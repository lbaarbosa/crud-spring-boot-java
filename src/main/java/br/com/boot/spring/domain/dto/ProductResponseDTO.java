package br.com.boot.spring.domain.dto;

import br.com.boot.spring.domain.dto.request.ProductRequest;
import br.com.boot.spring.domain.dto.response.ProductResponse;
import br.com.boot.spring.model.entities.Product;

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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }
}