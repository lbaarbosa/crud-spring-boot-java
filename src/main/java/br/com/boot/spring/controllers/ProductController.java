package br.com.boot.spring.controllers;

import br.com.boot.spring.model.entities.Product;
import br.com.boot.spring.model.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Optional;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @RequestMapping(method = {RequestMethod.POST, RequestMethod.PUT})
    public @ResponseBody Product saveProduct(@Valid Product product) {
        productRepository.save(product);
        return product;
    }

    @GetMapping(path = "/all")
    public Iterable<Product> getAllProducts() {
        return productRepository.findAll();
    }

    @GetMapping(path = "/name/{name}")
    public Iterable<Product> getProductsByName(@PathVariable String name) {
        return productRepository.findByNameContainingIgnoreCase(name);
    }

    @GetMapping(path = "/page/{pageNumber}/{itemsByPage}")
    public Iterable<Product> getProductsByPage(@PathVariable int pageNumber, @PathVariable int itemsByPage) {
        if(itemsByPage >= 5) itemsByPage = 5;
        Pageable page = PageRequest.of(pageNumber, itemsByPage);
        return productRepository.findAll(page);
    }

    @GetMapping(path = "/{id}")
    public Optional<Product> getProductById(@PathVariable int id) {
        return productRepository.findById(id);
    }

    @DeleteMapping(path = "/{id}")
    public void deleteProductById(@PathVariable int id) {
        productRepository.deleteById(id);
    }
}