package br.com.boot.spring.model.repositories;

import br.com.boot.spring.model.entities.Product;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ProductRepository extends PagingAndSortingRepository<Product,Integer> {

    public Iterable<Product> findByNameContainingIgnoreCase(String name);

}
