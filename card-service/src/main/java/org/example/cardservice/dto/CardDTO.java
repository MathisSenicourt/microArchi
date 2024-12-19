package org.example.cardservice.dto;

import lombok.Data;

@Data
public class CardDTO {
    private Long id;
    private Long accountId;
    private String cardNumber;
    private String cardType;
    private String expirationDate;
}
