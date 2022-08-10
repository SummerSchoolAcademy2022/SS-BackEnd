//package com.summerschool.icecreamshop.controller;
//
//import com.summerschool.icecreamshop.dto.ProductDTO;
//import com.summerschool.icecreamshop.model.Product;
//import com.summerschool.icecreamshop.model.ProductType;
//import com.summerschool.icecreamshop.service.ProductService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//import org.springframework.web.bind.annotation.GetMapping;
//
//import javax.persistence.*;
//import java.util.List;
//import java.util.Optional;
//import java.util.stream.Collectors;
//
//@RestController
//@RequestMapping("/products")
public class ProductController {
//
//    @Autowired
//    ProductService productService;
//    private ModelMapper modelMapper;
//    public ProductService(ProductService categoryService, ModelMapper modelMapper) {
//        this.productService = categoryService;
//        this.modelMapper = modelMapper;
//    }
//    @GetMapping
//    public ResponseEntity<List<ProductDTO>> getCategories() {
//        return ResponseEntity.ok(ProductService.getAll()
//                .stream()
//                .map(category -> modelMapper.map(category, ProductDTO.class))
//                .collect(Collectors.toList()));
//    }
////    @GetMapping("/{productId}")
////    public ResponseEntity<Product> readById(@PathVariable Long productId) {
////        Optional<Product> optionalProduct = productService.findById(productId);
////        return optionalProduct.map(product -> new ResponseEntity<>(product, HttpStatus.OK)).orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
////    }
//
//    @GetMapping()
//    public ResponseEntity<List<ProductDTO>> getAll() {
//        List<ProductDTO> products = productService.getAll();
//        return new ResponseEntity<>(products, HttpStatus.OK);
//    }
//
//
//}


