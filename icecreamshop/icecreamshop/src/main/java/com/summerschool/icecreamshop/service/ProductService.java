package com.summerschool.icecreamshop.service;

import com.summerschool.icecreamshop.exceptions.ResourceNotFoundException;
import com.summerschool.icecreamshop.model.Product;
import com.summerschool.icecreamshop.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
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
    public Product createProduct(Product product) {
        if (product.getId() == null) {
            product = productRepository.save(product);
            return product;
        } else {
            Optional<Product> productOptional = productRepository.findById(productRepository.getId());

            if (productOptional.isPresent()) {
                Product newProduct = productOptional.get();
                newProduct.setTitle(newProduct.getTitle());
                newProduct.setIngredients(newProduct.getIngredients());
                newProduct.setAlergens(newProduct.getAlergens());
                newProduct.setCurrency(newProduct.getCurrency());
                newProduct.setShortDescription(newProduct.getShortDescription());
                newProduct.setLongDescription(newProduct.getLongDescription());
                newProduct.setPhotoUrl(newProduct.getPhotoUrl());
                newProduct.setPrice(newProduct.getPrice());
                newProduct.setType(newProduct.getType());
                newProduct.setQuantity(newProduct.getQuantity());
                newProduct.setBasketProduct(newProduct.getBasketProduct());
                newProduct.setRate(newProduct.getRate());
                newProduct = productRepository.save(newProduct);
                return newProduct;
            } else {
                throw new ResourceNotFoundException("No employee record exist for given id");
            }
        }
    }


}
