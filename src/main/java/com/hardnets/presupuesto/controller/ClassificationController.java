package com.hardnets.presupuesto.controller;

import com.hardnets.presupuesto.domain.entity.ClassificationEntity;
import com.hardnets.presupuesto.service.ClassificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/classification", produces = "application/json")
public class ClassificationController {
    @Autowired
    ClassificationService classificationService;

    public ClassificationController(ClassificationService classificationService) {
        this.classificationService = classificationService;
    }

    @GetMapping("/")
    public List<ClassificationEntity> getAllClassifications() {
        return classificationService.getClassifications();
    }
}
