package com.hardnets.presupuesto.controller;

import com.hardnets.presupuesto.domain.response.CategoryResponse;
import com.hardnets.presupuesto.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/category", produces = "application/json")
public class CategoryController {
    @Autowired
    CategoryService categoryService;

    public CategoryController(CategoryService categoryService){this.categoryService = categoryService;}

    @GetMapping("/")
    List<CategoryResponse> getAll(){
        return categoryService.getAll(0);
    }

    @GetMapping("/{id}")
    List<CategoryResponse> getAllByFather(@PathVariable int id){
        return categoryService.getAll(id);
    }

}
