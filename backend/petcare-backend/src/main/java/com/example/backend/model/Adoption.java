package com.example.backend.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "adoptions")
public class Adoption {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String type;
    private String color;
    private String image;

    @ManyToOne
    @JoinColumn(name = "veterinarian_id")
    @JsonIgnore
    private Veterinarian veterinarian;

    public Adoption() {}

    public Adoption(String name, String type, String color, String image, Veterinarian veterinarian) {
        this.name = name;
        this.type = type;
        this.color = color;
        this.image = image;
        this.veterinarian = veterinarian;
    }

    // Getters and Setters

    public Long getId() { return id; }

    public void setId(Long id) { this.id = id; }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public String getType() { return type; }

    public void setType(String type) { this.type = type; }

    public String getColor() { return color; }

    public void setColor(String color) { this.color = color; }

    public String getImage() { return image; }

    public void setImage(String image) { this.image = image; }

    public Veterinarian getVeterinarian() { return veterinarian; }

    public void setVeterinarian(Veterinarian veterinarian) { this.veterinarian = veterinarian; }
}
