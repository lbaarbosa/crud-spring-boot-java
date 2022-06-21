package br.com.boot.spring.domain.dto.response;

import br.com.boot.spring.domain.dto.ProductResponseDTO;

public class ProductResponse {

    private int id;

    private String name;

    private double price;

    private double discount;

    public ProductResponse() {
        super();
    }

    public ProductResponse(String name, double price, double discount) {
        this.name = name;
        this.price = price;
        this.discount = discount;
    }

    public ProductResponse(ProductResponseDTO productResponseDTO) {
        this.id = productResponseDTO.getId();
        this.name = productResponseDTO.getName();
        this.price = productResponseDTO.getPrice();
        this.discount = productResponseDTO.getDiscount();
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
