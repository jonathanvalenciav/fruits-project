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

    @Column(name = "Code", length = 10, nullable = false)
    private String code;

    @Column(name = "Name", length = 100, nullable = false)
    private String name;

    @Column(name = "Address", length = 100, nullable = false)
    private String address;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "City", nullable = false)
    private CityEntity city;

    @Column(name = "ICACertificate", length = 15, nullable = false)
    private String ICACertificate;

    @Column(name = "GlobalGAPCertificate", length = 15)
    private String globalGAPCertificate;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "Provider", nullable = false)
    private ContactEntity provider;
}
