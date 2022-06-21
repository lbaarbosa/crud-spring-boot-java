package br.com.boot.spring.model.repositories;

import br.com.boot.spring.model.entities.Product;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface ProductRepository extends PagingAndSortingRepository<Product,Integer> {

    public List<Product> findByNameContainingIgnoreCase(String name);

}
