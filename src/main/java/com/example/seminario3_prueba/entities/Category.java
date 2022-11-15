package com.example.seminario3_prueba.entities;


import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Set;

@Entity
@Table(name = "category")
public class Category {

    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    private String id;

    @NotNull
    @Column(length = 50 )
    private String category_name;

    @NotNull
    @Column(length = 50)
    private String category_Descripcion;


    @NotNull
    @Column(length = 50)
    private String category_keywords;

    @NotNull
    @Column(length = 50)
    private String category_title;

    @NotNull
    @Column
    private boolean category_Isactive;

    @NotNull
    @Column
    private int category_score;

    @NotNull
    @Column
    private boolean category_show_in_store_front;

    @NotNull
    @Column
    private boolean category_show_brand_filter;

    @OneToMany(mappedBy = "category")
    private Set<Product> products_category;

    public Category(String category_name, String category_Descripcion, String category_keywords, String category_title, boolean category_Isactive, int category_score, boolean category_show_in_store_front, boolean category_show_brand_filter, Set<Product> products_category) {
        this.category_name = category_name;
        this.category_Descripcion = category_Descripcion;
        this.category_keywords = category_keywords;
        this.category_title = category_title;
        this.category_Isactive = category_Isactive;
        this.category_score = category_score;
        this.category_show_in_store_front = category_show_in_store_front;
        this.category_show_brand_filter = category_show_brand_filter;
        this.products_category = products_category;
    }

    public Category() {
    }

    public Category(String id, String category_name, String category_Descripcion, String category_keywords, String category_title, boolean category_Isactive, int category_score, boolean category_show_in_store_front, boolean category_show_brand_filter, Set<Product> products_category) {
        this.id = id;
        this.category_name = category_name;
        this.category_Descripcion = category_Descripcion;
        this.category_keywords = category_keywords;
        this.category_title = category_title;
        this.category_Isactive = category_Isactive;
        this.category_score = category_score;
        this.category_show_in_store_front = category_show_in_store_front;
        this.category_show_brand_filter = category_show_brand_filter;
        this.products_category = products_category;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCategory_name() {
        return category_name;
    }

    public void setCategory_name(String category_name) {
        this.category_name = category_name;
    }

    public String getCategory_Descripcion() {
        return category_Descripcion;
    }

    public void setCategory_Descripcion(String category_Descripcion) {
        this.category_Descripcion = category_Descripcion;
    }

    public String getCategory_keywords() {
        return category_keywords;
    }

    public void setCategory_keywords(String category_keywords) {
        this.category_keywords = category_keywords;
    }

    public String getCategory_title() {
        return category_title;
    }

    public void setCategory_title(String category_title) {
        this.category_title = category_title;
    }

    public boolean isCategory_Isactive() {
        return category_Isactive;
    }

    public void setCategory_Isactive(boolean category_Isactive) {
        this.category_Isactive = category_Isactive;
    }

    public int getCategory_score() {
        return category_score;
    }

    public void setCategory_score(int category_score) {
        this.category_score = category_score;
    }

    public boolean isCategory_show_in_store_front() {
        return category_show_in_store_front;
    }

    public void setCategory_show_in_store_front(boolean category_show_in_store_front) {
        this.category_show_in_store_front = category_show_in_store_front;
    }

    public boolean isCategory_show_brand_filter() {
        return category_show_brand_filter;
    }

    public void setCategory_show_brand_filter(boolean category_show_brand_filter) {
        this.category_show_brand_filter = category_show_brand_filter;
    }
}
