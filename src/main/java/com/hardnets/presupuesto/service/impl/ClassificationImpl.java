package com.hardnets.presupuesto.service.impl;

import com.hardnets.presupuesto.domain.entity.ClassificationEntity;
import com.hardnets.presupuesto.repository.ClassificationRepository;
import com.hardnets.presupuesto.service.ClassificationService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class ClassificationImpl implements ClassificationService {

    private final ClassificationRepository classificationRepository;

    @Override
    public List<ClassificationEntity> getClassifications() {
        return classificationRepository.findAll();
    }
}
