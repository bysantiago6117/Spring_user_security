package com.example.seminario3_prueba.repositories;


import com.example.seminario3_prueba.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, String> {
    
    
}
