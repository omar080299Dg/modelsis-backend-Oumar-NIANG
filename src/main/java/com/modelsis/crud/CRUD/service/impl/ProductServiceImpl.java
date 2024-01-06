package com.modelsis.crud.CRUD.service.impl;

import com.modelsis.crud.CRUD.domain.Product;
import com.modelsis.crud.CRUD.repository.ProductRepository;
import com.modelsis.crud.CRUD.service.ProductService;
import com.modelsis.crud.CRUD.service.dto.ProductDTO;
import com.modelsis.crud.CRUD.service.mapper.ProductMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;

    private final ProductMapper productMapper;

    public ProductServiceImpl(ProductRepository productRepository, ProductMapper productMapper) {
        this.productRepository = productRepository;
        this.productMapper = productMapper;
    }

    @Override
    public List<Product> getAll() {
        log.info("Request to find ALl product");
        return productRepository.findAll();
    }

    @Override
    public Product save(ProductDTO productDTO) throws Exception {
        log.debug("request to save product:{}", productDTO);
        Product product = productMapper.mapToProduct(productDTO);
        return productRepository.save(product);
    }

    @Override
    public Product update(Long id, ProductDTO productDTO) throws Exception {
        log.debug("request to save product:{}", productDTO);
        Product pToUpdate = productRepository.findById(id).orElseThrow(
                ()-> new Exception("Product not found")
        );
        pToUpdate.setName(productDTO.getName());
        pToUpdate.setDateCreated(productDTO.getCreatedDate());
        return productRepository.save(pToUpdate);
    }
}
