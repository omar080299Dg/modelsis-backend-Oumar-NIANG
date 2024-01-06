package com.modelsis.crud.CRUD.service;

import com.modelsis.crud.CRUD.domain.ProductType;

import java.util.Optional;

public interface ProductTypeService {
    ProductType save(ProductType productType);

    Optional<ProductType> findByName(String name);
}
