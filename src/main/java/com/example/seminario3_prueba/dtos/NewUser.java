package com.example.seminario3_prueba.dtos;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.HashSet;
import java.util.Set;

public class NewUser {

    @NotBlank
    private String userName;
    @Email
    private String email;
    @NotBlank
    private String password;


    private String telefono;


    private String dirrecion;


    private String nombre;

    private String apellido;
    private Set<String> roles = new HashSet<>();
    public NewUser() {
    }

    public NewUser(@NotBlank String userName, @Email String email, @NotBlank String password, String telefono, String dirrecion, String nombre, String apellido, Set<String> roles) {
        this.userName = userName;
        this.email = email;
        this.password = password;
        this.telefono = telefono;
        this.dirrecion = dirrecion;
        this.nombre = nombre;
        this.apellido = apellido;
        this.roles = roles;
    }

    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public Set<String> getRoles() {
        return roles;
    }
    public void setRoles(Set<String> roles) {
        this.roles = roles;
    }
    public String getTelefono() {return telefono;}
    public void setTelefono(String telefono) {this.telefono = telefono;}
    public String getDirrecion() {return dirrecion;}
    public void setDirrecion(String dirrecion) {this.dirrecion = dirrecion;}
    public String getNombre() {return nombre;}
    public void setNombre(String nombre) {this.nombre = nombre;}
    public String getApellido() {return apellido;}
    public void setApellido(String apellido) {this.apellido = apellido;}
}
