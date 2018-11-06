package com.hardnets.presupuesto.service;

import com.hardnets.presupuesto.domain.response.CategoryResponse;

import java.util.List;

public interface CategoryService {
    List<CategoryResponse> getAll(int father);
}
