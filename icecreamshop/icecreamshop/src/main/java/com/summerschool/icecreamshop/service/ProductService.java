package com.summerschool.icecreamshop.service;

import com.summerschool.icecreamshop.model.Product;
import com.summerschool.icecreamshop.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.util.ReflectionUtils;

import java.lang.reflect.Field;
import java.util.List;
import java.util.Map;
import java.util.Optional;

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

    public Optional<Product> getById(Long idProduct) {
        return productRepository.findById(idProduct);
    }

    public Product save(Product product) {
        return productRepository.save(product);
    }


    public ResponseEntity updateProductWithMap(Long idProduct, Map<Object, Object> objectMap) {
        Optional<Product> optionalProduct = productRepository.findById(idProduct);
        if(optionalProduct.isEmpty()) {
            return new ResponseEntity(HttpStatus.NOT_FOUND);
        }
        Product product = optionalProduct.get();
        objectMap.forEach((key, value) -> {
            Field field = ReflectionUtils.findField(Product.class, (String) key);
            field.setAccessible(true);
            ReflectionUtils.setField(field, product, value);
        });
        productRepository.save(product);
        return new ResponseEntity<>(product, HttpStatus.OK);
    }
}
