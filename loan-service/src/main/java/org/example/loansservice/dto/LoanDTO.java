package org.example.loansservice.dto;

import lombok.Data;

@Data
public class LoanDTO {
    private Long id;
    private Long accountId;
    private Double amount;
    private String loanType;
    private String startDate;
    private String endDate;
}
