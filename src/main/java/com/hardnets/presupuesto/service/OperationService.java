package com.hardnets.presupuesto.service;

import com.hardnets.presupuesto.domain.request.OperationCreateRequest;
import com.hardnets.presupuesto.domain.response.OperationResponse;

import java.util.List;

public interface OperationService {
    void addNewOperation(OperationCreateRequest data);
    List<OperationResponse> getAllByDate(int year, int month);
}
