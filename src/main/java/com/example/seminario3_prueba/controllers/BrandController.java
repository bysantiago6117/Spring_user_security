package com.example.seminario3_prueba.controllers;


import com.example.seminario3_prueba.entities.Brand;
import com.example.seminario3_prueba.entities.Message;
import com.example.seminario3_prueba.services.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/brand")
public class BrandController {

    private final BrandService brandService;

    @Autowired
    public BrandController(BrandService brandService) {this.brandService = brandService;}

    @GetMapping("/list")
    public ResponseEntity<List<Brand>> getAll(){
        List<Brand> foundbrands = this.brandService.FindAll();
        return new ResponseEntity<>(foundbrands, HttpStatus.OK);
    }

    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping()
    public ResponseEntity<Message> save(@Valid @RequestBody Brand brand,  BindingResult bindingResult){
        if(bindingResult.hasErrors())
            return new ResponseEntity<>(new Message("Los campos ingresados son incorrectos"), HttpStatus.BAD_REQUEST);
        this.brandService.save(brand);
        return new ResponseEntity<>(new Message("marca guardada"), HttpStatus.OK);
    }



}
