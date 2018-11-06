package com.hardnets.presupuesto.domain.request;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class OperationCreateRequest {
    private String description;
    private BigDecimal amount;
    private int categoryId;
}
