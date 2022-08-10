package com.summerschool.icecreamshop.service;

import com.summerschool.icecreamshop.model.Product;
import com.summerschool.icecreamshop.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    private final ProductRepository productRepository;

    @Autowired
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> getAll() {
        return productRepository.findAll();
    }

    public void add(Product product){
        productRepository.save(product);
    }

    public boolean isProductValid(Product product){
        if (product.getTitle().isEmpty()
            || product.getShortDescription().isEmpty()
            || product.getLongDescription().isEmpty()
            || product.getIngredients().isEmpty()
            || product.getQuantity() != 0
            || product.getAlergens().isEmpty()
            || product.getPrice() != 0
            || product.getCurrency().isEmpty()
            || product.getPhotoUrl().isEmpty()) {
            return false;
        } else {
            return true;
        }
    }

}
