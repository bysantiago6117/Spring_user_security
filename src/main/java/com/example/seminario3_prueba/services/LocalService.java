package com.example.seminario3_prueba.services;


import com.example.seminario3_prueba.entities.Local;

import com.example.seminario3_prueba.repositories.LocalReposity;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class LocalService {


    private final LocalReposity localReposity;


    @Autowired
    public LocalService(LocalReposity localReposity) {
        this.localReposity = localReposity;
    }


    public void save(Local local){localReposity.save(local);}

    public List<Local> FindAll(){
        return localReposity.findAll();
    }


}
