package com.hardnets.presupuesto.service.impl;

import com.hardnets.presupuesto.domain.entity.CategoryEntity;
import com.hardnets.presupuesto.domain.entity.OperationEntity;
import com.hardnets.presupuesto.domain.request.OperationCreateRequest;
import com.hardnets.presupuesto.domain.response.OperationResponse;
import com.hardnets.presupuesto.repository.OperationRepository;
import com.hardnets.presupuesto.service.OperationService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

@Service
public class OperationImpl implements OperationService {

    private OperationRepository operationRepository;

    public OperationImpl(OperationRepository operationRepository){ this.operationRepository = operationRepository;}

    @Transactional
    @Override
    public void addNewOperation(OperationCreateRequest data) {
        CategoryEntity categoryEntity = new CategoryEntity();
        OperationEntity operationEntity = new OperationEntity();

        operationEntity.setDescription(data.getDescription());
        operationEntity.setAmount(data.getAmount());
        operationEntity.setDate(new Date());

        categoryEntity.setId(data.getCategoryId());
        operationEntity.setCategory(categoryEntity);
        operationRepository.save(operationEntity);
    }

    @Override
    public List<OperationResponse> getAllByDate(int year, int month) {
        return operationRepository.findByDateInserted();
    }
}
