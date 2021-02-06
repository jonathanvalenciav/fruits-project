package com.caribbeanexotic.fruits.persistence.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "BankAccount")
public class BankAccountEntity {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "BankId")
    private Integer bankId;
    @Column(name = "BankAccountType")
    private Integer bankAccountTypeId;
    @Column(name = "Contact")
    private String contactId;
    @Column(name = "Number")
    private String number;
    @ManyToOne
    @JoinColumn(name = "bankId",insertable = false,updatable = false)
    private BankEntity bank;
    @ManyToOne
    @JoinColumn(name = "bankAccountType",insertable = false,updatable = false)
    private BankAccountTypeEntity bankAccountType;
    @ManyToOne
    @JoinColumn(name = "contact",insertable = false,updatable = false)
    private ContactEntity contact;
}
