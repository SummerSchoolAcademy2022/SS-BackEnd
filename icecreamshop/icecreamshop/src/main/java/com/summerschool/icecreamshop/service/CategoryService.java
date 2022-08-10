package com.summerschool.icecreamshop.service;

import com.summerschool.icecreamshop.model.Category;
import com.summerschool.icecreamshop.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;

import com.summerschool.icecreamshop.exceptions.ResourceNotFoundException;
import com.summerschool.icecreamshop.model.Category;
import com.summerschool.icecreamshop.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
@Service
public class CategoryService {
    @Autowired
    CategoryRepository categoryRepository;
    public Category createCategory(Category category) {
        if (category.getId()== null) {
            category = categoryRepository.save(category);
            return  category;
        } else {
            Optional<Category> categoryOptional = categoryRepository.findById(categoryRepository.getId());

            if (categoryOptional.isPresent()){
                Category newCategory = categoryOptional.get();
                newCategory.setName(newCategory.getName());
                newCategory.setProductList(newCategory.getProductList());

                newCategory.setDescription(newCategory.getDescription());

                newCategory = categoryRepository.save(newCategory);

                return newCategory;
            } else {
                throw new ResourceNotFoundException("No employee record exist for given id");
            }
        }
    }

    public List<Category> findAll() {
        List<Category> result =  categoryRepository.findAll();

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
        if (result.size() > 0) {
            return result;
        } else {
            return new ArrayList<>();
        }
    }

    public void deleteById(Long id) {
        Optional<Category> category = categoryRepository.findById(id);

        if (category.isPresent()) {
            categoryRepository.deleteById(id);
        } else {
            throw new ResourceNotFoundException("Error 404 nu s-a gasit categorie dupa id");
        }
    }

    void deleteAll() {
        categoryRepository.deleteAll();
    }

    public Category update(Category request, long categoryId) {

        if (categoryRepository.findById(categoryId).isPresent()) {
            request.setId(categoryId);
            categoryRepository.update(request);

        } else {
            throw new ResourceNotFoundException("Error 404 nu s-a gasit cos dupa id");
        }
        return categoryRepository.findById(categoryId).get();

    }

    public Category findById(Long categoryId) {
        return  categoryRepository.findById(categoryId)
                .orElseThrow(() -> new ResourceNotFoundException( "Error 404 basket not found"));
    }


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



