package com.caribbeanexotic.fruits.persistence.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "BankAccountType")
public class BankAccountTypeEntity {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;

    @Column(name = "Code", length = 8, nullable = false)
    private String code;

    @Column(name = "Name", length = 40, nullable = false)
    private String name;
}
