package com.banking_services.core.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Account {
    private String id;
    private String accountNumber;
    private String userId;
    private String status;
    private Balance balance;
    private Transaction transaction;
}
