package com.modelsis.crud.CRUD.service.impl;

import com.modelsis.crud.CRUD.domain.ProductType;
import com.modelsis.crud.CRUD.repository.ProductTypeRepository;
import com.modelsis.crud.CRUD.service.ProductTypeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@Slf4j
public class ProductTypeServiceImpl implements ProductTypeService {

    private final ProductTypeRepository productTypeRepository;

    public ProductTypeServiceImpl(ProductTypeRepository productTypeRepository) {
        this.productTypeRepository = productTypeRepository;
    }

    @Override
    public ProductType save(ProductType productType) {
        log.debug("Request to save productType {}",productType);
        return productTypeRepository.save(productType);
    }

    @Override
    public Optional<ProductType> findByName(String name) {
        log.debug("Request to find productType by name {}",name);
        return productTypeRepository.findProductTypeByName(name);
    }
}
