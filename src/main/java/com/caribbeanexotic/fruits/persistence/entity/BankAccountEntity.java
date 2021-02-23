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

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "Bank", nullable = false)
    private BankEntity bank;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "BankAccountType", nullable = false)
    private BankAccountTypeEntity bankAccountType;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "Contact", nullable = false)
    private ContactEntity contact;

    @Column(name = "Number", length = 20, nullable = false)
    private String number;
}
