package com.summerschool.icecreamshop.repository;

import com.summerschool.icecreamshop.model.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Integer, Product> {
}
