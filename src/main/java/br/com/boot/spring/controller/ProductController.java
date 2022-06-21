package br.com.boot.spring.controller;

import br.com.boot.spring.domain.dto.ProductRequestDTO;
import br.com.boot.spring.domain.dto.request.ProductRequest;
import br.com.boot.spring.domain.dto.response.ProductResponse;
import br.com.boot.spring.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    @Autowired
    private ProductService productService;

    @RequestMapping(method = {RequestMethod.POST, RequestMethod.PUT})
    public @ResponseBody
        ProductResponse saveProduct(
                        @Valid ProductRequest productRequest
        ) {
            ProductRequestDTO productRequestDTO =
                    new ProductRequestDTO(productRequest);
            return new ProductResponse(productService.saveProduct(productRequestDTO));
    }

    @GetMapping(path = "/all")
    public List<ProductResponse> getAllProducts() {
        return productService
                .getAllProducts()
                .stream()
                .map(
                        p -> new ProductResponse(p)
                ).collect(Collectors.toList()
        );
    }

    @GetMapping(path = "/name/{name}")
    public List<ProductResponse> getProductsByName(@PathVariable String name) {
        return productService
                .getProductsByName(name)
                .stream()
                .map(
                        p -> new ProductResponse(p)
                ).collect(Collectors.toList()
        );
    }

    @GetMapping(path = "/page/{pageNumber}/{itemsByPage}")
    public List<ProductResponse> getProductsByPage(
            @PathVariable int pageNumber,
            @PathVariable int itemsByPage
    ) {
        return productService
                .getProductsByPage(pageNumber, itemsByPage)
                .stream()
                .map(
                        p -> new ProductResponse(p)
                ).collect(Collectors.toList()
        );
    }

    @GetMapping(path = "/{id}")
    public Optional<ProductResponse> getProductById(@PathVariable int id) {
        return productService
                .getProductById(id)
                .map(p -> new ProductResponse(p)
        );
    }

    @DeleteMapping(path = "/{id}")
    public void deleteProductById(@PathVariable int id) {
        productService.deleteProductById(id);
    }
}