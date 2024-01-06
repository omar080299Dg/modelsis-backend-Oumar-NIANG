package com.modelsis.crud.CRUD.repository;

import com.modelsis.crud.CRUD.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {
}
