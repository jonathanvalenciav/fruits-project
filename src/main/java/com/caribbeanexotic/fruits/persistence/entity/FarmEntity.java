package com.caribbeanexotic.fruits.persistence.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "Farm")
public class FarmEntity {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;
    @Column(name = "Code")
    private String code;
    @Column(name = "Name")
    private String name;
    @Column(name = "Address")
    private String address;
    @Column(name = "City")
    private Integer city;
    @Column(name = "ICACertificate")
    private String aICACertificate;
    @Column(name = "GlobalGAPCertificate")
    private String globalGAPCertificate;
    @Column(name = "Provider")
    private Integer provider;
}
