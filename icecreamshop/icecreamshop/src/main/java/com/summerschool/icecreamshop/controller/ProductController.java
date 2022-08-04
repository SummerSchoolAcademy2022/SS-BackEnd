package com.summerschool.icecreamshop.controller;

import com.summerschool.icecreamshop.model.Product;
import com.summerschool.icecreamshop.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Optional;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    ProductService productService;

    @GetMapping("/{productId}")
    public ResponseEntity<Product> readById(@PathVariable Integer productId) {
        Optional<Product> optionalProduct = productService.findById(productId);
        return optionalProduct.map(product -> new ResponseEntity<>(product, HttpStatus.OK)).orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PatchMapping("/{productId}")
    public ResponseEntity<Product> update(@Valid @RequestBody Product product, @PathVariable Integer productId) {
        if (!productId.equals(product.getId())) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        if (productService.findById(productId).isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(productService.update(product), HttpStatus.OK);
    }
}
