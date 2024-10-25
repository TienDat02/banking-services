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
public class Balance {
    private String id;
    private String accountNumber;
    private BigDecimal amount;
}
