package com.example.seminario3_prueba.controllers;


import com.example.seminario3_prueba.entities.Local;
import com.example.seminario3_prueba.entities.Message;
import com.example.seminario3_prueba.services.LocalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/local")
public class localController {

    private final LocalService localService;

    @Autowired
    public localController(LocalService localService) {
        this.localService = localService;
    }

    @GetMapping("/list")
    public ResponseEntity<List<Local>> getAll(){
        List<Local> foundlocals = this.localService.FindAll();
        return new ResponseEntity<>(foundlocals, HttpStatus.OK);
    }


    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping()
    public ResponseEntity<Message> save(@Valid @RequestBody Local local, BindingResult bindingResult){
        if(bindingResult.hasErrors())
            return new ResponseEntity<>(new Message("Los campos ingresados son incorrectos"), HttpStatus.BAD_REQUEST);
        this.localService.save(local);
        return new ResponseEntity<>(new Message("marca guardada"), HttpStatus.OK);
    }
}
