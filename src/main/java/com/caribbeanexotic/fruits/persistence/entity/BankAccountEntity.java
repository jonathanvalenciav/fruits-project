package com.caribbeanexotic.fruits.persistence.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "BankAccount")
public class BankAccountEntity {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;
    @Column(name = "BankId")
    private Integer bankId;
    @Column(name = "BankAccountType")
    private Integer bankAccountType;
    @Column(name = "Contact")
    private String contact;
    @Column(name = "Number")
    private String number;
}
