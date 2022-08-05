package com.summerschool.icecreamshop.repository;

import com.summerschool.icecreamshop.model.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends CrudRepository<Product, Long> {

}
