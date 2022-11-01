package com.example.seminario3_prueba.services;

import com.example.seminario3_prueba.entities.Product;
import com.example.seminario3_prueba.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Service
public class ProductService {
    
    private final ProductRepository productRepository;
    @Autowired
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }
    public List<Product> getAll(){
        return this.productRepository.findAll();
    }
    public void create(Product product){
        this.productRepository.save(product);
    }
    
}
