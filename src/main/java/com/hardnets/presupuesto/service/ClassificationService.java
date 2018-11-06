package com.hardnets.presupuesto.service;

import com.hardnets.presupuesto.domain.entity.ClassificationEntity;

import java.util.List;

public interface ClassificationService {
    List<ClassificationEntity> getClassifications();
}
