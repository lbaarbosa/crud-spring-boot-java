package br.com.boot.spring.domain.dto.response;

import br.com.boot.spring.domain.dto.ProductResponseDTO;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
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

}
