package com.modelsis.crud.CRUD.service.mapper;

import com.modelsis.crud.CRUD.domain.Product;
import com.modelsis.crud.CRUD.domain.ProductType;
import com.modelsis.crud.CRUD.service.ProductTypeService;
import com.modelsis.crud.CRUD.service.dto.ProductDTO;
import org.springframework.stereotype.Component;

@Component
public class ProductMapper {
    private final ProductTypeService productTypeService;

    public ProductMapper(ProductTypeService productTypeService) {
        this.productTypeService = productTypeService;
    }

    public Product mapToProduct(ProductDTO productDTO) throws Exception {
        ProductType pType = productTypeService.findByName(productDTO.getName()).orElseThrow(
                ()-> new Exception(" Product type not found")
        );
        Product product = new Product();
        product.setName(product.getName());
        product.setDateCreated(productDTO.getCreatedDate());
        product.setType(pType);
        return product;
    }
}
