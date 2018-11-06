package com.hardnets.presupuesto.repository;

import com.hardnets.presupuesto.domain.entity.OperationEntity;
import com.hardnets.presupuesto.domain.response.OperationResponse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface OperationRepository extends JpaRepository<OperationEntity, Long> {
    @Query("SELECT NEW com.hardnets.presupuesto.domain.response.OperationResponse(op.id, op.description, op.amount, op.date) FROM OperationEntity op")
    List<OperationResponse> findByDateInserted();
}
