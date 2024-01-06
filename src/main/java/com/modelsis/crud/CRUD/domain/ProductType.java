package com.modelsis.crud.CRUD.domain;


import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class ProductType {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(unique = true, nullable = false)
    String name;
}
