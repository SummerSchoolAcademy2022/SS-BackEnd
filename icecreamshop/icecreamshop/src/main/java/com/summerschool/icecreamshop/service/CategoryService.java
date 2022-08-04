package com.summerschool.icecreamshop.service;

import com.summerschool.icecreamshop.model.Category;
import com.summerschool.icecreamshop.model.Student;
import com.summerschool.icecreamshop.repository.CategoryRepository;
import com.summerschool.icecreamshop.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CategoryService {
    @Autowired
    CategoryRepository categoryRepository;

    //getting all student records
    public List<Category> getAllCategory() {
        List<Category> categories = new ArrayList<Category>();
        categoryRepository.findAll().forEach(category -> categories.add(category));
        return categories;
    }

    //getting a specific record
    public Category getCategoryById(int id) {
        return categoryRepository.findById(id).get();
    }

    public void saveOrUpdate(Category category) {
        categoryRepository.save(category);
    }

    //deleting a specific record
    public void delete(int id) {
        categoryRepository.deleteById(id);
    }
}
