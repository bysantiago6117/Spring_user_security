package com.example.seminario3_prueba.respositories;

import com.example.seminario3_prueba.entities.Role;
import com.example.seminario3_prueba.enums.RoleList;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository <Role, Integer> {
    Optional<Role> findByRoleName(RoleList roleName);
    
}
