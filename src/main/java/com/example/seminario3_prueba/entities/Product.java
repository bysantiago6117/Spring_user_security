package com.example.seminario3_prueba.entities;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity
public class Product {
    
    @Id
	@GeneratedValue(generator = "UUID")
	@GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
	private String id;

    @NotNull
    @Column(length = 50 )
    private String name;

    @NotNull
    @Column
    private String Descripcion_short;

    @NotNull
    @Column
    private boolean isVisible;

    @NotNull
    @Column
    private boolean isActive;

    @NotNull
    @Column(length = 50 )
    private String title;

    @NotNull
    @Column(length = 50 )
    private String product_taxcode;

    @NotNull
    @Column(length = 50 )
    private String getProduct_keywords;


    @NotNull
    @Column
    private boolean product_show_without_stock;

    @NotNull
    @Column
    private int product_score;

    @NotNull
    private Integer stock;

    @NotNull
    @Column
    private Date product_release_date;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="brand_id", nullable=false, referencedColumnName = "id")
    private Brand brand;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="Category_id", nullable=false, referencedColumnName = "id")
    private Category category;


    public Product() {
    }

    public Product(String id, String name, String descripcion_short, boolean isVisible, boolean isActive, String title, String product_taxcode, String getProduct_keywords, boolean product_show_without_stock, int product_score, Integer stock, Date product_release_date, Brand brand, Category category) {
        this.id = id;
        this.name = name;
        Descripcion_short = descripcion_short;
        this.isVisible = isVisible;
        this.isActive = isActive;
        this.title = title;
        this.product_taxcode = product_taxcode;
        this.getProduct_keywords = getProduct_keywords;
        this.product_show_without_stock = product_show_without_stock;
        this.product_score = product_score;
        this.stock = stock;
        this.product_release_date = product_release_date;
        this.brand = brand;
        this.category = category;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Integer getStock() {
        return stock;
    }
    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public String getDescripcion_short() {return Descripcion_short;}
    public void setDescripcion_short(String descripcion_short) {Descripcion_short = descripcion_short;}
    public boolean isVisible() {return isVisible;}
    public void setVisible(boolean visible) {isVisible = visible;}
    public boolean isActive() {return isActive;}
    public void setActive(boolean active) {isActive = active;}
    public String getTitle() {return title;}
    public void setTitle(String title) {this.title = title;}
    public String getProduct_taxcode() {return product_taxcode;}
    public void setProduct_taxcode(String product_taxcode) {this.product_taxcode = product_taxcode;}
    public String getGetProduct_keywords() {return getProduct_keywords;}
    public void setGetProduct_keywords(String getProduct_keywords) {this.getProduct_keywords = getProduct_keywords;}
    public boolean isProduct_show_without_stock() {return product_show_without_stock;}
    public void setProduct_show_without_stock(boolean product_show_without_stock) {this.product_show_without_stock = product_show_without_stock;}
    public int getProduct_score() {return product_score;}
    public void setProduct_score(int product_score) {this.product_score = product_score;}
    public Date getProduct_release_date() {return product_release_date;}
    public void setProduct_release_date(Date product_release_date) {this.product_release_date = product_release_date;}
    public Brand getBrand() {return brand;}
    public void setBrand(Brand brand) {this.brand = brand;}
    public Category getCategory() {return category;}
    public void setCategory(Category category) {this.category = category;}


}
