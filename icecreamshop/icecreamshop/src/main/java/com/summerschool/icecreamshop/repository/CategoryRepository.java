package com.summerschool.icecreamshop.repository;

import com.summerschool.icecreamshop.model.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Integer, Category> {
}
