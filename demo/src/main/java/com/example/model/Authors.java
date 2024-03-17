package com.example.model;

import jakarta.persistence.*;

@Entity
@Table(name = "Authors")
public class Authors {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

}