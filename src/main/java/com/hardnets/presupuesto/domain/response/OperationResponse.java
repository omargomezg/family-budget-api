package com.hardnets.presupuesto.domain.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
public class OperationResponse {
    private int id;
    private String description;
    private BigDecimal amount;
    private Date date;

}
