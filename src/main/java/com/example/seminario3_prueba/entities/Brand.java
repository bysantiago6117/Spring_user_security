package com.example.seminario3_prueba.entities;


import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Set;

@Entity
@Table(name = "brand")
public class Brand {

    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    private String id;

    @NotNull
    @Column(length = 50 )
    private String brand_name;

    @NotNull
    @Column(length = 50)
    private String brand_Descripcion;


    @NotNull
    @Column(length = 50)
    private String brand_keywords;

    @NotNull
    @Column(length = 50)
    private String brand_site_title;

    @NotNull
    @Column
    private boolean brand_active;

    @NotNull
    @Column
    private boolean brand_menu_home;

    @NotNull
    @Column
    private boolean brand_score;

    @OneToMany(mappedBy = "brand")
    private Set<Product> products;

    public Brand(String id, String brand_name, String brand_Descripcion, String keywords, String brand_site_title, boolean brand_active, boolean brand_menu_home, boolean brand_score, Set<Product> products) {
        this.id = id;
        this.brand_name = brand_name;
        this.brand_Descripcion = brand_Descripcion;
        this.brand_keywords = keywords;
        this.brand_site_title = brand_site_title;
        this.brand_active = brand_active;
        this.brand_menu_home = brand_menu_home;
        this.brand_score = brand_score;
        this.products = products;
    }

    public Brand() {
    }

    public Brand(String brand_name, String brand_Descripcion, String keywords, String brand_site_title, boolean brand_active, boolean brand_menu_home, boolean brand_score, Set<Product> products) {
        this.brand_name = brand_name;
        this.brand_Descripcion = brand_Descripcion;
        this.brand_keywords = keywords;
        this.brand_site_title = brand_site_title;
        this.brand_active = brand_active;
        this.brand_menu_home = brand_menu_home;
        this.brand_score = brand_score;
        this.products = products;
    }

    public String getId() {return id;}
    public void setId(String id) {this.id = id;}
    public String getBrand_name() {return brand_name;}
    public void setBrand_name(String brand_name) {this.brand_name = brand_name;}
    public String getBrand_Descripcion() {return brand_Descripcion;}
    public void setBrand_Descripcion(String brand_Descripcion) {this.brand_Descripcion = brand_Descripcion;}
    public String getBrand_keywords() {return brand_keywords;}
    public void setBrand_keywords(String brand_keywords) {this.brand_keywords = brand_keywords;}
    public String getBrand_site_title() {return brand_site_title;}
    public void setBrand_site_title(String brand_site_title) {this.brand_site_title = brand_site_title;}
    public boolean isBrand_active() {return brand_active;}
    public void setBrand_active(boolean brand_active) {this.brand_active = brand_active;}
    public boolean isBrand_menu_home() {return brand_menu_home;}
    public void setBrand_menu_home(boolean brand_menu_home) {this.brand_menu_home = brand_menu_home;}
    public boolean isBrand_score() {return brand_score;}
    public void setBrand_score(boolean brand_score) {this.brand_score = brand_score;}
    public Set<Product> getProducts() {return products;}
    public void setProducts(Set<Product> products) {this.products = products;}

}
