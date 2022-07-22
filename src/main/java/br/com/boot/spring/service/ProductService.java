package br.com.boot.spring.service;

import br.com.boot.spring.domain.dto.ProductRequestDTO;
import br.com.boot.spring.domain.dto.ProductResponseDTO;

import java.util.List;
import java.util.Optional;

public interface ProductService {

    public ProductResponseDTO saveProduct(ProductRequestDTO productRequestDTO);

    public List<ProductResponseDTO> getAllProducts();

    public List<ProductResponseDTO> getProductsByName(String name);

    public List<ProductResponseDTO> getProductsByPage(int pageNumber, int itemsByPage);

    public Optional<ProductResponseDTO> getProductById(int id);

    public void deleteProductById(int id);
}
