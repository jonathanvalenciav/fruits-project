package com.caribbeanexotic.fruits.domain.dto;

import lombok.Data;

@Data
public class BankAccount {
    private Integer id;
    private Bank bank;
    private BankAccountType bankAccountType;
    private Contact contact;
    private String number;
}
