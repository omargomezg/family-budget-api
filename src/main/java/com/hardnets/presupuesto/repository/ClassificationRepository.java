package com.hardnets.presupuesto.repository;

import com.hardnets.presupuesto.domain.entity.ClassificationEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClassificationRepository extends JpaRepository<ClassificationEntity, Long> {

}
