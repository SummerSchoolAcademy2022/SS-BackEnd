package com.summerschool.icecreamshop.service;

import com.summerschool.icecreamshop.model.Category;
import com.summerschool.icecreamshop.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {

    private final CategoryRepository categoryRepository;

    @Autowired
    public CategoryService(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    public Category add(Category category) {
        try {
            return categoryRepository.save(category);
        } catch (Exception e) {
            return null;
        }
    }

    public Optional<Category> get(Long id) {
        return categoryRepository.findById(id);
    }

    public Category patch(Category category) {

        try {
            return categoryRepository.save(category);
        } catch (Exception e) {
            return null;
        }

    }

    public List<Category> getAll() {
        return categoryRepository.findAll();
    }

}



