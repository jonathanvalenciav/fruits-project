package com.caribbeanexotic.fruits.persistence.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "IdentificationType")
public class IdentificationTypeEntity {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;

    @Column(name = "Code", length = 3, nullable = false)
    private String code;

    @Column(name = "Description", length = 50, nullable = false)
    private String description;
}
