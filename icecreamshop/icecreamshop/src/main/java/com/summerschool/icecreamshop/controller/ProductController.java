
package com.summerschool.icecreamshop.controller;


import com.summerschool.icecreamshop.dto.ProductDTO;

import com.summerschool.icecreamshop.model.Product;
import com.summerschool.icecreamshop.service.ProductService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;


import java.util.List;
import java.util.stream.Collectors;


@RestController
@RequestMapping(path = "/products")
public class ProductController {
    private ProductService productService;

    private ModelMapper modelMapper;

    @Autowired
    public ProductController(ProductService productService, ModelMapper modelMapper) {
        this.productService = productService;
        this.modelMapper = modelMapper;
    }


    @GetMapping
    public ResponseEntity<List<ProductDTO>> getProducts() {
        return ResponseEntity.ok(productService.getAll()
                .stream()
                .map(product -> modelMapper.map(product, ProductDTO.class))
                .collect(Collectors.toList()));
    }

    @PostMapping()
    public ResponseEntity<?> create(@RequestBody Product product) {
        try {
            product = productService.createProduct(product);
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Can't create the produt");
        }
        return ResponseEntity.status(HttpStatus.CREATED).body(product);
}}
