package com.summerschool.icecreamshop.controller;
import java.util.List;
import com.summerschool.icecreamshop.model.Category;
import com.summerschool.icecreamshop.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
public class CategoryController {
    //autowired the StudentService class
    @Autowired
    CategoryService categoryService;

    //creating a get mapping that retrieves all the students detail from the database
    @GetMapping("/category")
    private List<Category> getAllCategory() {
        return categoryService.getAllCategory();
    }

    //creating a get mapping that retrieves the detail of a specific student
    @GetMapping("/category/{id}")
    private Category getCategory(@PathVariable("id") int id) {
        return categoryService.getCategoryById(id);
    }

    //creating a delete mapping that deletes a specific student
    @DeleteMapping("/category/{id}")
    private void deleteCategory(@PathVariable("id") int id) {
        categoryService.delete(id);
    }

    //creating post mapping that post the student detail in the database
    @PostMapping("/category")
    private int saveCategory(@RequestBody Category category) {
        categoryService.saveOrUpdate(category);
        return category.getId();
    }
}
