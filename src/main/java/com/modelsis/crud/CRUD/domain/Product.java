package com.modelsis.crud.CRUD.domain;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Data
@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(unique = true, nullable = false)
    String name;

    private Date dateCreated;

    @ManyToOne
    @JoinColumn(name = "product_type_id")
    private ProductType type;


}
