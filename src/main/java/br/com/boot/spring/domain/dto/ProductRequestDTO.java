package br.com.boot.spring.domain.dto;

import br.com.boot.spring.domain.dto.request.ProductRequest;

public class ProductRequestDTO {

    private int id;

    private String name;

    private double price;

    private double discount;

    public ProductRequestDTO() {
        super();
    }

    public ProductRequestDTO(String name, double price, double discount) {
        this.name = name;
        this.price = price;
        this.discount = discount;
    }

    public ProductRequestDTO(ProductRequest productRequest) {
        this.id = productRequest.getId();
        this.name = productRequest.getName();
        this.price = productRequest.getPrice();
        this.discount = productRequest.getDiscount();
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
