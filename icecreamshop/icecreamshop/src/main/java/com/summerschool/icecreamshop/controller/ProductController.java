package com.summerschool.icecreamshop.controller;

import com.summerschool.icecreamshop.model.Category;
import com.summerschool.icecreamshop.model.Product;
import com.summerschool.icecreamshop.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    ProductService productService;
    @PostMapping()
    public ResponseEntity<?> create(@RequestBody Product product) {
        try {
            product = productService.createProduct(product);
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Can't create the produt");
        }
        return ResponseEntity.status(HttpStatus.CREATED).body(product);
    }
    @GetMapping("/{productId}")
    public ResponseEntity<Product> readById(@PathVariable Long productId) {
        Optional<Product> optionalProduct = productService.findById(productId);
        return optionalProduct.map(product -> new ResponseEntity<>(product, HttpStatus.OK)).orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }
}
