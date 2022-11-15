package com.example.seminario3_prueba.repositories;

import com.example.seminario3_prueba.entities.Brand;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BrandReposity extends JpaRepository<Brand, String> {
}
