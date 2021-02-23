package com.caribbeanexotic.fruits.persistence.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "Quality")
public class QualityEntity {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;

    @Column(name = "Code", length = 5, nullable = false)
    private String code;

    @Column(name = "Description", length = 100, nullable = false)
    private String description;
}
