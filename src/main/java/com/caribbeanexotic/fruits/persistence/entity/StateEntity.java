package com.caribbeanexotic.fruits.persistence.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "State")
public class StateEntity {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;
    @Column(name = "Code")
    private String code;
    @Column(name = "Name")
    private String name;
    @Column(name = "Country")
    private Integer countryId;

    @ManyToOne
    @JoinColumn(name = "country",insertable = false,updatable = false)
    private CountryEntity country;
}
