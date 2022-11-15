package com.example.seminario3_prueba.repositories;

import com.example.seminario3_prueba.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryReposity extends JpaRepository<Category, String> {
}
