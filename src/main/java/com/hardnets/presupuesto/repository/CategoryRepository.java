package com.hardnets.presupuesto.repository;

import com.hardnets.presupuesto.domain.entity.CategoryEntity;
import com.hardnets.presupuesto.domain.response.CategoryResponse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CategoryRepository extends JpaRepository<CategoryEntity, Long> {
    @Query("SELECT NEW com.hardnets.presupuesto.domain.response.CategoryResponse(c.id, c.name) FROM CategoryEntity c " +
            "WHERE c.father.id = ?1")
    List<CategoryResponse> findByFather(int fatherId);

    @Query("SELECT NEW com.hardnets.presupuesto.domain.response.CategoryResponse(c.id, c.name) FROM CategoryEntity c " +
            "WHERE c.father IS NULL")
    List<CategoryResponse> findWithoutFather();
}
