package com.summerschool.icecreamshop.service;

import com.summerschool.icecreamshop.model.Product;
import com.summerschool.icecreamshop.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProductService {
    @Autowired
    ProductRepository productRepository;

    public Product update(Product product) {
        return productRepository.save(product);
    }

    public Optional<Product> findById(Integer id) {
        return productRepository.findById(id);
    }
}
