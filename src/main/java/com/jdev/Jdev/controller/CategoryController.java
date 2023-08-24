package com.jdev.Jdev.controller;

import com.jdev.Jdev.controller.exception.CategoryNotFoundException;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import com.jdev.Jdev.repository.CategoryRepository;
import com.jdev.Jdev.model.Category;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@RestController
@RequestMapping("/categories")
public class CategoryController {

    @Autowired
    private CategoryRepository categoryRepository;

    @GetMapping
    public List<Category> getAll() {
        return categoryRepository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Category> getById(@PathVariable Long id) {
        return categoryRepository.findById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Category create(@RequestBody Category category) {
        return categoryRepository.save(category);
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable Long id) {
        categoryRepository.deleteById(id);
        return "Category deleted Successfully";
    }

    @PutMapping("/{id}")
    public String update(@PathVariable Long id, @RequestBody Category newCategory) {
        try {
            Category category = categoryRepository.findById(id).get();
            String newName = newCategory.getName();

            if (newName != null && !newName.trim().isEmpty()) {
                BeanUtils.copyProperties(newCategory, category, "id");
                categoryRepository.save(category);
                return "updated client";
            } else {
                return "invalid name";
            }

        } catch (NoSuchElementException e) {
            throw new CategoryNotFoundException("Error: Category with ID " + id + " not found in the database");
        }

    }
}

