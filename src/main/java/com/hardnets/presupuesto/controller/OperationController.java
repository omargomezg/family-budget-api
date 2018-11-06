package com.hardnets.presupuesto.controller;

import com.hardnets.presupuesto.domain.request.OperationCreateRequest;
import com.hardnets.presupuesto.domain.response.OperationResponse;
import com.hardnets.presupuesto.service.OperationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/operation", produces = "application/json")
public class OperationController {
    @Autowired
    OperationService operationService;

    public OperationController(OperationService operationService) {
        this.operationService = operationService;
    }

    @GetMapping("/{month}/{year}")
    List<OperationResponse> getAll(@PathVariable int month, @PathVariable int year) {
        return operationService.getAllByDate(year, month);
    }

    @PostMapping()
    void insertOperation(@RequestBody OperationCreateRequest data) {
        operationService.addNewOperation(data);
    }


}
