package com.modelsis.crud.CRUD.service;

import com.modelsis.crud.CRUD.domain.Product;
import com.modelsis.crud.CRUD.service.dto.ProductDTO;

import java.util.List;

public interface ProductService {

    List<Product> getAll();

    Product save(ProductDTO product) throws Exception;

    Product update(Long id, ProductDTO product) throws Exception;
}
