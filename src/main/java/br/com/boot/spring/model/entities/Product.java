package br.com.boot.spring.model.entities;

import br.com.boot.spring.domain.dto.ProductRequestDTO;
import br.com.boot.spring.domain.dto.request.ProductRequest;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotBlank
    private String name;

    @Min(0)
    private double price;

    @Min(0)
    @Max(1)
    private double discount;

    public Product() {
        super();
    }

    public Product(String name, double price, double discount) {
        this.name = name;
        this.price = price;
        this.discount = discount;
    }

    public Product(ProductRequestDTO productRequestDTO) {
        this.id = productRequestDTO.getId();
        this.name = productRequestDTO.getName();
        this.price = productRequestDTO.getPrice();
        this.discount = productRequestDTO.getDiscount();
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
