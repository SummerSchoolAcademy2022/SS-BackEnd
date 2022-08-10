package com.summerschool.icecreamshop.service;

import com.summerschool.icecreamshop.model.Product;
import com.summerschool.icecreamshop.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    private final ProductRepository productRepository;

    @Autowired
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public Product update(Product product, Long id) {
        product.setId(id);
        return productRepository.save(product);
    }

    public Optional<Product> findById(Long id) {
        return productRepository.findById(id);
    }

    public List<Product> getAll() {
        return productRepository.findAll();
    }
}
