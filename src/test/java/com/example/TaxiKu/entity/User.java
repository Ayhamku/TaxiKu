package com.example.TaxiKu.entity;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "Users")
public class User implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String Name;
    private String  email;
    private String password;



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String firstName) {
        this.Name = firstName;
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

    public void setId(String id) {
        this.password = id;
    }


    public User(Long id, String Name,  String email , String password) {
        this.id = id;
        this.Name = Name;
        this.email = email;
        this.password=password;
    }
}