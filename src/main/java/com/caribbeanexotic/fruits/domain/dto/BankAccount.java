package com.caribbeanexotic.fruits.domain.dto;

import lombok.Data;

@Data
public class BankAccount {
    private Integer id;
    private Integer bankId;
    private Integer bankAccountType;
    private String contact;
    private String number;
}
