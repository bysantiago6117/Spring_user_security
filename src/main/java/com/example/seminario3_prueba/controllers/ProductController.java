package com.example.seminario3_prueba.controllers;

import com.example.seminario3_prueba.entities.Message;
import com.example.seminario3_prueba.entities.Product;
import com.example.seminario3_prueba.services.ProductService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/product")
@CrossOrigin("*")
public class ProductController {
    
    private final ProductService productService;
    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/list")
    public ResponseEntity<List<Product>> getAll(){
        List<Product> foundProducts = this.productService.getAll();
        return new ResponseEntity<>(foundProducts, HttpStatus.OK);
    }
    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping()
    public ResponseEntity<Message> save(@Valid @RequestBody Product product, BindingResult bindingResult){
        if(bindingResult.hasErrors())
            return new ResponseEntity<>(new Message("Los campos ingresados son incorrectos"), HttpStatus.BAD_REQUEST);
        this.productService.create(product);
        return new ResponseEntity<>(new Message("Producto guardado"), HttpStatus.OK);
    }   
}
