package com.modelsis.crud.CRUD.controller;

import com.modelsis.crud.CRUD.domain.Product;
import com.modelsis.crud.CRUD.service.ProductService;
import com.modelsis.crud.CRUD.service.dto.ProductDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/product")
    public ResponseEntity<List<Product>> getAllProducts() {
        List<Product> products = productService.getAll();
        return new ResponseEntity<>(products, HttpStatus.OK);
    }

    @PostMapping("/product")
    public ResponseEntity<Product> createProduct(@RequestBody ProductDTO productDTO) throws Exception {
        Product createdProduct = productService.save(productDTO);
        return new ResponseEntity<>(createdProduct, HttpStatus.CREATED);
    }

    @PutMapping("/product/{productId}")
    public ResponseEntity<Product> updateProduct(@PathVariable Long productId, @RequestBody ProductDTO productDTO) throws Exception {
        Product updatedProduct = productService.update(productId, productDTO);

        return new ResponseEntity<>(updatedProduct, HttpStatus.OK);
    }
}
