package com.modelsis.crud.CRUD.service.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;

@Data
@AllArgsConstructor
public class ProductDTO {

    private String name;

    private Date createdDate;

    private String productType;
}
