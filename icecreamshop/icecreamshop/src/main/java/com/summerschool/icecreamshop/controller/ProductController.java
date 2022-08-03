package com.summerschool.icecreamshop.controller;

import com.summerschool.icecreamshop.model.Product;
import com.summerschool.icecreamshop.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.Optional;

@RestController
public class ProductController {

    @Autowired
    ProductService productService;

    @GetMapping("/products/{productId}")
    ResponseEntity<Optional<Product> > readById(@PathVariable Integer productId) {
        Optional<Product> product = productService.findById(productId);
        if(product.isPresent())
            return new ResponseEntity<>(product, HttpStatus.OK);
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
}
