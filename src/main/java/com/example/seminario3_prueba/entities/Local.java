package com.example.seminario3_prueba.entities;


import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "local")
public class Local {

    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    private String id_local;

    @NotNull
    @Column(length = 50 )
    private String local_name;

    @NotNull
    @Column(length = 50)
    private String local_Descripcion;

    @NotNull
    @Column(length = 50)
    private String local_dirrecion;

    @NotNull
    @Column(length = 50)
    private String local_title;

    @NotNull
    @Column
    private boolean local_isactive;

    @NotNull
    @Column
    private int local_score;

    @NotNull
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name="products_locals_relate", joinColumns = @JoinColumn(name="local_id"),
            inverseJoinColumns=@JoinColumn(name="product_id"))
    private Set<Product> productsSet = new HashSet<>();

    public Local(String id_local, String local_name, String local_Descripcion, String local_dirrecion, String local_title, boolean local_isactive, int local_score) {
        this.id_local = id_local;
        this.local_name = local_name;
        this.local_Descripcion = local_Descripcion;
        this.local_dirrecion = local_dirrecion;
        this.local_title = local_title;
        this.local_isactive = local_isactive;
        this.local_score = local_score;
    }

    public Local() {
    }

    public Local(String local_name, String local_Descripcion, String local_dirrecion, String local_title, boolean local_isactive, int local_score, Set<Product> productsSet) {
        this.local_name = local_name;
        this.local_Descripcion = local_Descripcion;
        this.local_dirrecion = local_dirrecion;
        this.local_title = local_title;
        this.local_isactive = local_isactive;
        this.local_score = local_score;
        this.productsSet = productsSet;
    }


    public String getId_local() {return id_local;}
    public void setId_local(String id_local) {this.id_local = id_local;}
    public String getLocal_name() {return local_name;}
    public void setLocal_name(String local_name) {this.local_name = local_name;}
    public String getLocal_Descripcion() {return local_Descripcion;}
    public void setLocal_Descripcion(String local_Descripcion) {this.local_Descripcion = local_Descripcion;}
    public String getLocal_dirrecion() {return local_dirrecion;}
    public void setLocal_dirrecion(String local_dirrecion) {this.local_dirrecion = local_dirrecion;}
    public String getLocal_title() {return local_title;}
    public void setLocal_title(String local_title) {this.local_title = local_title;}
    public boolean isLocal_isactive() {return local_isactive;}
    public void setLocal_isactive(boolean local_isactive) {this.local_isactive = local_isactive;}
    public int getLocal_score() {return local_score;}
    public void setLocal_score(int local_score) {this.local_score = local_score;}
    public Set<Product> getProductsSet() {return productsSet;}
    public void setProductsSet(Set<Product> productsSet) {this.productsSet = productsSet;}
}
