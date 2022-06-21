package br.com.boot.spring.service;

import br.com.boot.spring.domain.dto.ProductRequestDTO;
import br.com.boot.spring.domain.dto.ProductResponseDTO;
import br.com.boot.spring.model.entities.Product;
import br.com.boot.spring.model.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    public ProductResponseDTO saveProduct(ProductRequestDTO productRequestDTO) {
        Product product = new Product(productRequestDTO);
        return new ProductResponseDTO(productRepository.save(product));
    }

    public List<ProductResponseDTO> getAllProducts() {
        List<ProductResponseDTO> productResponseDTOList = new ArrayList<>();
        Iterable<Product> productIterable = productRepository.findAll();
        productIterable
                .forEach(
                        product -> productResponseDTOList.add(new ProductResponseDTO(product))
                );
        return productResponseDTOList;
    }

    public List<ProductResponseDTO> getProductsByName(String name) {
        List<ProductResponseDTO> productResponseDTOList = new ArrayList<>();
        List<Product> productList =
                productRepository
                        .findByNameContainingIgnoreCase(name);
        productList
                .forEach(
                        p -> productResponseDTOList.add(new ProductResponseDTO(p))
                );
        return productResponseDTOList;
    }

    public List<ProductResponseDTO> getProductsByPage(int pageNumber, int itemsByPage) {
        if(itemsByPage >= 5) itemsByPage = 5;
        Pageable page = PageRequest.of(pageNumber, itemsByPage);
        List<ProductResponseDTO> productResponseDTOList = new ArrayList<>();
        productRepository
                .findAll(page)
                .forEach(
                p -> productResponseDTOList
                            .add(new ProductResponseDTO(p))
                );
        return productResponseDTOList;
    }

    public Optional<ProductResponseDTO> getProductById(int id) {
        return productRepository
                .findById(id)
                .map(
                        p -> new ProductResponseDTO(p)
                );
    }

    public void deleteProductById(int id) {
        productRepository.deleteById(id);
    }
}