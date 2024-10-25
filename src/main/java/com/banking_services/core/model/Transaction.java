package com.banking_services.core.model;

import java.math.BigDecimal;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Transaction {
    private String id;
    private String fromAccountNo;
    private String toAccountNo;
    private String accountType;
    private BigDecimal amount;
}
