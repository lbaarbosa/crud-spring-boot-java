package br.com.boot.spring.domain.dto;

import br.com.boot.spring.domain.dto.request.ProductRequest;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
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

}
