package com.example.seminario3_prueba.repositories;

import com.example.seminario3_prueba.entities.Brand;
import com.example.seminario3_prueba.entities.Local;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LocalReposity extends JpaRepository<Local, String> {
}
