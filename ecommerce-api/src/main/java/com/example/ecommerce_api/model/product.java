package com.example.ecommerce_api.model;

import jakarta.persistence.*;

@Entity
@Table(name = "products")
public class product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;

}
