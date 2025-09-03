package com.example.stockmanagement.model;


import jakarta.persistence.*;


import java.time.LocalDateTime;


@Entity
@Table(name = "tbl_product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_id")
    private Long id;
    private String name;
    private int sku;
    private int quantity;
    private double price;
    @ManyToOne
    @JoinColumn(name = "category_id",nullable = false)
    private Category category;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
