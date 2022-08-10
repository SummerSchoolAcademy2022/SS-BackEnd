package com.summerschool.icecreamshop.controller;

import com.summerschool.icecreamshop.dto.ProductDTO;
import com.summerschool.icecreamshop.model.Product;
import com.summerschool.icecreamshop.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping(path = "/products")
public class ProductController {

    @Autowired
    private ProductService productService;


    @GetMapping("/{productId}")
    public ResponseEntity<ProductDTO> readById(@PathVariable("productId") Long productId) {
        Optional<Product> productOptional = productService.findById(productId);
        return productOptional.map(product -> ResponseEntity.ok(product.convertToProductDTO())).orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

}
