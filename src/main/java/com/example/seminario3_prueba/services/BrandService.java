package com.example.seminario3_prueba.services;

import com.example.seminario3_prueba.entities.Brand;
import com.example.seminario3_prueba.entities.Product;
import com.example.seminario3_prueba.repositories.BrandReposity;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Set;

public class BrandService {

    private final BrandReposity brandReposity;

    @Autowired
    public BrandService(BrandReposity brandReposity) {this.brandReposity = brandReposity;}

    public void save(Brand brand){brandReposity.save(brand);}

    public Set<Product> ListProductsbyname(String name){
          List<Brand> marcasregistradas = brandReposity.findAll();
          for(int i = 0; i < marcasregistradas.size(); i++ ){
              if(name.equals(marcasregistradas.get(i).getBrand_name())){
                  return marcasregistradas.get(i).getProducts();
              }
          }
        return null;
    }


}
