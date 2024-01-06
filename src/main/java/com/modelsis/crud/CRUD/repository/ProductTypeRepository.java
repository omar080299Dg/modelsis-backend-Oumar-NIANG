package com.modelsis.crud.CRUD.repository;

import com.modelsis.crud.CRUD.domain.ProductType;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ProductTypeRepository extends JpaRepository<ProductType, Long> {
    Optional<ProductType> findProductTypeByName(String name);
}
