package com.caribbeanexotic.fruits.persistence.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "Country")
public class CountryEntity {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;
    @Column(name = "Code")
    private String code;
    @Column(name = "Description")
    private String description;
}
