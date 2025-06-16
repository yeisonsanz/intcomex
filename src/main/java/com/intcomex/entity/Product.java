package com.intcomex.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private BigDecimal unitPrice;
    private Integer stock;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;


}