package com.hardnets.presupuesto.service.impl;

import com.hardnets.presupuesto.domain.response.CategoryResponse;
import com.hardnets.presupuesto.repository.CategoryRepository;
import com.hardnets.presupuesto.service.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class CategoryImpl implements CategoryService {
    private final CategoryRepository categoryRepository;

    @Override
    public List<CategoryResponse> getAll(int father) {
        return father == 0 ? categoryRepository.findWithoutFather() : categoryRepository.findByFather(father);
    }
}
